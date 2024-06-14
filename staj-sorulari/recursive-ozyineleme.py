#Özyineleme/Recursive kullandım.

def FirstFactorial(num):
  if num == 1:
    return num
  else:
    return num*FirstFactorial(num-1)


  # code goes here
  return num

# keep this function call here 
print(FirstFactorial(input()))