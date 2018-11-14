
import java.util.ArrayList;


public class SelectionSort {
	// Driver code to test above
 	public static void main(String args[]){
 	// PREPARAING DATA INPUT
 	ArrayList<Double> input = new ArrayList<Double>();
 	input.add(6.1456);
 	input.add(2.123);
 	input.add(5.23);
 	input.add(1.367);
 	input.add(6.123);
 	input.add(4.167);
 	input.add(11.123);
 	input.add(21.123);
 	// CETAK DATA INPUT 
 	System.out.println("Data Input : "+ input.toString());
 	
 	// PANGGIL METHOD SHORT
 	ArrayList<Double> output = sort(input);
 	
 	// CETAK HASIL SOURTING
 	System.out.println("hasil sourting : "+ output.toString());
 	}
 	public static ArrayList<Double>sort(ArrayList<Double> data){
 		int n = data.size();
 		for (int i=0;i<n-1;i++){
 			int min = i;
 			for (int j=1+i;j<n;j++){
 				if (data.get(j)<data.get(min)){
 					min = j;
 				}
 			}
 			if (min != i){
 				Double tempData = data.get(i);
 				data.set(i, data.get(min));
 				data.set(min, tempData);	
 			}
 			System.out.println("langkah ke-"+i+", min = "+min+" SWAP("+i+","+min+")"+" -> "+ data.toString());

 		}
 		return data;
 	}
}
