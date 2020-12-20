package it.ph.springboot.vue.axios.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Api {
    private int id;
    private String name;
    private int aeg;
    private Data data;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAeg() {
        return aeg;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Api{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aeg=" + aeg +
                ", data=" + data +
                '}';
    }
}
