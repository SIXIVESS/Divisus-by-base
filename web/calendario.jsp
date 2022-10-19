<%-- 
    Document   : calendario
    Created on : 18 oct 2022, 22:51:38
    Author     : chaly
--%>
<%@page import = "logica.consultaTransferencia"%>
<%@page import = "logica.Transferencia"%>
<%@page import = "logica.convienePagar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Calendario</title>
    
    <link rel="stylesheet" type="text/css" href="https://unpkg.com/js-year-calendar@latest/dist/js-year-calendar.min.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Hammersmith+One&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Rubik&display=swap" rel="stylesheet">

<link rel="stylesheet" href="css/calendarioStyle.css">
   <%
  
consultaTransferencia consulta = new consultaTransferencia();
consulta.consultarTransferencias();

int consultaId = consulta.id[0];
double consultaMonto = consulta.monto[0];
int consultaNumCuenta = consulta.numCuenta[0];
String consultaMotivo = consulta.motivo[0];
int consultaFecha = consulta.fecha[0];
String consultaDestinatario = consulta.nombreDestinatario[0];


Transferencia transfer = new Transferencia(consultaMonto, consultaDestinatario, consultaId, consultaMotivo, consultaNumCuenta, consultaFecha);

convienePagar conviene = new convienePagar();
conviene.valeLaPenaPagar(transfer,1);


consultaTransferencia consulta2 = new consultaTransferencia();
consulta2.consultarTransferencias();

int consulta2Id = consulta.id[1];
double consulta2Monto = consulta.monto[1];
int consulta2NumCuenta = consulta.numCuenta[1];
String consulta2Motivo = consulta.motivo[1];
int consulta2Fecha = consulta.fecha[1];
String consulta2Destinatario = consulta.nombreDestinatario[1];


Transferencia transfer2 = new Transferencia(consulta2Monto, consulta2Destinatario, consulta2Id, consulta2Motivo, consulta2NumCuenta, consulta2Fecha);

convienePagar conviene2 = new convienePagar();
conviene.valeLaPenaPagar(transfer2,24);
%>

</head>
<body>
 

monto:   <input type="text" name="txtName" value="<%=conviene.valeLaPenaPagar(transfer,1)%>"/><!-- comment -->
             destinatario:<input type="text" name="txtName2" /><!-- comment -->
                 <input type="submit"/> 
                 monto:   <input type="text" name="txtName" value="<%=conviene.valeLaPenaPagar(transfer2,24)%>"/><!-- comment -->
             destinatario:<input type="text" name="txtName2" /><!-- comment -->
                 <input type="submit"/> 
    <div class="nav-bg">
        <nav class="navegacion-principal contenedor">
            <a href="index.html">Regresar</a>
        </nav>
    </div>
<h1>Calendario financiero</h1>

<div class="month">      
  <ul>
    <li class="prev">❮</li>
    <li class="next">❯</li>
    <li style="text-align:center">
      Octubre<br>
      <span style="font-size:18px">2022</span>
    </li>
  </ul>
</div>

<ul class="weekdays">
  <li>Lun</li>
  <li>Mar</li>
  <li>Mie</li>
  <li>Jue</li>
  <li>Vie</li>
  <li>Sab</li>
  <li>Dom</li>
</ul>

<ul class="days">  
  <li>1</li>
  <li>2</li>
  <li>3</li>
  <li>4</li>
  <li>5</li>
  <li>6</li>
  <li>7</li>
  <li>8</li>
  <li>9</li>
  <li><span class="active">19</span></li>
  <li>11</li>
  <li>12</li>
  <li>13</li>
  <li>14</li>
  <li>15</li>
  <li>16</li>
  <li>17</li>
  <li>18</li>
  <li>19</li>
  <li>20</li>
  <li>21</li>
  <li>22</li>
  <li>23</li>
  <li>24</li>
  <li>25</li>
  <li>26</li>
  <li>27</li>
  <li>28</li>
  <li>29</li>
  <li>30</li>
  <li>31</li>
</ul>
    <script src="https://unpkg.com/js-year-calendar@latest/dist/js-year-calendar.min.js"></script>
    <script src="https://unpkg.com/js-year-calendar@latest/dist/js-year-calendar.umd.min.js"></script>
    <script src="https://unpkg.com/js-year-calendar@latest/locales/js-year-calendar.es.js"></script>
    <div data-provide="calendar"></div>
    <script>
            
        new Calendar('.calendar', {
    style: 'background',
    minDate: new Date()
});
        new Calendar(document.querySelector('.calendar'));
        new Calendar('.calendar', {
    language: 'es'
});
    </script>
   
</body>
</html>
