import React from "react";
import dor from '../img/dor.jpg'


const Banner = () => {
    return (
        
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src={dor} class="d-block w-100" alt="aaaaa"/>
                    </div>
                    <div class="carousel-item">
                        <img src="/img/full.jpg" class="d-block w-100" alt="bbbbb"/>
                    </div>
                    <div class="carousel-item">
                        <img src="/img/primavera.jpg" class="d-block w-100" alt="ccccc"/>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
       
    )
}

export default Banner;