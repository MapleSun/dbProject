<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<!------ Include the above in your HEAD tag ---------->

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <a class="navbar-brand" href="#">SAME</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto topnav">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Shop Pre-Owned</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Shop New Cars</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Clearence Event</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Resources
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Carfax</a>
                    <a class="dropdown-item" href="#">Carproof</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Omnivic</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact</a>
            </li>
            <#if (user.username)??>
                <li class="nav-item">
                    <a class="nav-link" href="#">${user.username}</a>
                </li>
            <#else>
                <li class="nav-item">
                    <a class="nav-link btn btn-primary text-white" type="button" href="/login">log In</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link btn btn-danger text-white" type="button" href="/signup">Sign Up</a>
                </li>
            </#if>
        </ul>
    </div>


</nav>