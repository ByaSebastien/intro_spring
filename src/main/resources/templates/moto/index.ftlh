<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Index</title>
</head>
<body>
<h1>Index Moto</h1>
<a href="/moto/create">Create a new moto</a>
<ul>
    <#list motos as moto>
        <li>
            <a href="/moto/${moto.id()}">
                ${moto.brand()} | ${moto.model()}
            </a>
        </li>
    </#list>
</ul>
</body>
</html>