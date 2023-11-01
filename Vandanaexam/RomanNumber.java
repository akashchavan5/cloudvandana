import java.util.Scanner;

class RomanNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a roman number:");
	String rmn = sc.nextLine();
	int ans = romanToIntConverter(rmn);
	System.out.println("Integer value is: "+ ans);
}
    public static int romanToIntConverter(String str){
	int result = 0;
	while(!str.isEmpty()){
	if (str.contains("CM")){
		str = str.replaceFirst("CM","");
		result += 900;
}
	if(str.contains("M")){
		str = str.replaceFirst("M","");
		result += 1000;
}
	if(str.contains("CD")){
		str = str.replaceFirst("CD","");
		result += 400;	
}
	if(str.contains("D")){
		str = str.replaceFirst("D","");
		result += 500;
}
	if(str.contains("C")){
		str = str.replaceFirst("C","");
		result += 100;
}
	if(str.contains("XC")){
		str = str.replaceFirst("XC","");
		result += 90;
}
	if(str.contains("XL")){
		str = str.replaceFirst("XL","");
		result += 40;
}
	if(str.contains("L")){
		str = str.replaceFirst("L","");
		result += 50;
}
	if(str.contains("IX")){
		str = str.replaceFirst("IX","");
		result += 9;
}
	if(str.contains("X")){
		str = str.replaceFirst("X",""); 
		result += 10;
}
	if(str.contains("IV")){
		str = str.replaceFirst("IV","");
		result += 4;
}
	if(str.contains("V")){
		str = str.replaceFirst("V","");	
		result += 5;
}
	if(str.contains("I")){
		str = str.replaceFirst("I","");
		result += 1;
}
}
	return result;
}
}