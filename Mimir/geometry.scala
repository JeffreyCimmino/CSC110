/*******
 * Author: <YOUR NAME(S) HERE>
 * CSC110 - Geometry (Shapes) Project
 * 
 * geometry.scala
 *    This program implements the work of Lab 3.
 *    It determines if circle-point, circle-circle, or square-square 
 *    intersections exist.
 ********/

var done = false   // Flag to determine when we are done
while (!done) {
  // Ask the user which problem to do
  println("Please select a problem to solve.")
  println("  0. Point-Circle test.")
  println("  1. Circle-Circle intersection.")
  println("  2. Square-Square intersection.")
  println("  3. Quit.")
  val choice = readInt

  // Process the choice
  choice match {
    case 0 => processPointInCircle()
    case 1 => processCircleCircle()
    case 2 => processSquareSquare()
    case 3 => done = true // We are done
    case _ => println("Invalid option")
  }
}

/**
  * processPointInCircle:
  *    Get input and process result for point-in-circle test
  **/
def processPointInCircle() {
  // Prompt and get the input
  println("Please enter the values for the circle: CX, CY, and Radius.")
  val cx = readDouble
  val cy = readDouble
  val rad = readDouble
  println("Please enter the values for the point: PX, PY.")
  val px = readDouble
  val py = readDouble

  // Process that input
  if (pointInCircle(cx, cy, rad, px, py))
    println("The point lies in the circle.")
  else
    println("The point does not lie in the circle.")
}

/**
  * pointInCircle:
  *     Determine if a point lies inside a given circle
  *     cx, cy: Center of the given circle
  *     rad: Radius of the given circle
  *     px, py: Location of the given point
  *     Returns true if the point lies inside the circle (false otherwise)
  **/
def pointInCircle(cx: Double, cy: Double, rad: Double,
  px: Double, py: Double): Boolean = {
  return false   // FIX: Clearly this needs to be fixed
}

/**
  * processCircleCircle:
  *    Get input and process result for circle-circle test
  **/
def processCircleCircle() {
  // Prompt and get the input
  println("Please enter the values for circle A: CX, CY, and Radius.")
  // Get the input - FIX: Add code

  println("Please enter the values for circle B: CX, CY, and Radius.")
  // Get the input - FIX: Add code

  // Process that input - FIX: Add code
  // if (circles intersect)
  //    println("The two circles intersect.")
  // else
  //    println("The two circles do not intersect.")
}

/**
  * circleCircleIntersection:
  *     Determine if two circles intersect
  *     cxA, cyA: Center of circle A
  *     radA: Radius of circle A
  *     cxB, cxB: Center of circle B
  *     radB: Radius of circle B
  *     Returns true if the two circles intersect (false otherwise)
  **/
def circleCircleIntersection(cxA: Double, cyA: Double, radA: Double,
  cxB: Double, cyB: Double, radB: Double): Boolean = {
  return false   // FIX: Clearly this needs to be fixed
}

/**
  * processSquareSquare:
  *    Get input and process result for square-square test
  **/
def processSquareSquare() {
  // Prompt and get the input
  println("Please enter the values for squareA: Lower X, Lower Y, and Side Length.")
  // Get the input - FIX: Add code

  println("Please enter the values for squareB: Lower X, Lower Y, and Side Length.")
  // Get the input - FIX: Add code

  // Process that input - FIX: Add code
  // if (squares intersect)
  //    println("The two squares intersect.")
  // else
  //    println("The two squares do not intersect.")
}

/**
  * squareSquareIntersection:
  *     Determine if two squares intersect
  *     lxA, lyA: Lower-left corner of A
  *     lenA: Length of a side of A
  *     lxB, lyB: Lower-left corner of B
  *     lenB: Length of a side of B
  *     Returns true if the two squares intersect (false otherwise)
  **/
def squareSquareIntersection(lxA: Double, lyA: Double, lenA: Double,
  lxB: Double, lyB: Double, lenB: Double): Boolean = {
  return false   // FIX: Clearly this needs to be fixed
}

