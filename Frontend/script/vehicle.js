
    let tbody=document.querySelector("tbody");
    let fileuploadForm = document.getElementById("fileuploadForm");
    let pagination=document.getElementById("pagination");
    let dataPerPage=20;
    window.addEventListener('load', fetchvehicles(1,dataPerPage));
    fileuploadForm.addEventListener("submit", async function(event) {
        event.preventDefault();
        let file = fileuploadForm.file.files[0];
        if (file) {
            await fetchData(file);
        } else {
            alert("Please select a file to upload.");
        }
    });
    async function fetchData(file) {
        const formData = new FormData();
        formData.append('file', file);
        try {
            let res = await fetch('http://localhost:8080/files/upload', {
                method: 'POST',
                headers: {
                    'Authorization': `Bearer ${localStorage.getItem("auth")}`
                },
                body: formData
            });
            if (!res.ok) {
                res=await res.json();
                alert(res.message);
            } else {
                alert("File uploaded successfully");
                fetchvehicles(1,15);
            }
        } catch (error) {
            console.log(error);
            alert(error);
        }
    }
    async function fetchvehicles(pageNum,limit){
        try {
            let res = await fetch(`http://localhost:8080/vehicle/page/${pageNum}/${limit}`, {
                method: 'GET',
                headers: {
                    'Authorization': `Bearer ${localStorage.getItem("auth")}`
                },
            });
            if (!res.ok) {
                console.log("something went wrong")
            } else {
                res=await res.json();
                
                console.log(res.total_size)
                display(res.vehicles);
                let total= res.total_size
                let buttons=Math.ceil(total/dataPerPage)
                button(buttons)
                // console.log(res);
            }
        } catch (error) {
            console.log(error);
        }

    }
    function display(data){
        tbody.innerHTML="";
        
        data.forEach(v => {
            let tr=document.createElement("tr");
            let td1=document.createElement("td");
            let td2=document.createElement("td");
            let td3=document.createElement("td");
            let td4=document.createElement("td");
            let td5=document.createElement("td");
            let td6=document.createElement("td");
            let td7=document.createElement("td");
            let td8=document.createElement("td");
            let td9=document.createElement("td");
            let td10=document.createElement("td");
            let td11=document.createElement("td");
            let td12=document.createElement("td");
            let td13=document.createElement("td");
            let td14=document.createElement("td");
            let td15=document.createElement("td");
            let td16=document.createElement("td");
            let td17=document.createElement("td");
            let td18=document.createElement("td");
            let td19=document.createElement("td");
            let td20=document.createElement("td");
            let td21=document.createElement("td");
            let td22=document.createElement("td");
            td1.innerText=v.id;
            td2.innerText=v.year;
            td3.innerText=v.vehicle_type;
            td4.innerText=v.drivetrain;
            td5.innerText=v.cylinders;
            td6.innerText=v.body_subtype;
            td7.innerText=v.doors;
            td8.innerText=v.made_in;
            td9.innerText=v.trim;
            td10.innerText=v.engine;
            td11.innerText=v.model;
            td12.innerText=v.engine_size;
            td13.innerText=v.fuel_type;
            td14.innerText=v.trim_r;
            td15.innerText=v.make;
            td16.innerText=v.price;
            td17.innerText=v.seller_type;
            td18.innerText=v.source;
            td19.innerText=v.interior_color;
            td20.innerText=v.exterior_color;
            td21.innerText=v.vin;
            let button=document.createElement("button");
            button.innerText="DELETE"
            button.addEventListener("click",()=>{
                deleteData(v.id);
            })
            td22.append(button);
            tr.append(td1,td2,td3,td4,td5,td6,td7,td8,td9,td10,td11,td12,td13,td14,td15,td16,td17,td18,td19,td20,td21,td22)
            tbody.appendChild(tr);
        })
    }
    document.getElementById("logout").addEventListener("click",()=>{
        localStorage.setItem("auth","");
        location="./index.html"
    })
    async function deleteData(id){
        console.log(id)
        try {
            let res = await fetch(`http://localhost:8080/vehicle/`+id, {
                method: 'DELETE',
                headers: {
                    'Authorization': `Bearer ${localStorage.getItem("auth")}`
                },
            });
            console.log(res)
            if (!res.ok) {
                console.log("something went wrong")
            } else {
                res=await res.json();
                fetchvehicles();
            }
        } catch (error) {
            console.log(error);
        }
    }
    function button(n)
{
    pagination.innerHTML="";
    for(let i=1;i<=n;i++)
    {
        let but=document.createElement("button")
        but.innerText=i;
        but.addEventListener("click",()=>{
            fetchvehicles(i,dataPerPage)
            console.log(i)
        })
        pagination.append(but)
    }
}