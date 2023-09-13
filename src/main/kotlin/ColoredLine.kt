class ColoredLine (startOfPoint: Double, endOfPoint: Double, _color: String): Line(startOfPoint, endOfPoint)
{
    var color: String = _color;
    fun getColor() = "$color";

    constructor(startOfPoint: Double, endOfPoint: Double, _color: String, otherLine: Double): this(startOfPoint, endOfPoint, _color){
        var otherColoredLine = otherLine;
    }
}