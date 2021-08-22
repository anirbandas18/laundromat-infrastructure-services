package com.teenthofabud.laundromat.infrastructure.access.rolepermission.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class RolePermissionForm {

    @ToString.Include
    private Long permissionId;
    @ToString.Include
    private Long roleId;

}
