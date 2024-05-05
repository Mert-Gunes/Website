<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login</h2>
    <form action="login" method="post">
        <div>
            <label for="username">Kullanıcı Adı:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="password">Şifre:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
            <label for="rememberMe">Sonraki Girişte Tanı</label>
            <input type="checkbox" id="rememberMe" name="rememberMe">
        </div>
        <div>
            <input type="submit" value="Giriş Yap">
        </div>
    </form>
</body>
</html>
