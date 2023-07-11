package com.vitalconsult.Vitalconsultback.Services.implement;


import com.vitalconsult.Vitalconsultback.Entity.UsuariosEntity;
import com.vitalconsult.Vitalconsultback.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository userepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuariosEntity userload = userepo.findByUsername(username);
        if (userload ==null){
            throw new UsernameNotFoundException ("Usuario No encontrado");
        }
        return userload;
    }


}
