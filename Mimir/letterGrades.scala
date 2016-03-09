import scala.collection.mutable.ArrayBuffer;
println("How many grades are there?");
val x = readInt();
println("Please enter all " + x + " grades. One per line.");
var grades = ArrayBuffer[Int]();
for(i <- 1 to x){
	grades += readInt();
}

var a = 0;
var b = 0;
var c = 0;
var d = 0;
var f = 0;


for(i <- 1 to x){
	var grade = grades(i-1);

	if(grade >= 90){
		a+= 1;
	}
	else if(grade < 90 && grade >= 80){
		b += 1;
	}
	else if(grade < 80 && grade >= 70){
		c += 1;
	}
	else if(grade < 70 && grade >= 60){
		d += 1;
	}
	else if(grade < 60){
		f += 1;
	}

}

println("A: " + a);
println("B: " + b);
println("C: " + c);
println("D: " + d);
println("F: " + f);
