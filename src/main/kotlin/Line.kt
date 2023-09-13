open class Line (_startOfPoint: Double, _endOfPoint: Double)//Сщздание первичного конструктора, хранящего начальную и конечную точки линии
{
    var startOfPoint: Double = _startOfPoint;
    var endOgPoint: Double = _endOfPoint;

    fun get() = startOfPoint;
    fun getE() = endOgPoint;
    constructor(_startOfPoint: Double, _endOfPoint: Double, _otherLine: Double) : this(_startOfPoint, _endOfPoint) {
        var otherLine = _otherLine;
    }


}