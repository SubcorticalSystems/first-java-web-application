<%@ page import="edu.dccc.topelectriccars.ElectricCar"%>
<%@ page import="edu.dccc.topelectriccars.ElectricCarList"%>
<%@ page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Car and Driver Top Electric Cars</title>
</head>
<body>
<br/>

<h1>12 Top Selling Electric Vehicles of 2021</h1>
<%
    // Following 3 lines simulate retrieving data from a database or other data source
    ElectricCarList cl = new ElectricCarList();
    cl.populateElectricCarList();
    ArrayList<ElectricCar> carList = cl.getCarList();

    // Dynamically generate top car list
    for (ElectricCar car: carList ) { %>
<h2><%= car.getRank()%>. <%= car.getModel()%></h2>
<img alt="Image of <%=car.getModel()%>" src="<%=car.getImgSrc()%>">
<ul>
    <li>Base price: <%=car.getFormattedBasePrice()%></li>
    <li>EPA Fuel Economy combined/city/highway: <%=car.getEpaFuelEconomy()%></li>
    <li>EPA Range: <%=car.getEpaMaxRange()%></li>
</ul>
<% } %>
</body>
</html>