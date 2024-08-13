class SmallestTarray{
public static void main(String [] args){
	int max[]=new int[3];
int a[][]={ {1,2,3,4},{5,6,10,1},
			{11,45,8,9}
		  };
System.out.println("output");
	for(int i=0;i<3;i++){
	for(int j=0;j<4;j++){
	System.out.print(a[i][j]+" ");
					}
	System.out.println();
	}
System.out.println("Small value:");
  for(int i=0;i<3;i++){
     max[i]=a[i][0];
	for(int j=0;j<4;j++){
	if(max[i]>a[i][j]){
		max[i]=a[i][j];
	}
	      }
	System.out.println();
	}
	for(int i=0;i<3;i++){
		System.out.println("index"+i+" "+max[i]);
	}
  }
}