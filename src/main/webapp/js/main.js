/**
 * Created by deasel on 2016-07-06.
 */

function getPokedex(){
    getHtml('pokedex', function(){
        document.getElementById("mainContainer").innerHTML=arguments[0];
    })
}

function getHome(){
    getHtml('home',function(){
        document.getElementById("mainContainer").innerHTML=arguments[0];
    })
}

function getMap(){
    getHtml('map', function(){
        document.getElementById("mainContainer").innerHTML=arguments[0];
        initMap();
    })
}

function getHtml(html, callback){
    var client = new XMLHttpRequest();
    client.open('GET', '/'+html);
    client.onreadystatechange = function() {
        callback(client.responseText);
    };
    client.send();
}