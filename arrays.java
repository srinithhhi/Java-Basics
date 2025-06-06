import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers =  new ArrayList<>();
        
        while (true) {
        System.out.println("1. Adding the data");
        System.out.println("2. Getting the data from specific index");
        System.out.println("3. Remove the data form specific index");
        System.out.println("4. Remove the specific data");
        System.out.println("5. Find the list size");
        System.out.println("6. Search");
        System.out.println("7. Inserting the specific index");
        System.out.println("8. List check for empty");
        System.out.println("9. Find the index of the data");
        System.out.println("10.Clear the list");
        System.out.println("11. Display");
        System.out.println("12. Exit");
        System.out.println("-------------------.");
        System.out.println("Enter ur choice: ");
        int val,index;
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.print("Enter the data:");
                    val = sc.nextInt();
                    numbers.add(val);
                    System.out.println(val + " is added to the list");
                    break;
            case 2: System.out.print("Enter the index:");
                    index = sc.nextInt();
                    System.out.println("The value at index" + index + " is " + numbers.get(index)); break;
            case 3: System.out.print("Enter the index:");
                    index = sc.nextInt();
                    System.out.println(numbers.get(index) + 
                    " is removed from the list from index" + index);
                    numbers.remove(index);
                    break;
            case 4: System.out.print("Enter the data:");
                    val = sc.nextInt();
                    System.out.println("Removed" + val + " from the list");
                    numbers.remove(Integer.valueOf(val));
                    break;
            case 5: System.out.println("The list has" + numbers.size() + "elements"); break;
            case 6: System.out.println("Enter the data:");
                    val = sc.nextInt();
                    System.out.println(val + " is found at index" + numbers.get(val)); break;
            case 7: System.out.print("Enter the data:");
                    val = sc.nextInt();
                    System.out.print("Enter the index:");
                    index = sc.nextInt();
                    numbers.add(val);
                    numbers.set(index,val);
                    System.out.println(val + " is added to the list at index" + index);
                    break;
            case 8: System.out.println(numbers.isEmpty()); break;
            case 9: System.out.print("Enter the data:");
                    val = sc.nextInt();
                    System.out.println("The index of " +val + " is " + 
                    numbers.indexOf(val)); break;
            case 10:numbers.clear(); break;
            case 11: System.out.println("list elements are:");
                     System.out.println(numbers); break;
            case 12: System.out.println("Exiting now!"); System.exit(0);
            default: System.out.println("Invalid choice");  
        }
        }
    }
}
