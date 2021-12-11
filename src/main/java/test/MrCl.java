package test;

import javafx.beans.property.MapProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.HashMap;

public class MrCl {
    private StringProperty str = new SimpleStringProperty();
    private MapProperty<String,String> hash = new SimpleMapProperty<>();

    public MrCl(String str){
        setStr(str);
    }

    public void setStr(String str) {
        this.str.set(str);
    }
    public String getStr(){
        return str.getValue();
    }
    public MapProperty<String,String> getHash(){
        return hash;
    }

    @Override
    public String toString(){
        return str.getValue()+hash;
    }
}
