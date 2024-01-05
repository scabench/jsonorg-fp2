package scabench;


import org.json.JSONObject;
import org.json.XML;

/**
 * Simple application -- the XML to be converted and pretty-printed in hardcoded,
 * so the vulnerability cannot be exploited.
 * @author jens dietrich
 */
public class XML2JSONConverter {

    public static void main (String[] args)  {
        String input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><foo></foo>";
        JSONObject json = XML.toJSONObject(input);
        System.out.println(json.toString(4));
    }

}
