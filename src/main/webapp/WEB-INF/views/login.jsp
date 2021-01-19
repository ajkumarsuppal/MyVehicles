<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vehiculator | Login</title>
  </head>
  <body>
    <h2>User Login</h2>
    <form action="/login" method="post">
      <label>Username</label>
      <input
        type="text"
        name="username"
        placeholder="Username"
        required="true"
      />
      <br />
      <label>Password</label>
      <input
        type="text"
        name="password"
        placeholder="Password"
        required="true"
      />
      <br />
      <button type="submit">Login</button>
    </form>
    <a href="/register">First time? Register here!</a>
  </body>
</html>
