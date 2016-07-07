<%--
  Created by IntelliJ IDEA.
  User: Philippe
  Date: 2016-07-07
  Time: 3:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/leaflet.css"/>
    <link href='https://api.mapbox.com/mapbox.js/plugins/leaflet-markercluster/v0.4.0/MarkerCluster.css'
          rel='stylesheet'/>
    <link href='https://api.mapbox.com/mapbox.js/plugins/leaflet-markercluster/v0.4.0/MarkerCluster.Default.css'
          rel='stylesheet'/>

    <script src="https://code.jquery.com/jquery-2.2.3.min.js"
            integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo=" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
            crossorigin="anonymous"></script>


    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/leaflet.js"></script>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/leaflet.js"></script>
    <script type='text/javascript'
            src='https://cdnjs.cloudflare.com/ajax/libs/leaflet.markercluster/0.4.0/leaflet.markercluster.js'></script>
    <link rel="stylesheet" href="css/styles.css" type="text/css"/>
    <script>getHome()</script>
</head>
<body>
<div id="menu">
    <ul>
        <li><a onclick="getHome()"> Home </a></li>
        <li><a onclick="getMap()"> Map </a></li>
        <li><a href=""> Pokedex </a></li>
    </ul>
</div>
<div id="mainContainer">

</div>
</body>
<footer>
    <div id="info" style="position:fixed;bottom:0;left:0;right:0;height:50px;">
        <p>Please share features you would like to see
            in the future! To add a new suggestion, please
            create an ISSUE in Github at:
            <a href="https://github.com/Deasel011/Pokechase/issues">https://github.com/Deasel011/Pokechase/issues</a></p>
    </div>

</footer>
</html>
