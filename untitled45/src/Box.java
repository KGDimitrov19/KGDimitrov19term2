import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T value;

    public Box(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("%s :%s", this.value.getClass(), this.value);

    }
}
