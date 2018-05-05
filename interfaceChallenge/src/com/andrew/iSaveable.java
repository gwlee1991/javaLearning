package com.andrew;

import java.util.ArrayList;
import java.util.List;

public interface iSaveable {
    List<String> write();
    void read(List<String> savedValues);
}
