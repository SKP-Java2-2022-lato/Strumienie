import java.util.ArrayList;
import java.util.List;

public class StatefullClass {
    private List<Integer> list = new ArrayList<>();

    public int modify(int number){
        if(list.contains(number)){
            return number;
        }
        list.add(number);
        return 0;
    }
}
