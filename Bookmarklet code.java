javascript: (() => {
    
    console.clear();
    
    var mySets = new Array('6', '9', '12', '17', '18', '20');
    
    document.getElementById("reset").click();
    document.getElementById("character_checkbox").click();
    document.getElementById("asset_checkbox").click();
    /* document.getElementById("ultra rare_checkbox").click(); */

    const $select = document.querySelector('#extension');
    var allSets = $select.childNodes;

    console.log("You have selected the following sets");
    allSets.forEach(function(item) {
        if(mySets.includes(item.value)){
            item.selected = true;
            console.log("Found:", item.value, " - ", item.text);
    };});
    console.log("End search.");
                
    $('#search').submit();
    
})();
