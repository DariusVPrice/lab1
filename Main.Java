/*
 * IT-2660 - Lab 1
 * Student Name: Darius Price
 */

public class Main {
  public static void main(String[] args) {
    //System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    //System.out.println(lab.increment(1));

    // Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}.
    int[] scores = {5,9,3,12,7,3,11,5};
    int num = 0;
    // Output the array in order using a while loop
    while (num <= scores.length - 1) {
      System.out.println(scores[num]);
      ++num;
    }
    // Output the array in reverse using a for loop.
    for (int i = scores.length - 1; i >=0; i-- ) {
      System.out.print(scores[i] + " ");
    }
    // Output the first and last values
    int first = scores.length - scores.length;
    System.out.println("First Value: " + scores[first]);
    int last = scores.length-1;
    System.out.println("Last Value: " + scores[last]);
    
    int Maximum = lab.max(87,46);
    System.out.println("The Max value is: "+ Maximum);
    int Minimum = lab.min(34,18);
    System.out.println("The Min value of is: " + Minimum);
    int Sum = lab.sum(scores);
    System.out.println("The sum of all scores are: " + Sum);
    int Average = lab.average(scores);
    System.out.println("The average value of all scores are: " + Average);
    int AMaximum = lab.max(scores);
    System.out.println("The highest score was: "+ AMaximum);
    int AMinimum = lab.min(scores);
    System.out.println("The lowest score was: "+ AMinimum);

  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b) {
    if (a>b) {
      return a;
    } else {
      return b;
    }
  }
  public int min(int a, int b) {
    if (a<b) {
      return a;
    } else {
      return b;
    }
  }
  public int sum(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }
  public int average(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum / nums.length;
  }
  public int max(int[] nums) {
    int max = nums[0];
    for (int num : nums) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }
  public int min(int[] nums) {
    int min = nums[0];
    for (int num : nums) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }
}
```</body>
