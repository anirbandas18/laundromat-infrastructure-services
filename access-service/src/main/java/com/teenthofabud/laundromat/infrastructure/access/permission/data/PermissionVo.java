package com.teenthofabud.laundromat.infrastructure.access.permission.data;

import com.teenthofabud.core.common.data.vo.TypeModelVo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PermissionVo implements Comparable<PermissionVo> {

    @ToString.Include
    private Long id;
    @ToString.Include
    private Boolean active;
    @ToString.Include
    private TypeModelVo resource;
    @ToString.Include
    private TypeModelVo operation;

    @Override
    public int compareTo(PermissionVo o) {
        return this.id.compareTo(o.getId());
    }
}
