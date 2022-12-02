//Servicios que hara nuestro proyecto para modificar el esquema al que se conecta

package com.prueba_springboot.demo_springboot.service;

import com.prueba_springboot.demo_springboot.model.User;


//Interfaz que servirá de molde para las modificaciones 
public interface UserService {
    
    User getUser(Integer id);

    User save (User user);

    void delete (Integer id);
}
