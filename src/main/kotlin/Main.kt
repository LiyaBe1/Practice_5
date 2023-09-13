

fun main()
{
 var xY: Point = Point(1.0, 2.0)

    println("X: ${xY.x} Y: ${xY.x}")

}

open class Point(_x: Double, _y: Double )//Создание базового класса, где содержатся координаты точки
{ //первичный конструктор Поинт содержит параметры этих координат, через (параметры) которые передаются данные для инициализации объектов
    var x: Double = _x;
    var y: Double = _y;

   //fun set(value: Double){
       // x = value
    //}
   fun getX() = x;//возвращение координатф точки X
    fun getY() = y;//..точки Y



    //fun printXAndY()//Метод или функция, которая (возвращает координату точки) выводит объекты
    //{
       // println(x);
      //  println(y);
    //}

    constructor(_x: Double, _y: Double, other_Point: Double): this (_x, _y)
    {//Создание вторичного конструктора, принимающий иной объект класса Поинт
        var otherPoint = other_Point;
    }
}