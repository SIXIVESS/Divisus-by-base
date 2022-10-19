<%-- 
    Document   : index2
    Created on : 18 oct 2022, 22:44:16
    Author     : chaly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <title>DIViSUS</title>
    <link rel="shortcut icon" href="img/imagen_2022-10-18_122651361.png"> 

    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="preload" href="css/styles.css" as="style">
    <link href="styles.css" rel="stylesheet" type="text/css">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Hammersmith+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Rubik&display=swap" rel="stylesheet">

</head>

<body>
    
    <!-- Navegaciones-->
    <div class="nav-bg">
        <nav class="navegacion-principal contenedor">
            <a href="usuario.html"> Usuario</a>
            <a href="calendario.html"> Calendario </a>
            
        </nav>
    </div>
<div>
    <div class="contenedor-secundario">
        <aside>
            <div class="contenedor-temario" id="temario">
                <h3 class="titulo">DIViSUS<small><br>by BASE</small></h3>
                
                <ul class="lista">
                    <li><a href="#1">Balance</a></li>
                    <li><a href="#2">Movimiento</a></li>
                    <li><a href="#3">Calendario</a></li>
                </ul>

            </div>

            <!-- Bienvenida-->
        </aside>
        <section>
            <div class="informacion-principal">
                <h2 class="entrada">¡Hola, bienvenido Elmer Daniel!</h2>
                <!-- Dashboard-->
                <div>
                <h4 class="balance sombra" id="1">
                    <a> Balance </a>
                </h4>
                </div>
                <div>
                    <table>
                        <tr>
                            <th><h2> Balance </h2></th>
                            <th><h2> Pago reciente </h2></th>
                            <th><h2> Pago reciente </h2></th>
                        </tr>
                        <tr>
                            <td><h3> $300,000,000</h3></td>
                            <td><h3> -$250,000,000</h3></td>
                        </tr>
                        <tr>
                            <td><h3> TOTAL</h3></td>
                            <td><h3> </h3></td>
                        </tr> 
                </table>
                <h4 class="movimientos sombra" id="2">
                    <a> Movimientos </a>
                </h4>
                <div class="col-lg-4 my-3">
                    <div class="card rounded-0">
                        <div class="card-header">
                            <div class="tabla-mov">
                                <h6 class="font-wight-bold mb-0">Movimientos recientes</h6>
                            </div>
                            <div class="card-body">
                                <div>
                                    <div></div>
                                    <div>
                                        <h6>-$100,000,000</h6><span>Pago</span>
                                        <small>ITSON</small>
                                    </div>
                                </div>
                            </div>
                        </div >
                    </div>
                </div>
               
            </div>
    </div>
</section>
</div>
</div>
    <!-- Copyrights -->
    <footer>
        <div class="bg-light py-4">

            <p class="text-muted mb-0 py-2">©2022 Las voces. Todos los derechos reservados</p>

        </div>

    </footer>
    <!-- End -->

    <script src="main.js"></Script>
    
</body>

</html>