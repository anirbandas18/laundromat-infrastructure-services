package com.teenthofabud.laundromat.infrastructure.access.rolepermission.mapper;

import com.teenthofabud.core.common.mapper.SingleChannelMapper;
import com.teenthofabud.laundromat.infrastructure.access.rolepermission.data.RolePermissionEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class RolePermissionEntitySelfMapper implements SingleChannelMapper<RolePermissionEntity> {
    @Override
    public Optional<RolePermissionEntity> compareAndMap(RolePermissionEntity source, RolePermissionEntity target) {
        boolean changeSW = false;
        if(source.getId() != null && source.getId() > 0 && source.getId().compareTo(target.getId()) != 0) {
            target.setId(source.getId());
            changeSW = true;
            log.debug("Source UserRoleEntity.id is valid");
        }
        if(source.getPermission() != null && source.getPermission().getId() != null && source.getPermission().getId() > 0
                && !source.getPermission().getId().equals(target.getPermission().getId())) {
            target.setPermission(source.getPermission());
            changeSW = true;
            log.debug("Source UserRoleEntity.permission.id is valid");
        }
        if(source.getRole() != null && source.getRole().getId() != null && source.getRole().getId() > 0
                && !source.getRole().getId().equals(target.getRole().getId())) {
            target.setRole(source.getRole());
            changeSW = true;
            log.debug("Source UserRoleEntity.role.id is valid");
        }
        if(changeSW) {
            log.debug("All provided UserRoleEntity attributes are valid");
            return Optional.of(target);
        } else {
            log.debug("Not all provided UserRoleEntity attributes are valid");
            return Optional.empty();
        }
    }
}
