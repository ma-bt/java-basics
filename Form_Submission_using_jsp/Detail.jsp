<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Print Student Details</title>
  </head>
  <body>
    <h1>Student Details</h1>
    <% String name = request.getParameter('name'); String roll
    =request.getParameter('roll'); String address
    =request.getParameter('address'); %> Name: <%name%><br />
    Roll No.: <%roll%><br />
    Address: <%address%><br />
  </body>
</html>
