# Integración checkout mercadopago en ionic "Android"
======

# Instalación:

ionic cordova plugin add https://github.com/rodrigobaigorria/mercadopago-checkout.git --save


# Implementación:


## Paso 1:

Del lado del backend debes crear la preferencia de pago, para crear la preferencia solo debes leer la documentación oficial.

## Paso 2:

Una vez obtenido el id de preferencia, hacemos el llamado al plugin pasandole dos parametros, el id de preferencia y la key.


 (<any>window).Mercadopago.pagar("ID_DE_LA_REFERENCIA", "KEY_DE_MERCADOPAGO", (res)=>{
        //Lo que queremos que haga si la respuesta es exitosa
      }, (err)=>{
        //Lo que queremos que haga si la respuesta es de error
      });





## Autor

* **Hugo Rodrigo Baigorria** # mercadopago-checkout

