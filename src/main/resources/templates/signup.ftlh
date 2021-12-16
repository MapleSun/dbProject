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
              <label for="inputPassword" class="">Username</label>
            <input type="text" name="username" class="form-control" placeholder="username" required>
            <br>
              <label for="email" class="">Email address</label>
              <input type="email" name="cEmail" class="form-control" placeholder="Email address" required autofocus>
              <br>
              <label for="inputPassword" class="">Password</label>
              <input type="password" name="cPassword" class="form-control" placeholder="Password" required>
              <br>
                <label for="inputPassword" class="">First Name</label>
                <input type="text" name="fname" class="form-control" placeholder="First Name" required>
                <br>
                <label for="inputPassword" class="">Last Name</label>
                <input type="text" name="lname" class="form-control" placeholder="Last Name" required>
                <br>
                <label for="inputPassword" class="">Nationality</label>
                <input type="text" name="nationality" class="form-control" placeholder="Nationality" required>
                <br>
                <label for="inputPassword" class="">Gender</label>
                <input type="text" name="gender" class="form-control" placeholder="F/M" required>
                <br>
                <label for="passportNumber" class="">Passport Number</label>
                <input type="text" name="passportNumber" class="form-control" placeholder="passportNumber" required>
                <br>
                <label for="inputPassword" class="">DOB</label>
                <input type="date" name="DOB" class="form-control" placeholder="" required>
                <br>
                <label for="inputPassword" class="">Passport Exp Date</label>
                <input type="date" name="passExpDate" class="form-control" placeholder="YYYY-MM-DD" required>
                <label for="inputPassword" class="">Street</label>
                <input type="text" name="cStreet" class="form-control" placeholder="" required>
                <br>

                <label for="inputPassword" class="">City</label>
                <input type="text" name="cCity" class="form-control" placeholder="" required>
                <br>
                <label for="inputPassword" class="">Country</label>
                <input type="text" name="cCountry" class="form-control" placeholder="" required>
                <br>

                <label for="inputPassword" class="">Contact Num</label>
                <input type="text" name="cContactNum" class="form-control" placeholder="" required>
                <br>

                <label for="inputPassword" class="">Emg First Name</label>
                <input type="text" name="cERFname" class="form-control" placeholder="" required>
                <br>
                <label for="passportNumber" class="">Emg Last Name</label>
                <input type="text" name="cERLname" class="form-control" placeholder="" required>
                <br>
                <label for="inputPassword" class="">Emg Contact Num</label>
                <input type="text" name="cERContactNum" class="form-control" placeholder="" required>
                <br>

                  <label for="inputPassword" class="">Emg Cont Code</label>
                  <input type="text" name="cEContCode" class="form-control" placeholder="" required>
                <br>


              <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </form>
    </div>
    <#include "footer.ftlh" parse=true encoding="utf-8">
</body>
</html>