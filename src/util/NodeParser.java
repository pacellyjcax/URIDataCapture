package util;

public class NodeParser {
	
	public static String Parser(String node) {
		boolean estado = false;
		String str = "";
		for(int i = 0; i < node.length();i++){
			if(String.valueOf(node.charAt(i)).equals("<")){
				estado = false;
			} 
			if (estado) {
				str += String.valueOf(node.charAt(i));
			}
			if(String.valueOf(node.charAt(i)).equals(">")){
				estado = true;
			}
		}		
		return str;
		

	}

}
