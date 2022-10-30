package com.ttn.RestfulApiAsg2.Service;


import com.ttn.RestfulApiAsg2.Entity.ProtectedUser;

import java.util.List;

public interface ProtectedUserService {
    public List<ProtectedUser> getAllProtectedUsers();

    public ProtectedUser addProtectedUser(ProtectedUser protectedUser);


}
