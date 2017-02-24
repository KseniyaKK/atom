package ru.atom;

public class Util {
int[] values;

public static int max(int[] values) {
 if (values.length > 0) {
  int max = values[0];
  for (int i = 1; i < values.length; i++) {
   if (max < values[i]){
    max = values[i];
   }
  }
  return max;
 }
 throw new UnsupportedOperationException();
}


public static long sum(int[] values) {
 if (values.length > 0) {
  int sum = 0;
  for (int i = 0;i < values.length;i++) {
   sum += values[i];
  }
  }
  return sum;
 }
 throw new UnsupportedOperationException();
}


}
