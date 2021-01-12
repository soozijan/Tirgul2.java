 //Targil 2:
        int [] numbers = {101, 102, 103, 104, 105};

        //Targil 3:
        int [] arr = {2, 4 ,6};
        System.out.println (arr[1]);
        System.out.println (arr[2]);

        //Targil 4:
        int[] arr_numbers = {1, 2, 3};
        System.out.println (arr_numbers[2]);

        //Targil 5:
        int[] empty = new int[20];

        //Targil 6:
        String [] wellcome = {"wellcom", "to", "java"};

        //Targil 7:
        int [] numbers_arr = {-1, -2, -3, -4, -5};
        for (int index = 0; index < numbers_arr.length; index++ )    {
            System.out.println (numbers_arr[index]);
        }

        //Targil 8:
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < numbers1.length; index+=2)    {
            System.out.println (numbers1[index]);
        }

        //Targil 9:
        for (int index = numbers1.length -1; index >= 0; index += 2)   {
            System.out.println (numbers1[index]);
        }

        //Targil 10:
        int [] numbers_2 = new int [3];
        for (int index = 0; index < numbers_2.length; index++)   {
            System.out.println ("Please enter a number: ");
            numbers_2[index] = scanner.nextInt ();
        }

        //Targil 11:
        int[] numbers_3 = new int[5];
        for (int index = 0; index < numbers_3.length; index++)   {
             numbers_3[index] = random.nextInt (50) + 1;
        }

        //Targil 12:
        int count = 0;
        for(int index = 0; index < numbers_3.length; index++) {
            if (numbers_3[index] % 2 == 0){
                count++;
            }
        }
        if (count == numbers_3.length){
            System.out.println("all numbers are even");
        }
        else {
            System.out.println (" not all numbers are even");
        }

        //Targil 13:
        int[] numbers_4 = {1, 2, 3, 4, 5};
        int[] numbers_5 = {1, 2, 3, 4, 5};
        int count13 = 0;
        if (numbers_4.length == numbers_5.length) {
            for (int index = 0; index < numbers_4.length; index++) {
                if (numbers_4[index] == numbers_5[index]) {
                    count13++;
                } else {
                    break;
                }
            }
            if (count13 ==  numbers_4.length){
                System.out.println("all the numbers are identcal ");
            }
        }

        //Targil 14:
        int[] numbers_6 = {9, 4, 6};
        int[] numbers_7 = new int[3];
        for (int index= 0; index < numbers_7.length; index++) {
            System.out.println("please enter the code");
            numbers_7 [index] = scanner.nextInt();
        }
        int count_numbers = 0;
        if (numbers_6.length == numbers_7.length) {
            for (int index = 0; index < numbers_6.length; index++) {
                if (numbers_6[index] == numbers_7[index]) {
                    count_numbers++;
                } else {
                    break;
                }
            }
        }
        if (count_numbers ==  numbers_6.length) {
            System.out.println("Access Granted");
        }
        else {
            System.out.println(" Wrong");
        }

        //Targil 15:
        String s1 = "hello"; // --> ['h','e','l','l','o'] == 5
        System.out.println(s1.length()); // 5

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println(String.format("size of '%s' is %d", word, word.length()));
        }
        

         //Targil 16:
        String hello = "hello world!";
        int len = hello.length();
        String[] words = {"Hello", "world", "java", "", "tonight", "tomorrow"};
        int counter = 0;
        for (int index = 0; index < words.length; index++) {
            int length_of_word = words[index].length();
            counter += length_of_word;
        }
        System.out.println(String.format("Sum of characters: %d", counter));


        //Targil 18:
        int[] arr = {9, 100, -10000, 49564, 123, 1};
        int max = arr[0];
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        System.out.println(String.format("Maximum is %d", max));
        System.out.println(String.format("Minimum is %d", min));
        }


        //Targil 1: (loola mekunenet)
          for (int index = 0; index < 5; index++) {
            for (int numbers = 1; numbers <= 10; numbers++)
                System.out.println (numbers);
            System.out.println (" ");
        }
        System.out.println ();
        }

         
        //Targil 2:
         
        String[] arr_week = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday",};
        for (int index1 = 0; index1 < 4; index1++)    {
              for (int index2 = 0; index2 < arr_week.length; index2++ )     {
                  System.out.println (arr_week[index2]);
                  System.out.println (" ");
              }
            System.out.println ();
        }


        //Targil 4:
        for (int index = 2; index <= 10; index++) {
            int fact = index;
            for (int indexb = 2; indexb <= index - 1; indexb++) {
                fact *= indexb;
            }
            System.out.println(fact);
            System.out.println();
        }
        
