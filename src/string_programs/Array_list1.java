package string_programs;

import java.util.ArrayList;

public class Array_list1 {

	
		    public static void main(String[] args) {
		        // Sample array list
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        list.add(18);
		        list.add(45);
		        list.add(88);
		        list.add(9);
		        list.add(23);
		        list.add(45);
		        list.add(67);
		        list.add(18);
		        
		        list.remove(4);
		        System.out.println(list);
		    }}
//		        list.add(99);
//		        list.add(77);
//		        list.add(12);
//		        list.add(44);
//		        list.add(18);
//		        list.add(18);
		        
//		        list.set(0, 19);
//		        System.out.println(list);
//
//		        // Removing duplicates without using LinkedHashSet
//		        ArrayList<Integer> result = new ArrayList<>();
//		        for (Integer num : list) {
//		            if (!result.contains(num)) {
//		                result.add(num);
//		            }
//		        }
//
//		        // Displaying the array list after removing duplicates
//		        System.out.println("Array list after removing duplicates:");
//		        System.out.println(result);
//		        
//		    }
//		}
