<html><head><title>Rebecca Zaldivar Homework 3</title></head>
<body>

<h1>HW03 - Multiplication Table</h1>

<?php

//Rebecca Zaldivar
  if ($_POST) {
    $fcolor=$_POST['color'];
    $base=$_POST['base'];
  } else {
    $fcolor="white";
	$base=2;
	
  }
  $colorlist=array("White"=>"white","Blue"=>"blue","Red"=>"red","Yellow"=>"yellow");
?>
<form method="POST" action="">

<p style="font-size:140%;"> Select a color </p> <select name="color">

<br>
<?php
  foreach($colorlist as $colorname => $color) {
    print "Name:" . $colorname . " code:" . $color . "<br />";
    print "<option value=\"" . $color . "\" ";
    if ($color==$fcolor) {
     print " selected ";
    }

    print ">" . $colorname . " ";
    print "</option>\n";
  }
  
  
echo "\n";

  for ($k=2; $k<=16; $k++) {
    print "\n<input type=\"submit\" name= \"base\" value=\"" . $k . "\" />";
	if (isset($a)) {
  echo "Variable 'a' is set.<br>";
	}
  }
print "<br />";

?>

</select>
</form>


<?php 


echo "<table border=1 style=\"background-color:". $fcolor . ";\" > \n";
print "<td rowspan=2 colspan=2>Multiply</td>";
for ($j = 1; $j<=20; $j++) {
	$thestyle = " style=\"background-color:" . $fcolor .";\"";
	print "<td " . $thestyle . "> \n";
	print $j;
	print "</td>";
}
print "</tr>";
print "<tr>";
for ($j = 1; $j<=20; $j++) {
	  $thestyle = " style=\"background-color:" . $fcolor .";\"";
		print "<td " . $thestyle . ">";
	$convert = base_convert($j, 10, $base);
	print $convert;
    print "</td>";
}

for ($j = 1; $j<=20; $j++) {
print "<tr>";
print "<td>" . $j . "</td>";
print "<td>" . base_convert($j,10,$base) . "</td>";

for($m=1; $m <= 20; $m++) 
{	
$total = base_convert($j*$m,10,$base);
$thestyle = " style=\"background-color:" . $fcolor .";\"";
print "<td " . $thestyle . ">";
echo "$total";
print "</td>";
}
echo "</tr>";
	}
echo "</table>";
?>

</body></html>