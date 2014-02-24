package com.sabre.training.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

   @Test
   public void zeroPlusZero() {
      Fraction sum = new Fraction(0).plus(new Fraction(0));
      assertEquals(0, sum.intValue());
   }
}
