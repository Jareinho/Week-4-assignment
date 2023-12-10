public class ArrayAssignment {

  public static void main(String[] args) {
      // 1.a: Create an array of integers called ages
      int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

      // 1.b.i: Create a new array of integers called ages2 with 9 elements
      int[] ages2 = new int[9];

      // 1.b.ii: Subtract the first element of ages2 from the last element and print the result
      int result = ages2[0] - ages2[ages2.length - 1];
      System.out.println("Subtraction result: " + result);

      // 1.b.iii: Use a loop to iterate through ages2 (dynamic indexing)
      for (int i = 0; i < ages2[i]; i++) {
          
      }

      // 1.a: Subtract the first element of ages from the last element and print the result
      int subtractionResult = ages[0] - ages[ages.length - 1];
      System.out.println("Subtraction result: " + subtractionResult);

      // 1.c: Use a loop to calculate the sum of ages and then compute the average
      int sum = 0;
      for (int age : ages) {
          sum += age;
      }
      double average = (double) sum / ages.length;
      System.out.println("Average age: " + average);
  
      // 2: Create an array of strings called names
      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

      // 2.a: Use a loop to calculate the average number of letters per name
      int totalLetters = 0;
      for (String name : names) {
          totalLetters += name.length();
      }
      double averageLetters = (double) totalLetters / names.length;
      System.out.println("Average letters per name: " + averageLetters);

      // 2.b: Use a loop to concatenate all names separated by spaces and print the result
      StringBuilder concatenatedNames = new StringBuilder();
      for (String name : names) {
          concatenatedNames.append(name).append(" ");
      }
      System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

        // 3. Accessing the last element of any Array
        //int lastElement = ArrayName[ArrayName.length - 1];

        // 4. Accessing the first element of any Array
        //int firstElement = ArrayName[0];  

        // 5: Create a new array of integers called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            // Add the length of each name to the nameLengths array
            nameLengths[i] = names[i].length();
        }

        // 6: Use a loop to iterate over the nameLengths array and calculate the sum of its elements
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of name lengths: " + sumOfNameLengths);
        
        // 7. Call the repeatWord method to concatenate a word "Hello" three times
        String repeatedWord = repeatWord("Hello", 3);
        System.out.println("Repeated word: " + repeatedWord);

        // 8. Call the createFullName method to combine first and last names into a full name
        String fullName = createFullName("John", "Doe");
        System.out.println("Full name: " + fullName);

        // 9. Call the isSumGreaterThan100 method to check if the sum of ages is greater than 100
        boolean isSumGreaterThan100 = isSumGreaterThan100(ages);
        System.out.println("Is sum greater than 100? " + isSumGreaterThan100);

        // 10. Call the calculateAverage method to find the average of elements in doubleArray
        double[] doubleArray = {2.5, 4.0, 6.7, 8.2};
        double averageDouble = calculateAverage(doubleArray);
        System.out.println("Average of double array: " + averageDouble);

        // 11. Call the compareAverages method to check if the average of array1 is greater than array2
        double[] array1 = {1.5, 2.0, 3.5};
        double[] array2 = {2.0, 4.0, 6.0};
        boolean isAvg1GreaterThanAvg2 = compareAverages(array1, array2);
        System.out.println("Is average of array1 greater than average of array2? " + isAvg1GreaterThanAvg2);

        // 12. Call the willBuyDrink method to check if conditions for buying a drink are met
        boolean willBuyDrink = willBuyDrink(true, 15.0);
        System.out.println("Will buy a drink? " + willBuyDrink);

        // 13. Custom method Test case
        int numberToCheck = 17;
        boolean isNumberPrime = isPrime(numberToCheck);
        System.out.println("Is " + numberToCheck + " prime? " + isNumberPrime);

    }

    // 7. Repeat a word n times and return the result
    private static String repeatWord(String word, int n) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeated.append(word);
        }
        return repeated.toString();
    }

    // 8. Combine first and last names into a full name and return the result
    private static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Check if the sum of elements in an array is greater than 100
    private static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // 10. Calculate the average of elements in a double array and return the result
    private static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 11. Compare averages of two double arrays and return true if the first is greater
    private static boolean compareAverages(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    // 12. Check if conditions for buying a drink are met and return the result
    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    
    // This method checks if a given number is prime.
    // I created it because determining prime numbers is a common problem, and it's good to have a reusable method for it.
    // 13. Custom method usage

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

  

