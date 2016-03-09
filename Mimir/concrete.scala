println("Please enter the dimensions of the concrete sample in centimeters.")
val w = (readLine().toDouble) * 10;
val h = (readLine().toDouble) * 10;
val d = (readLine().toDouble) * 10;
println("What is the air content of the sample?");
val ac = readLine().toDouble;
val v = scala.math.BigDecimal(w * h * d * ac).setScale(0,BigDecimal.RoundingMode.HALF_UP).toInt;
println("The concrete sample has " + v + " cubic millimeters of air.");
