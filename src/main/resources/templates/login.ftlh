<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <#include "header.ftlh" parse=true encoding="utf-8">
    <div class="container">
      <form class="form-signin" action="/login" method="post">
              <h2 class="form-signin-heading">Please Log in</h2>
              <label for="email" class="">Email address</label>
              <input type="text" name="email" class="form-control" placeholder="Email address" required autofocus>
              <br>
              <label for="password" class="">Password</label>
              <input type="password" name="password" class="form-control" placeholder="Password" required>
              <br>
              <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </form>
    </div>
    <#include "footer.ftlh" parse=true encoding="utf-8">
</body>
</html>