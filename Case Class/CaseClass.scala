//19000421

import math.{ sqrt, pow}

object CaseClass extends App {

    val P1 = Point (1,9)
    val P2 = Point (-2,8)

    val P3 = P1+P2
    val P4 = P1.move (5,3)
    val P5 = P1.distance(P2)
    val P6 = P2.invert()

    println("P1 = " + P1)
    println("P2 = " + P2)
    println("Addition of P1 and P2 = "+ P3)
    println("P1 moved by a x distance of 5 and y distance of 3" + " = " + P4)
    println("Distance between P1 and P2 = "  + P5)
    println("Invert of P2  = " + P6)
}

case class Point (a:Int,b:Int)
{
    def x: Int = a
    def y: Int = b

    //Question 1
    def +(that:Point)= Point(this.x+that.x,this.y+that.y)

    //Question 2
    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

    //Question 3
    def distance (that:Point) : Double =
        sqrt(pow(this.x-that.x,2) + pow(this.y-that.y,2))

    //Question 4
    def invert () = Point(this.y,this.x)
}