/**
 * Make a function
 * - That accepts another function
 * - Invokes this function if
 * - today is an even day
 * - call the function
 */

// vandaag
function Report(){
    console.log("It is an even day!");
}

function CheckEvenDay(callBack){
    const dayOfTheMonth = new Date().getDate();
    if( dayOfTheMonth % 2 === 0){
        callBack();
    }
}

CheckEvenDay(Report);