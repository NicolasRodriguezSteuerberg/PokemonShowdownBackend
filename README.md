# BACKEND DE POKEMON
Esta app sigue una arquitectura de microservicios. Se utiliza docker para poder lanzar y destribuir de una forma mas comoda.

## Uso
- Crear la imagen de todos los dockerfile (entrar 1 port 1, provisioinal)
- Repositorio de configuracion de github. Ejemplo: <a href="https://github.com/NicolasRodriguezSteuerberg/PokemonShowdownConfig/tree/main">repositorio de configuracion </a>
- Crear un archivo `.env' con los siguientes argumentos:
    ```text
    GIT_USERNAME=usuario de github
    GIT_PASSWORD=token
    GIT_URI=repositorio de configuracion
    POSTGRES_USER=test
    POSTGRES_PASSWORD=test
    POSTGRES_DB=test
    ```
- Posibles cambios en el archivo `config.env` 