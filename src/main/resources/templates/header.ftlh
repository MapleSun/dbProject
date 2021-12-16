<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<!------ Include the above in your HEAD tag ---------->

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <a class="navbar-brand" href="#">SAME Insurance</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto topnav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home <span class="sr-only"></span></a>
            </li>
            <#if (customer.getCEmail())?exists>
            <li class="nav-item">
                <a class="nav-link" href="/flight/list">Buy an Insurance</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"></a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="/profile" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Profile
                </a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="#">${customer.getCEmail()}</a>
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