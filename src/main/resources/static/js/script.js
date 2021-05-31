let path_select
let id_select

let showModalDeletar = function(path, id){
    $("#modalDeletar").modal("show")
    path_select = path
    id_select = id
}

let deletar = function(){
    if (path_select != "" && id_select !=""){
        window.location.href= `/${path_select}/delete/${id_select}`
    }
}