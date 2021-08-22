package com.teenthofabud.laundromat.infrastructure.access.permission.data;

import com.teenthofabud.core.common.error.TOABBaseException;
import com.teenthofabud.core.common.error.TOABError;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PermissionException extends TOABBaseException {

    @ToString.Include
    private transient TOABError error;

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Object[] parameters) {
        super(message, parameters);
    }

    public PermissionException(TOABError error, String message, Object[] parameters) {
        super(error, message, parameters);
        this.error = error;
    }

    public PermissionException(TOABError error, Object[] parameters) {
        super(error, parameters);
        this.error = error;
    }

    @Override
    public String getSubDomain() {
        return "Permission";
    }

}
