package com.teenthofabud.laundromat.infrastructure.access.userrole.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class UserRoleForm {

    @ToString.Include
    private Long userTypeId;
    @ToString.Include
    private Long roleId;

}
