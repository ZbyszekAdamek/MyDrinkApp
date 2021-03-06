<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pl-PL">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- znacznik viewport odpowiada za poprawne wyświetlanie strony na ekranach różnego rozmiaru-->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DrinkApp - drinkuj ze smakiem</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="/theme/css/sb-admin-2.css"/>" rel="stylesheet">


</head>


<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Drinkuj ze smakiem!</h1>
    </div>

    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <a href="/dashboard" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Panel użytkownika </a>
    </div>


    <!-- Content Row -->
    <div class="row">

        <!-- Earnings (Monthly) Card Example -->
        <div class="col-xl-3 col-md-6 mb-4">
            <div class="card border-left-primary shadow h-100 py-2">
                <div class="card-body">
                    <div class="row no-gutters align-items-center">
                        <div class="col mr-2">
                            <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">Wybierz swój styl
                            </div>
                            <%--<div class="h5 mb-0 font-weight-bold text-gray-800">$40,000</div>--%>
                            <img src="/theme/img/wines.jpg" width="250" height="150" alt="alkohol">
                        </div>
                        <div class="col-auto">
                            <i class="fas fa-calendar fa-2x text-gray-300"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Earnings (Monthly) Card Example -->
        <div class="col-xl-3 col-md-6 mb-4">
            <div class="card border-left-success shadow h-100 py-2">
                <div class="card-body">
                    <div class="row no-gutters align-items-center">
                        <div class="col mr-2">
                            <a href="/description" class="text-xs font-weight-bold text-primary text-uppercase mb-1">Dowiedz się więcej
                            </a>
                            <div class="col mr-2">
                            </div>
                            <img src="/theme/img/RUM.jpg" width="250" height="150" alt="RUM">
                        </div>
                        <div class="col-auto">
                            <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Content Row -->

        <div class="row">

            <!-- Area Chart -->
            <div class="col-xl-8 col-lg-7">
                <div class="card shadow mb-4">
                    <!-- Card Header - Dropdown -->
                    <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                        <h6 class="m-0 font-weight-bold text-primary">O nas</h6>
                        <div class="dropdown no-arrow">

                            <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown"
                               aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                            </a>
                        </div>
                    </div>
                    <!-- Card Body -->
                    <div class="card-body">
                        <div class="chart-area">
                            <canvas id="myAreaChart"></canvas>
                            <p>Aplikacja stworzona do katalogowania najlepszych drinków z całego świata. Zapisuj własne
                                drinki i wyszukuj przepisy.</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Pie Chart -->
            <div class="col-xl-4 col-lg-5">
                <div class="card shadow mb-4">
                    <!-- Card Header - Dropdown -->
                    <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                        <h6><a href="/monthDrink" class="m-0 font-weight-bold text-primary">Drink miesiąca</a></h6>
                    </div>
                    <!-- Card Body -->
                    <div class="card-body">
                        <img src="/theme/img/margarita.jpg" width="200" height="250" alt="pornstar">
                        <h2>STRAWBERRY MARGARITA</h2>
                        <%--<div class="chart-pie pt-4 pb-2">
                            <canvas id="myPieChart"></canvas>
                        </div>--%>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.container-fluid -->


        </body>
</html>
