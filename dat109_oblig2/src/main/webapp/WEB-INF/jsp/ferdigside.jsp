<!DOCTYPE html>
<html>
    <head>
        <title>Registrering er ferdig</title>
        <html lang="no"></html>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>Du har registert deg</h1>
        <c:>
            <p>Du har en ${bil.navn}</p>
        </c:>
        <c:>
            <p>${bestilling.startdato} til ${bestilling.sluttdato}</p>
        </c:>
        <c:>
            <p>prisen er ${bestilling.pris}</p>
        </c:>
        <c:>
            <p>paa bruker ${bruker.fornavn} ${bruker.etternavn} med adressen ${bruker.adresse}</p>
        </c:>
    </body>
    <form method="post">
        <button type="submit"></button>
    </form>
</html>