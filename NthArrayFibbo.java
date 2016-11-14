//Complexity O(n)
class NthArrayFibbo {
public static void main(String[] args) {
System.out.println("Enter the value of n");
int s1=0,s2=1,s3,count=1;
int n=3;
while(count<=n){
s3=s1+s2;
s1=s2;
s3=s2;
if(s1%2==0){
count++;
}
}
System.out.println(s1);

}

}
