class PDA:
    def __init__(self):
        self.stack = []
        self.state = "q0"
        self.valid_operators = {'+', '-', '*', '/'}

    def transition(self, char):
        if self.state == "q0":
            if char.isdigit():
                self.state = "q1"
            elif char == '(':
                self.stack.append(char)
                self.state = "q0"
            else:
                self.state = "error"

        elif self.state == "q1":
            if char in self.valid_operators:
                self.state = "q2"
            elif char == ')':
                if self.stack and self.stack[-1] == '(':
                    self.stack.pop()
                    self.state = "q1"
                else:
                    self.state = "error"
            elif char.isdigit():
                self.state = "q1"
            else:
                self.state = "error"

        elif self.state == "q2":
            if char.isdigit():
                self.state = "q1"
            elif char == '(':
                self.stack.append(char)
                self.state = "q0"
            else:
                self.state = "error"

    def process_string(self, input_string):
        for char in input_string:
            self.transition(char)
            if self.state == "error":
                return False

        if self.stack:
            return False
        
        return self.state == "q1"

def validate_expression(expression):
    pda = PDA()
    return pda.process_string(expression)

# Test cases
expressions = [
    "(1+2)*(3/4)",
    "((2+3)*(4-1))",
    "(1+2*(3/4)",
    "(1+2)*(3/4))",
    "1+2)*3",
    "(1+2)*(3/4",
    "1+2",
    "((1+2)*3)/4"
]

for expr in expressions:
    print(f"{expr}: {'Valid' if validate_expression(expr) else 'Invalid'}")