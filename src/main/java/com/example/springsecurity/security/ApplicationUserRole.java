package com.example.springsecurity.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.springsecurity.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(
            COURSE_READ,
            COURSE_WRITE,
            STUDENT_READ,
            STUDENT_WRITE)),

    ADMINTRAINEE(Sets.newHashSet(
            COURSE_READ,
            STUDENT_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    // get set of permissions

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
