import java.util.Arrays;
class ex236
{public static void main(String args[]){
int i;
int j;
int marks[];
marks = new int[20]{50,78,67,83,87,90,75,49,68,96};
Arrays.sort(marks);
String[] grade;
grade = new String[20];
for(j=0;j<11;j++){
if((marks[j]<=50)&&(marks[j]>40))
{grade[j]=="PASS";
continue;}
if((marks[j]<75)&&(marks[j]>=51))
{grade[j]=="MERIT";
continue;}
if(marks[j]>=75)
{grade[j]=="DISTINCTION";
continue;}
else{System.out.println=="FAIL";}}
for(int element:marks){System.out.println(element);}
for(String element:grade){System.out.println(element);}}}
