
const boton = document.querySelector(".boton-administrador")
const divForm = document.querySelector(".container-form")
const botonF = document.querySelector(".boton-form")
const refre = document.querySelector(".refre")
boton.addEventListener('click', () => {
   divForm.classList.toggle("show")
   
})

botonF.addEventListener("click",() => {
   
})

refre.addEventListener("click", () => {
   window.history.pushState({}, '', window.location.href.split('?')[0]);
   window.location.reload()

})

