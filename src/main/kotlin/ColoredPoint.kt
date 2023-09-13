class ColoredPoint(x: Double, y: Double, _color: String): Point(x,y)
{
    var color = _color;

    fun getColor () = "$color";

    constructor(x: Double,y: Double, _color: String, _otherColoredPoint: String): this (x, y, _color)
    {
        var otherColored = _otherColoredPoint;
    }

    //fun printColor()
  // {
    // println(color);
   //}
}