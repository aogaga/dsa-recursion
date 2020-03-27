class Palindrone{
	public static void main(String [] args){
		int [] arr = {1,2,3,2,1};	

		System.out.println(findPalindrone(arr, 0));
	}
	
	public static boolean findPalindrone(int [] arr, int index){
		if(index == arr.length /2 ){
			
			if(arr[index] != arr[arr.length -1 -index]){
				return false;
			}

			return findPalindrone(arr, index -1);
		}
		return true;
	}
}
