package it.ph.springboot.vue.axios.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Api {
    private int id;
    private String name;
    private int aeg;
}
