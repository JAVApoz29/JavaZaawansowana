package annotations;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Test {

    @Setter
    @Getter
    private int weight;
    private String name;
}
