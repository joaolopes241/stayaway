$(document).ready(function () {

    var beachs = $("beach_album");


    function convert(array) {

        array.forEach((beach) => {

            var cenas = "<div class=\"col-md-4\"> "+
                " <div class=\"card mb-4 box-shadow\"> " +
                " <img class=\"card-img-top\" data-src=\"holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=Thumbnail\" alt=\"Card image cap\"> " +
                " <div class=\"card-body\"> " +
                " <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p> " +
                " <div class=\"d-flex justify-content-between align-items-center\"> " +
                " <div class=\"btn-group\"> " +
                " <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button> " +
                " <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button> " +
                " </div> " +
                " <small class=\"text-muted\">9 mins</small> " +
                "</div> </div> </div> </div>"


            $(cenas).append("beach_album");


        })


    }




    function successCallback(response) {
        // do something with the data
        convert(response);
    }

    function errorCallback(request, status, error) {
        // do something with the error
    }

    // perform an ajax http get request
    $.ajax({
        url: "http://localhost:8080/hackathon/api/beaches",
        async: true,
        success: successCallback,
        error: errorCallback,
    });
});


