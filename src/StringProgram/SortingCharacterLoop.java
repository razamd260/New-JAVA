package StringProgram;

public class SortingCharacterLoop {
     public static void main(String[] args) {
		String s="azsxdcfv";
		char temp=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
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
