println("What is the radius of the circle in centimeters?");
val r: Double = readLine().toDouble;
val pi = scala.math.Pi;
println("The area of a circle of radius " + r + " cm is " + ((r * r)*pi).toInt + " cm^2.");
