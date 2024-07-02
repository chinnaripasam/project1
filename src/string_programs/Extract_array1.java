package string_programs;



	import java.util.ArrayList;
	import java.util.List;

	public class Extract_array1 {
		    public static void main(String[] args) {
		        // Given array list
		        ArrayList<String> al = new ArrayList<>();
		        al.add("Sita");
		        al.add("Geeta");
		       // names.add("Shyam");
		        al.add("RAM");
		        // Extracted list with specific transformation
		        ArrayList<String> extractedList = new ArrayList<>();
		        for (String name : al) {
		            String transformedName = transformName(name);
		            extractedList.add(transformedName);
		        }

		        // Printing the extracted list
		        System.out.println("Extracted list:");
		        System.out.println(extractedList);
		    }
		    // Method to transform a name based on specific rules
		    public static String transformName(String name) {
		        String transformedName = name.toLowerCase();
		        if (transformedName.startsWith("s")) {
		            transformedName = "seeta";
		        } else if (transformedName.startsWith("g")) {
		            transformedName = "geeta";
		        } else if (transformedName.startsWith("r")) {
		            transformedName = "reeta";
		        }
		        return transformedName;
		    }
		}
