package com.teenthofabud.laundromat.infrastructure.access.permission.data;

import com.teenthofabud.core.common.data.entity.TOABBaseEntity;
import com.teenthofabud.laundromat.infrastructure.access.operation.data.OperationEntity;
import com.teenthofabud.laundromat.infrastructure.access.resource.data.ResourceEntity;
import com.teenthofabud.laundromat.infrastructure.access.rolepermission.data.RolePermissionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "permission_lov")
public class PermissionEntity extends TOABBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resource_lov_id")
    private ResourceEntity resource;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "operation_lov_id")
    private OperationEntity operation;
    @OneToMany(mappedBy = "permission", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RolePermissionEntity> rolePermissions;

}
