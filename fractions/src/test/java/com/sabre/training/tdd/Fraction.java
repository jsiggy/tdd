package com.sabre.training.tdd;

public class Fraction {
   private int intValue;
   private int denominator;

   public Fraction(int intValue) {
      this.intValue = intValue;
   }

   public Fraction(int numerator, int denominator) {
      intValue = numerator;
      this.denominator = denominator;
   }

   public Fraction plus(Fraction that) {
      return new Fraction(this.intValue + that.intValue, this.denominator);
   }

   int intValue() {
      return this.intValue;
   }

   public int getNumerator() {
      return this.intValue;
   }

   public int getDenominator() {
      return this.denominator;
   }
}
