import java.util.*;
public class DemoFile
   {
    public static void main(String[] args) 
      {
          List<String> distros = new ArrayList<String>();
           distros.add("ABC");
           distros.add("IJK");
           distros.add("DEF");
           distros.add("MNO");
        for (String distro : distros)
          {            
            System.out.println(distro);
          }
        List<String> capitals = Arrays.asList("PQR", "RST", "EFG", 
                "LMN", "WXY");
        for (String capital : capitals) 
        { 
            System.out.println(capital);
        }        
    }
}