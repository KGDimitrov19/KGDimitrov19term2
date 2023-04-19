import java.util.ArrayList;
import java.util.List;

public class Box {
    private String value;

    public Box(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("%s :%s", this.value.getClass(), this.value);

    }
}
