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
            <label name="bil" path="bil">velg bil</label>
            <select name="bil" id="bil" path="bil">
                <option value="Sedan">Sedan</option>
                <option value="Sport">Sport</option>
                <option value="Familie">Familie</option>
                <option value="SUV">SUV</option>
            </select>
            <label name="startdato" path="startdato">startdatoen</form>
            <input name="startdato" type="date" id="startdato" path="startdato"></input>
            <label name="hvormangedager" path="hvormangedager">hvormangedager</label>
            <input name="hvormangedager" path="hvormangedager" id="hvormangedager"></input>
            <button type="submit">reserver</button>
        </form>
    </body>
</html>