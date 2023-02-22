package com.example.library.model.DTO;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class BorrowerDTO {
    private String name;
    @NotNull
    private String phone;
    @NotNull
    private String cccd;
}
