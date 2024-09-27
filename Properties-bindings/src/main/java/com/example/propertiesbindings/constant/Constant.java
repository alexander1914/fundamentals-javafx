package com.example.propertiesbindings.constant;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;

public class Constant {
    private ReadOnlyIntegerWrapper numWrapper;

    private ReadOnlyStringWrapper stringWrapper;

    public Constant(int num, String string){
        this.numWrapper = new ReadOnlyIntegerWrapper(num);
        this.stringWrapper = new ReadOnlyStringWrapper(string);
    }

    public ReadOnlyIntegerProperty getReadOnlyNumber(){
        return numWrapper.getReadOnlyProperty();
    }

    public ReadOnlyStringProperty getReadOnlyString(){
        return stringWrapper.getReadOnlyProperty();
    }

    public void changeConstant(){
        this.numWrapper.set(0);
    }

    public void changeStringWrapper(){
        this.stringWrapper.set(null);
    }
}
