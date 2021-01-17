<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vehiculator | Sign Up</title>
  </head>

  <body>
    <h2>User Registration Page</h2>
    <form action="/register/new" method="post" modelAttribute="user">
      <label for="first_name">First Name</label>
      <form:input
        type="text"
        name="first_name"
        id="first_name"
        placeholder="Enter your First Name"
        path="user.first_name"
      />
      <label for="last_name">Last Name</label>
      <form:input
        type="text"
        name="last_name"
        id="last_name"
        placeholder="Enter your Last Name"
        path="user.last_name"
      />
      <br />
      <label for="gender">Gender</label>
      <form:select name="gender" id="gender" path="user.gender">
        <option value="">Choose One</option>
        <option value="Male">Male</option>
        <option value="Female">Female</option>
        <option value="Other">Other</option>
      </form:select>
      <br />
      <label for="phone_number">Phone Number</label>
      <form:input
        type="text"
        name="phone_number"
        id="phone_number"
        placeholder="Enter your 10 digit Mobile Number"
        path="user.phone_number"
      />
      <label for="address">Address</label>
      <form:input
        type="text"
        name="address"
        id="address"
        placeholder="Enter your Address"
        path="user.address"
      />
      <br />
      <label for="username">Username</label>
      <form:input
        type="text"
        name="username"
        id="username"
        placeholder="Enter your Username"
        path="user.username"
      />
      <br />
      <label for="password">Password</label>
      <form:input
        type="password"
        name="password"
        id="password"
        placeholder="Enter your Password"
        path="user.password"
      />
      <br />
      <button type="submit">Register</button>
    </form>
  </body>
</html>
