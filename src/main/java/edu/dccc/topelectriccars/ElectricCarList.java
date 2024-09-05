package edu.dccc.topelectriccars;

import java.util.ArrayList;

public class ElectricCarList {


    ArrayList<ElectricCar> carList = new ArrayList<>();


    public void populateElectricCarList() {
        carList.add(new ElectricCar("Tesla Model Y",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2020-tesla-model-y-long-range-101-1gg-1619638071.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                41190,244,"129/140/119 MPGe", 1));
        carList.add(new ElectricCar("Tesla Model 3",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/lhd-performance-hero-dgg-1619637548.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                38690,353,"142/150/133 MPGe", 2));
        carList.add(new ElectricCar("Chevrolet Bolt EV and EUV",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2022-chevrolet-bolt-ev-109-161gg-1619636720.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                37495,259,"118/127/108 MPGe", 3));
        carList.add(new ElectricCar("Ford Mustang Mach-E",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2021-ford-mustang-mach-e-4-104-16gg-1619635226.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                43995,305,"100/105/93 MPGe", 4));
        carList.add(new ElectricCar("Nissan Leaf",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2021-nissan-nissan-leaf-sv-plus-4-source-source-1619632959.jpg?crop=1xw:1xh;center,top&resize=980:*",
                32620,226,"111/123/99 MPGe", 5));
        carList.add(new ElectricCar("Audi e-tron and e-tron Sportback",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2020-audi-e-tron-sportback-133-1gg-1619634021.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                66995,222,"78/78/77 MPGe", 6));
        carList.add(new ElectricCar("Volkswagen ID.4",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/mx-exterior-hero-desktop-1-1619635017.jpg?crop=1xw:1xh;center,top&resize=980:*",
                41190,250,"91/104/89 MPGe", 7));
        carList.add(new ElectricCar("Tesla Model X ",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2020-tesla-model-y-long-range-101-1gg-1619638071.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                91190,371,"105/109/101 MPGe ", 8));
        carList.add(new ElectricCar("Porsche Taycan",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2020-porsche-taycan-turbo-s-and-2020-tesla-model-s-102-1ggg-1619630053.jpeg?crop=1xw:1xh;center,top&resize=980:*",
                81250,227,"79/76/84 MPGe", 9));
        carList.add(new ElectricCar("Tesla Model S",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/mx-exterior-hero-desktop-1-1619635017.jpg?crop=1xw:1xh;center,top&resize=980:*",
                81190,402,"117/121/112 MPGe", 10));
        carList.add(new ElectricCar("Hyundai Kona Electric",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/large-44706-2022konaelectric-1619629439.jpg?crop=1xw:1xh;center,top&resize=980:*",
                38575,258,"120/132/108 MPGe", 11));
        carList.add(new ElectricCar("Hyundai Ioniq Electric",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/large-42490-2021ioniqelectric-1619628240.jpg?crop=1xw:1xh;center,top&resize=980:*",
                34250,170,"133/145/121 MPGe", 12));
    }



public ArrayList<ElectricCar> getCarList() {
        return carList;
    }

}
