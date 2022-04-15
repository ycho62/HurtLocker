import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        JerkSon jerkSon = new JerkSon();
        System.out.println(jerkSon.splitRawData(output));

        System.out.println(jerkSon.getValueName(output, "name", ";"));
        System.out.println(jerkSon.getValueName(output, "type", ";^%*!@"));
        System.out.println(jerkSon.getValueName(output, "price", ";"));
        System.out.println(jerkSon.getValueName(output, "expiration", "#"));



    }


}
