const checkOnline = () => {
    if(navigator.onLine === true){
        document.write("Your Device is online...");
    }else{
        document.write("Your Device is not online...");
    }

}

$(function(){
    checkOnline();
})