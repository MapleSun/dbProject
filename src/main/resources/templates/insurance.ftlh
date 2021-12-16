<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <#include "header.ftlh" parse=true encoding="utf-8">
    <div class="container">
      <form class="form-signin" action="/signup" method="post">
        <h2 class="form-signin-heading">Choose Your Insurance For Your Flight</h2>
        <label for="plan" class="">Insurance Type:</label>
        <select name="plan">
          <option value ="1">Trip Cancellation $20</option>
          <option value ="2">Trip Interruption $30</option>
          <option value ="3">Medical Insurance $20</option>
          <option value="4">Baggage Insurance $50</option>
          <option value="5"> Accidental Death Insurance $20</option>
          <option value="6">All-inclusive Insurance $120</option>
        </select>

      <label for="payment" class="">Payment Method</label>
      <select name="payment1">
        <option value ="debit">Debit Card</option>
        <option value ="credit">Credit Card</option>
      </select>
        <br>
        <label for="payment" class="">Need the Second Card?</label>
        <select name="payment1">
        <option value ="null">Not Necessary</option>
        <option value ="debit">Debit Card</option>
        <option value ="credit">Credit Card</option>
        </select>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Buy Your Insurance</button>
        <br>
        </form>
      <br>

    </div>
    <#include "footer.ftlh" parse=true encoding="utf-8">
</body>
</html>