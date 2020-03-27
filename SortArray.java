class SortArray{
	public static void main(String [] args){
		int [] arr = {4,3, 2, 8, 5};

		System.out.println("before sort");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

		System.out.println("after sort");
			sortA(arr, arr.length);
	 
			   for(int i = 0; i < arr.length; i++){
						 System.out.println(arr[i]);
					    }
	}

	public static void sortA(int [] arr, int n){
	
		if(n==1){
			return;
		}

		for(int i =0; i < n-1; i++){
			int temp = arr[i];

			if(arr[i] > arr[i+1]){
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		sortA(arr, n-1);
	}					
}
