package com.teenthofabud.laundromat.infrastructure.access.operation.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class OperationDto {

    @ToString.Include
    private Optional<String> name;
    @ToString.Include
    private Optional<String> description;
    @ToString.Include
    private Optional<String> active;


    public OperationDto() {
        this.name = Optional.ofNullable(null);
        this.description = Optional.ofNullable(null);
        this.active = Optional.ofNullable(null);
    }

}
