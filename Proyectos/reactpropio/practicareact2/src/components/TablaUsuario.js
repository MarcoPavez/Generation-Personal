import React, {useEffect} from "react";



const TablaUsuario = ({usuarios, deleteUser, setUsuarioEditado}) => {
  return (
    <div>
      <table class="table">
        <thead>
          <tr>
            <th scope="col">Nombre</th>
            <th scope="col">Contraseña</th>
            <th scope="col">Email</th>
            <th scope="col">Edad</th>
            <th scope="col">Acciones</th>
          </tr>
        </thead>
        <tbody>
            {usuarios.map(usuario => (
              <tr>
              
              
              <td>
                {usuario.nombre}
              </td>
              <td>
                {usuario.contrasenia}
              </td>
              <td>
                {usuario.email}
              </td>
              <td>
                {usuario.edad}
              </td>
            
              
              <td>
              <button
                  type="button"
                  class="btn btn-primary"
                  onClick={() => {
                    deleteUser(usuario.edad);
                  }}
                >
                 Eliminar
                </button>
                <button
                  type="button"
                  class="btn btn-warning"
                  onClick={() => {
                    setUsuarioEditado(usuario);
                  }}
                >
                 Editar
                </button>
                </td>
              </tr>
            ))}

        </tbody>
      </table>
    </div>
  );
};

export default TablaUsuario;