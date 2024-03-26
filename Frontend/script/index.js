let form=document.getElementById("login-form");
  form.addEventListener("submit", function(event) {
    event.preventDefault();
    if(form.username.value!=null&&form.password.value!=null)
    fetchData(form.username.value,form.password.value);
    else {
      alert("Please enter both username and password");
    }
  });
  async function fetchData(username,password){
    try {
        let res=await fetch('http://localhost:8080/user/signin',{
            method:'POST',
            headers:{
                'Content-Type':'application/json'
            },
            body:JSON.stringify({username:username,
        password:password})
        })
        res=await res.json()
        console.log(res.token)
        localStorage.setItem("auth",res.token)
        location="./vehicle.html"
    } catch (error) {
      console.log(error)
      alert("wrong credential");
    }
}