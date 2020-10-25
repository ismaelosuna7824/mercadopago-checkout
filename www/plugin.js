
var exec = require('cordova/exec');

var PLUGIN_NAME = 'Mercadopago';

var Mercadopago = {
  pagar: function (preference, key, successCallback, errorCallback){
    exec(successCallback, errorCallback, PLUGIN_NAME, "pagar", [preference,key]);
}
};

module.exports = Mercadopago;
