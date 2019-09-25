package com.gopas.castlereservation.application.restapi;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OwnerDTO {

    @NotNull
    public String id;

    @Size(min = 6)
    public String name;
}
