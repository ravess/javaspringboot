package com.tms.a1.Exception;

public class EntityNotFoundException extends RuntimeException {
    
    public EntityNotFoundException(String username, Class<?> entity) { 
        super("The " + entity.getSimpleName().toLowerCase() + " with username '" + username + "' does not exist in our records");
}

}
