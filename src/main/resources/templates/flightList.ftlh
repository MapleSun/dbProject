<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <#include "header.ftlh" parse=true encoding="utf-8">
    <div class="container">
      <hr/>
        <table class="table">
          <thead>
            <tr>
              <th>Passenger</th>
              <th>Flight</th>
              <th>Airline</th>
              <th>Airport</th>
              <th>Insurance</th>
            </tr>
          </thead>
          <tbody>
          <#if (flight.passenger)??>
            <tr>
              <td>${flight.passenger.fname}</td>
              <td>${flight.flight.flightNumber}</td>
              <td>${flight.airline.name}</td>
              <td>${flight.airport.name}</td>
              <td style="width:300px;" onclick="document.location.href='/insurance/flightId=${flight.flight.id}'" style="cursor:pointer;"><a>buy</a><td>
            </tr>
            </#if>
          </tbody>
        </table>
      <hr/>
    </div>
    <#include "footer.ftlh" parse=true encoding="utf-8">
</body>
</html>