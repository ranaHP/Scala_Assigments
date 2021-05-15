object answers extends App{
  def celsius_to_fahrenheit(x:Double) = x * 1.8 +32;
  
  def Volume_of_sphere(r:Double) = (3.141592653589793238 *r *r *r *4)/3;

  def whole_sale_price(n:Int) = if(n>50) 24.95* 60 / 100 * n + (n - 50 ) * 0.75 +50*3 else 24.95*60/100 * n + n*3;

  println("Celsius 35 is equal to : " + celsius_to_fahrenheit(35) + "f");
  println("volume of radius 5 sphere is : " + Volume_of_sphere(5));
  println("Whole scale of books :" + whole_sale_price(60));

}
