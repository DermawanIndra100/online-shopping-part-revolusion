<div class="container">
	
		<h1>Contact Us</h1>
		<br>
		<p class="text-info">Himpunan Mahasiswa Islam, JL. Cilosari, 17, Jakarta, 10330, RT.8/RW.4, Cikini, Central Jakarta City, Jakarta </p>

</div>

<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Simple Markers</title>
    <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
  </head>
  <body>
    <div id="map"></div>
    <script>

      function initMap() {
        var myLatLng = {lat: -6.196516, lng: 106.841829};

        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 19,
          center: myLatLng
        });

        marker = new google.maps.Marker({
            map: map,
            draggable: true,
            animation: google.maps.Animation.DROP,
            position: myLatLng,
            title: 'HMI-YAI'
          });
          marker.addListener('click', toggleBounce);
        }

        function toggleBounce() {
          if (marker.getAnimation() !== null) {
            marker.setAnimation(null);
          } else {
            marker.setAnimation(google.maps.Animation.BOUNCE);
          }
        }
      
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=API_MASUKIN_SINI&callback=initMap"> 
    </script>
  </body>
</html>