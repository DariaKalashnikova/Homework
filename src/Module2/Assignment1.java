package Module2;


public class Assignment1 {

        static int[] array = {3208, 2098, 3547, 4453, 8798, 9922, 1211, 9657, 4456, 3214};
        static double[]array1={23.5,-5.06,56.5,329.2,7.89,-6.28,45.8,55.3,99.3,125.3};

       //calculate sum of int and double

        static int arraySum(int[] array) {
          int sum=0;
          for (int i=0; i<array.length;i++){
              sum+=array[i];}
              return sum;
      }

      static double arraySum1(double[]array1){
          double sum=0;
          for(double arrayItem:array1){
              sum+=arrayItem;}
              return sum;
      }

      //calculate min of int and double

    static int arrayMin(int[]array){
        int min=array[0];
        for( int i=0; i<array.length;i++){
            if(array[i]<min){
                min=array[i];}
        }
        return min;
    }

    static double arrayMin1(double[]array1){
        double min=array1[0];
        for (int i=0; i<array1.length;i++){
            if (array1[i]<min){
                min=array1[i];}
            }
        return min;
    }

    // calculate max of int and double

    static int arrayMax(int[]array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];}
            }
            return max;
        }

    static double arrayMax1(double[]array1){
        double max=array1[0];
        for(int i=0;i<array1.length;i++){
            if (array1[i]>max){
                max=array1[i];}
            }
            return max;
        }
    //max positive of int and double

    static int arrayMaxPositive(int[]array){
        int maxPositive=array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]>maxPositive){
                maxPositive=array[i];}
        }
        if(maxPositive>0);
        return maxPositive;
    }

    static double arrayMaxPositive1(double[]array1){
        double maxPositive1=array1[0];
        for(int i=0;i<array1.length;i++){
            if(array1[i]>maxPositive1){
                maxPositive1=array1[i];}
        }
        if(maxPositive1>0);
        return maxPositive1;
    }
    //multiplication

    static int arrayMult(int[]array){
        int arrayMult=1;
        for(int i=0;i<array.length;i++){
            arrayMult=arrayMult*array[i];
        }
            return arrayMult;
    }

    static double arrayMult1(double[]array1){
        double arrayMult1=1;
        for(int i=0;i<array1.length;i++){
            arrayMult1=arrayMult1*array1[i];
        }
        return arrayMult1;
    }

//modulus of first and last element

    static int modulus(int[]array){
       int modulus=array[0]%array.length-1;
       return modulus;
    }

    static double modulus1(double[]array1){
        double modulus1=array1[0]%array1.length-1;
        return modulus1;
    }

//second largest element

    static int secondLargest(int[]array){
        int max=arrayMax(array);
        int second=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>second&&array[i]<max)
                second=array[i];
        }
        return second;
    }

    static double secondLargest1(double[]array1){
        double max=arrayMax1(array1);
        double second1=0;
        for(double item:array1){
            if(item>second1&&item<max)
                second1=item;
        }
        return second1;
    }








    public static void main(String[] args) {
        System.out.println("Int sum is"+ arraySum(array));
        System.out.println("Double sum is"+ arraySum1(array1));
        System.out.println("Int min is"+ arrayMin(array));
        System.out.println("double min is"+ arrayMin1(array1));
        System.out.println("Int max is"+ arrayMax(array));
        System.out.println("Double max is"+ arrayMax1(array1));
        System.out.println("Int max positive is"+ arrayMaxPositive(array));
        System.out.println("Double max positive is"+ arrayMaxPositive1(array1));
        System.out.println("Int multiplication is"+ arrayMult(array));
        System.out.println("Double multiplication is"+ arrayMult1(array1));
        System.out.println("Int modulus is"+ modulus(array));
        System.out.println("Double modulus is"+ modulus1(array1));
        System.out.println("Int second largest element is"+ secondLargest(array));
        System.out.println("Double second largest element is"+ secondLargest1(array1));
    }
}


