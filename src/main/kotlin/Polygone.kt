class Polygone(startOfPoint: Double, endOfPoint: Double, otherLine: Double, _points: Double): Line(startOfPoint, endOfPoint, otherLine)
{
    var points: Double = _points;

    fun moveX(distance:Double) = distance;
    fun moveY(distance:Double) = distance;
    //fun move(distanceX: Double,distanceY: Double) = distanceX, distanceY;

    fun getPoint() = points;
}