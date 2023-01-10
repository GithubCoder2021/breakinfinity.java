public class breakinfinity {
  String name;
  double mantissa;
  double exponent;
 public String toString(){
   if (exponent >= 1E8){
    return name + ": " + "e" + exponent;
   } else {
    return name + ": " + mantissa + "e" + exponent;
   }
 }
 public breakinfinity(String varName, double mant, double exp ){
   name = varName;
   mantissa = mant;
   exponent = exp;
   if (mant >= 10) {
      mantissa = mant / 10 ;
      exponent += 1;
   }
   if (mant < 1 && mant > 0) {
      mantissa = mant * 10 ;
      exponent -= 1;
   }
   if (mant == 0) {
      mantissa = 0;
      exponent  = 0;
   }
 }
 

  public static void main(String[] args) {
    breakinfinity test = new breakinfinity("Number", 1 , 10);
    System.out.println(test);
  }
}
