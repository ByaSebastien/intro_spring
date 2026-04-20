<!doctype html>
<#import "/spring.ftl" as spring>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create</title>
    <style>
        .text-danger{
            color: red;
        }
    </style>
</head>
<body>
<h1>Create new Moto</h1>
<form action="/moto/create" method="post">
    <div>
        <label for="brand">Brand :</label>
        <@spring.bind "moto.brand"/>
        <input type="text" name="brand" id="brand" value="${spring.status.value!}">
        <@spring.showErrors ' ' 'text-danger'/>
    </div>
    <div>
        <label for="model">Model :</label>
        <@spring.bind "moto.model"/>
        <input type="text" name="model" id="model" value="${spring.status.value!}">
        <@spring.showErrors ' ' 'text-danger'/>
    </div>
    <div>
        <label for="power">Power :</label>
        <@spring.bind "moto.power"/>
        <input type="number" name="power" id="power" value="${spring.status.value!}">
        <@spring.showErrors ' ' 'text-danger'/>
    </div>
    <div>
        <label for="cylinder">Cylinder :</label>
        <@spring.bind "moto.cylinder"/>
        <input type="number" name="cylinder" id="cylinder" value="${spring.status.value!}">
        <@spring.showErrors ' ' 'text-danger'/>
    </div>
    <button type="submit">Ajouter</button>
</form>
<a href="/moto">Retour à l'index</a>
</body>
</html>