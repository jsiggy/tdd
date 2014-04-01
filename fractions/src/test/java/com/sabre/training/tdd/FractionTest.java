package com.sabre.training.tdd;

import com.sabre.training.Fraction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

   @Test
   public void zeroPlusZero() {
      Fraction sum = new Fraction(0).plus(new Fraction(0));
      assertEquals(new Fraction(0), sum);
   }

   @Test
   public void nonZeroPlusZero() {
      Fraction sum = new Fraction(5).plus(new Fraction(0));
      assertEquals(new Fraction(5), sum);
   }

   @Test
   public void zeroPlusNonZero() {
      Fraction sum = new Fraction(5).plus(new Fraction(0));
      assertEquals(new Fraction(5), sum);
   }

   @Test
   public void nonZeroIntegerAddition() {
      Fraction sum = new Fraction(2).plus(new Fraction(3));
      assertEquals(new Fraction(5), sum);
   }

   @Test
   public void sameDenominatorNoReduce() {
      Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
      assertEquals(new Fraction(3, 5), sum);
   }

   @Test
   public void sameDenominatorNoReduceAnotherTest() {
      Fraction sum = new Fraction(2, 7).plus(new Fraction(3, 7));
      assertEquals(new Fraction(5, 7), sum);
   }

   @Test
   public void differentDenominatorsNoReduction() {
      Fraction plus = new Fraction(2, 3).plus(new Fraction(1, 4));
      assertEquals(new Fraction(11, 12), plus);
   }

   @Test
   public void compareFractionAndSameIntegerValue() {
      assertEquals(new Fraction(3, 1), new Fraction(3));
   }

   @Test
   public void equalsWorks() {
      assertEquals(new Fraction(2), new Fraction(2));
      assertEquals(new Fraction(5, 2), new Fraction(5, 2));
   }

   @Test
   public void notEqualsWorks() {
      assertFalse(new Fraction(2).equals(new Fraction(1)));
      assertFalse(new Fraction(5, 2).equals(new Fraction(2, 3)));
   }
}
