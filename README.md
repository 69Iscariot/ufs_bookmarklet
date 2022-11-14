# ufs_bookmarklet

javascript: (() => {
    
    // clears the console each time you use it
    console.clear();
    
    // Enter here a list of sets to include
    var mySets = new Array('6', '9', '12', '17', '18', '20');
    
    // this clicks the reset button
    document.getElementById("reset").click();
    
    // This checks the character checkbox and asset checkbox 
    document.getElementById("character_checkbox").click();
    document.getElementById("asset_checkbox").click()
    
    // uncomment this to select the ultra rare checkbox
    /* document.getElementById("ultra rare_checkbox").click(); */

    // the following block will select all of the sets that are in the array
    // also logs what was selected in the console which helps troubleshooting
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
