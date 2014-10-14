package training;

public class Fraction {
   private int numerator;
   private int denominator;

   public Fraction(int numerator) {
      this(numerator, 1);
   }

   public Fraction(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public Fraction plus(Fraction that) {
      if (this.denominator != that.denominator)
         return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
            this.denominator * that.denominator);
      return new Fraction(this.numerator + that.numerator, this.denominator);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Fraction)) return false;

      Fraction fraction = (Fraction) o;

      if (denominator != fraction.denominator) return false;
      if (numerator != fraction.numerator) return false;

      return true;
   }

   @Override
   public int hashCode() {
      int result = numerator;
      result = 31 * result + denominator;
      return result;
   }

   @Override public String toString() {
      return this.numerator + "/" + this.denominator;
   }
}
