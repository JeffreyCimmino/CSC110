println("What is the radius of the circle in centimeters?");
val r: Double = readLine().toDouble;
val pi = scala.math.Pi;
val x = ((r * r) * pi);
val xFinal = (scala.math.BigDecimal(x).setScale(0, BigDecimal.RoundingMode.HALF_UP).toDouble).toInt;
println("The area of a circle of radius " + r + " cm is " + xFinal + " cm^2.");
