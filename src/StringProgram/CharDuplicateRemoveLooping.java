package StringProgram;

public class CharDuplicateRemoveLooping {
	public static void main(String[] args) {
        String s="razamd noushad ansari";
        char[] ch=s.toCharArray();
        int i,j;
        for(i=0;i<ch.length;i++) {
        	for(j=0;j<ch.length;j++) {
        		if(ch[i]==ch[j] && ch[i]!=' ') {
        			break;
        		}
        	}
        if(i==j) {
        	System.out.println(ch[i]);
        }
        }
	}
}
