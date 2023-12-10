package StringProgram;

public class SortingStringLoop {
	public static void main(String[] args) {
		String s="ade aef abc acd ";
		String temp="";
		String[] ch=s.split(" ");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i].compareTo(ch[j])>0) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
     
     }
}
