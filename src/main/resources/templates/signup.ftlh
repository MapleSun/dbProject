<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <#include "header.ftlh" parse=true encoding="utf-8">
    <div class="container">
      <form class="form-signin" action="/signup" method="post">
              <h2 class="form-signin-heading">Please sign in</h2>
              <label for="inputPassword" class="sr-only">Username</label>
            <input type="text" name="username" class="form-control" placeholder="username" required>
            <br>
              <label for="email" class="sr-only">Email address</label>
              <input type="text" name="email" class="form-control" placeholder="Email address" required autofocus>
              <br>
              <label for="inputPassword" class="sr-only">Password</label>
              <input type="text" name="password" class="form-control" placeholder="Password" required>
              <br>
              <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </form>
    </div>
    <#include "footer.ftlh" parse=true encoding="utf-8">
</body>
</html>