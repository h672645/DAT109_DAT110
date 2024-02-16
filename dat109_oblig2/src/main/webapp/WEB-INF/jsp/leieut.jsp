<!DOCTYPE html>
<html>
    <head>
        <title>leiesiden</title>
        <html lang="no"></html>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>Velg bilkategori!</h1>
        <form method="post"    action="/leieut">
            <label path="bil">velg bil</label>
            <select id="bil" path="bil">
                <option value="sedan">Sedan</option>
                <option value="stor">Sport</option>
                <option value="liten">Familie</option>
                <option value="familie">SUV</option>
            </select>
            <label path="startdato">startdatoen</form>
            <input type="date" id="startdato" path="startdato"></input>
            <label path="hvormangedager">hvor mange dager</label>
            <input path="hvormangedager" id="hvormangedager"></input>
            <button type="submit">reserver</button>
        </form>
    </body>
</html>