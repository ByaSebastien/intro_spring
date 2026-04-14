<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create</title>
</head>
<body>
<h1>Create new Moto</h1>
<form action="/moto/create" method="post">
    <div>
        <label for="brand">Brand :</label>
        <input type="text" name="brand" id="brand" value="${moto.brand}">
    </div>
    <div>
        <label for="model">Model :</label>
        <input type="text" name="model" id="model" value="${moto.model}">
    </div>
    <div>
        <label for="power">Power :</label>
        <input type="text" name="power" id="power" value="${moto.power}">
    </div>
    <button type="submit">Ajouter</button>
</form>
<a href="/moto">Retour à l'index</a>
</body>
</html>