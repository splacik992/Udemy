package section9.interfacechallenge;

import java.util.ArrayList;
import java.util.List;

public interface Saveable {

    List<String> write();

    void read(List<String> savedValues);
}


