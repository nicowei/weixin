package util;

import java.util.HashMap;
import java.util.Map;

public class MapToXML {


public static String mapToXml(Map<String, String> params){
		StringBuilder xml = new StringBuilder();
		xml.append("<xml>\n");
		for (Map.Entry<String, String> entry : params.entrySet()) {
			xml.append("<" + entry.getKey() + ">").append(entry.getValue()).append("</" + entry.getKey() + ">\n");
		}
		xml.append("</xml>");
		return xml.toString();
		
	}

public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	map.put("2", "2");
	System.out.println(mapToXml(map));
}

	
}
