package String_1;
/*
 * 
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") ¡æ "HiByeByeHi"
makeAbba("Yo", "Alice") ¡æ "YoAliceAliceYo"
makeAbba("What", "Up") ¡æ "WhatUpUpWhat"
 */
public class makeAbba {
	public String makeAbba1(String a, String b) {
		  return a+b+b+a;
	}
	
	// Solution
	public String makeAbba2(String a, String b) {
		  return a + b + b + a;
	}
}
