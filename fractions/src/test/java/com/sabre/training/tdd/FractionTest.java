package com.sabre.training.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

   @Test
   public void zeroPlusZero() {
      Fraction sum = new Fraction(0).plus(new Fraction(0));
      assertEquals(0, sum.intValue());
   }

   @Test
   public void nonZeroPlusZero() {
      Fraction sum = new Fraction(5).plus(new Fraction(0));
      assertEquals(5, sum.intValue());
   }

   @Test
   public void zeroPlusNonZero() {
      Fraction sum = new Fraction(5).plus(new Fraction(0));
      assertEquals(5, sum.intValue());
   }

   @Test
   public void nonZeroIntegerAddition() {
      Fraction sum = new Fraction(2).plus(new Fraction(3));
      assertEquals(5, sum.intValue());
   }

   @Test
   public void sameDenominatorNoReduce() {
      Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
      assertEquals(3, sum.getNumerator());
      assertEquals(5, sum.getDenominator());
   }

   @Test
   public void sameDenominatorNoReduceAnotherTest() {
      Fraction sum = new Fraction(2, 7).plus(new Fraction(3, 7));
      assertEquals(5, sum.getNumerator());
      assertEquals(7, sum.getDenominator());
   }
}
