public class Ex5 {
    
    private int array[];
    private int length;

    public void sort(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            System.out.println("You didn't insert any numbers. Type 'java Ex5 help' for instructions.");
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        printList(array);     
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        // pivot = middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        //divide in 2 arrays
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                //jump to next position
                i++;
                j--;
            }
        }
        //call quickSort() recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if(i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    public static void printList (int[] list) {
        System.out.println("Your lists merged and sorted:");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        switch(args.length) {
            case 0: System.out.println("Type 'java Ex5 help' for instructions on using the program.");
                    break;

            case 1: if(args[0].toLowerCase().equals("help")){
                        System.out.println("To run this program you must type 'java Ex5' followed by two lists of numbers.");
                        System.out.println("The numbers must be separated by spaces and the lists must be inside quote marks.");
                        System.out.println("Example: java Ex5 '12 76 38 92' '73 23 -5 24'");
                    } else {
                        System.out.println("Invalid arguments. Type 'java Ex5 help' for instructions.");
                    }
                    break;

            case 2: try {
                        String placeholder = args[0] + " " + args[1];
                        String list[] = placeholder.split(" ");
                        int numbersList[] = new int[list.length];
                
                        for(int i = 0; i < list.length; i++) {
                            numbersList[i] = Integer.parseInt(list[i]);
                        }
                        
                        Ex5 sorter = new Ex5();
                        sorter.sort(numbersList);

                    } catch(NumberFormatException e){
                        System.out.println("Invalid format. Only insert numbers separated by spaces. Type 'java Ex5 help' for more instructions.");
                    }   
                    break;
            
            default: System.out.println("Invalid arguments. Type 'java Ex5 help' for instructions.");
                    break;
        }
        
    }

    
}