class SumEachColumn{
public static void main(String [] args){
	int sum[]=new int[3];
    int a[][]={ {1,2,3,4},{5,6,10,1},
			{11,45,8,9}
		  };
	System.out.println("output:");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
  }
  for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
	sum[i]+=a[j][i];
  }
  System.out.println("sum in index: "+sum[i]);
    }
   }
}