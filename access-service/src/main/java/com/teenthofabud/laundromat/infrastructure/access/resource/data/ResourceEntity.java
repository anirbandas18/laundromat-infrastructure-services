package com.teenthofabud.laundromat.infrastructure.access.resource.data;

import com.teenthofabud.core.common.data.entity.TOABBaseEntity;
import com.teenthofabud.laundromat.infrastructure.access.permission.data.PermissionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "resource_lov")
public class ResourceEntity extends TOABBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Long id;
    @ToString.Include
    private String name;
    @ToString.Include
    private String description;
    @OneToMany(mappedBy = "resource", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PermissionEntity> permissions;

}
