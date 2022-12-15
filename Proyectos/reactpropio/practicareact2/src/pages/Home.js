import React, { useCallback, useState } from "react";
import { useNavigate } from "react-router-dom";
import { Boton, FormUsuario, TablaUsuario } from "../components"

const usuario = [
    {

        nombre: "Joseph Joestar",
        contrasenia: "dioPucci",
        email: "jojo1@gmail.com",
        edad: "71",
       
    },

    {

        nombre: "Jotaro Joestar",
        contrasenia: "jolyne",
        email: "jojo2@gmail.com",
        edad: "32",
    
    },
    {

        nombre: "Jolyne Kujoh",
        contrasenia: "jotaro",
        email: "jojo3@gmail.com",
        edad: "21",
     
    }
]




const HomePage = () => {
    const navigate = useNavigate();
    const handleOnClick = useCallback(() => navigate("/Auto", {}, [navigate]));

    //En este momento state vale lo mismo que usuario1
    //por dentro, setState genera una funcion setteadora que me va a permitir cambiar los datos de usuario 1 sin afectarlo directamente
    const [user, setUser] = useState(usuario);
    const [usuarioEditado,setUsuarioEditado] = useState(null);
    //Usuario filtrado segun el rut
    const userDelete = (edadUsuario) => {
        const changeUser = user.filter((usuario) => usuario.edad !== edadUsuario);
        //al momento de ocupar setState, le cambio el valor temporal a mis usuarios
        setUser(changeUser);
    }

    const userAdd = (usuario) => {
        const addUsuario = [
            //mantiene los datos que tengo en user y agrega lo que le entrego
            ...user, usuario
        ];
        setUser(addUsuario);
    }

    const userEdit = (usuarioEditado) => {
        const editUser = user.map(usuario => (usuario.edad === usuarioEditado.edad ? usuarioEditado  :  usuario))
    
        setUser(editUser);
    }


    return (
        <div>
            <FormUsuario userAdd={userAdd} usuarioEditado={usuarioEditado} setUsuarioEditado={setUsuarioEditado} userEdit={userEdit}/>
            <Boton infoBoton={'Ir a autos'} handleOnClick={handleOnClick} />
            <TablaUsuario usuarios={user} deleteUser={userDelete} setUsuarioEditado={setUsuarioEditado}/>

        </div>
    )
}

export default HomePage;