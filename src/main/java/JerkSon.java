import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerkSon{
    public List<String> groceryList = new ArrayList<>();


    public List<String> splitRawData(String input){
        Pattern pattern = Pattern.compile("name.*?[##$]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            groceryList.add(matcher.group());
        }

        return groceryList;
    }

    public String getValueName (String input, String key, String regexpram){
        String valueList = "";
        Pattern pattern = Pattern.compile("(?<=" + key +"[:]).*?(?=[" + regexpram + "])", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            valueList =matcher.group();
        }

        return valueList;
    }

    public List<String> groceryParse(List<String> groceryList){
        for (String g : groceryList) {
            String name = getValueName(g, "Name", ";");
            String price= getValueName(g, "Price", ";");
            Grocery builder = new Grocery(name, price);
            groceryList.add(String.valueOf(builder));
        }return groceryList;

    }



}
