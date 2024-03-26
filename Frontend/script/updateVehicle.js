document.getElementById('addVehicle').addEventListener('click', function() {
    document.getElementById('popupForm').style.display = 'block';
  });
let form=document.getElementById('vehicleForm');
    form.addEventListener("submit",async function(event) {
        event.preventDefault();
        let  data = {
        year: parseInt(form.year.value),
        vehicle_type: form.vehicleType.value,
        drivetrain: form.drivetrain.value,
        cylinders: parseInt(form.cylinders.value),
        body_subtype: form.bodySubtype.value,
        doors: parseInt(form.doors.value),
        made_in: form.madeIn.value,
        trim: form.trim.value,
        engine: form.engine.value,
        model: form.model.value,
        engine_size: parseFloat(form.engineSize.value),
        fuel_type: form.fuelType.value,
        trim_r: form.trimR.value,
        make: form.make.value,
        price: parseFloat(form.price.value),
        seller_type: form.sellerType.value,
        source: form.source.value,
        interior_color: form.interiorColor.value,
        exterior_color: form.exteriorColor.value,
        vin: form.vin.value
    };
    update(data);
    
    })

    async function update(data){
        try {
            let res = await fetch('http://localhost:8080/vehicle', {
                method: 'POST',
                headers: {
                    'Content-Type':'application/json',
                    'Authorization': `Bearer ${localStorage.getItem("auth")}`
                },
                body:JSON.stringify(data)
            });
            if (!res.ok) {
                console.log("something went wrong")
            } else {
                res=await res.json();
                console.log(res);
                document.getElementById('popupForm').style.display = 'none';
                fetchvehicles(1,dataPerPage)
            }
        } catch (error) {
            console.log(error);
        }

    }
    document.getElementById("logout").addEventListener("click",()=>{
        localStorage.setItem("auth","");
        location="./index.html"
    })
    document.querySelector('.closeBtn').addEventListener('click', function() {
        document.getElementById('popupForm').style.display = 'none';
      });