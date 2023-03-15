package com.example.ewalletapi.dto.responsedto;

import lombok.*;
import java.util.ArrayList;
import java.util.List;


@Data
public class ListOfObjectResponse<T> {
    private List<T> objects;

    public ListOfObjectResponse () {
        objects = new ArrayList<>();
    }
}
