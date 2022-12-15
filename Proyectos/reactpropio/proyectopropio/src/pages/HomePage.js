import React from "react";
import {Banner,Footer,MenuNavegacionApp} from '../components';

const HomePage = () =>{
    return(
        <div>
            <MenuNavegacionApp/>
            <Banner/>
            <Footer/>
        </div>
    );
};

export default HomePage;