# Integración checkout mercadopago en ionic "Android"
======

# Instalación:

ionic cordova plugin add https://github.com/rodrigobaigorria/mercadopago-checkout.git --save


# Implementación:


## Paso 1:

Del lado del backend debes crear la preferencia de pago, para crear la preferencia solo debes leer la documentación oficial.

## Paso 2:

Una vez obtenido el id de preferencia, hacemos el llamado al plugin pasandole dos parametros, el id de preferencia y la key.


 (<any>window).Mercadopago.pagar(refer, this.key, (res)=>{
        this.navCtrl.navigateRoot("/home");
      }, (err)=>{
        this.navCtrl.navigateRoot("/home");
      });





## Autor

* **Hugo Rodrigo Baigorria** # mercadopago-checkout

