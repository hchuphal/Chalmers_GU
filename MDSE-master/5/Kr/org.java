
//NEW BRICK CENTER
//2*2 cylinders on top of the brick
tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 0, 0.75);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 0, 3.5);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 0, 0.75);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 0, 3.5);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cylinder on the inside of the brick
tube = new Cylinder(2, 0.95, 0.95, 1);
pos = new Vec3(2.125, 1.4, 2.125);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cover plate of the brick carrying the 2*2 top cylinders
cube = new Cube(5, 0.25, 5);
pos = new Vec3(2.1, 0.5, 2.1);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

//4 vertical sides on the brick
cube = new Cube(0.25, 2, 5);
pos = new Vec3(-0.4, 1.4, 2.1);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(0.25, 2, 5);
pos = new Vec3(4.55, 1.4, 2.1);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 1.4, -0.4);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 1.4, 4.55);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));


//NEW BRICK LEFT

//Cyllinders
tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 0, 6);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 0, 8.8);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));


tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 0, 6);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 0, 8.8);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cylinder on the inside of the brick
tube = new Cylinder(2, 0.95, 0.95, 1);
pos = new Vec3(2.125, 1.4, 7.4);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cover plate of the brick carrying the 2*2 top cylinders
cube = new Cube(5, 0.25, 5);
pos = new Vec3(2.1, 0.5, 7.4);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

//4 vertical sides on the brick
cube = new Cube(0.25, 2, 5);
pos = new Vec3(-0.4, 1.4, 7.4);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(0.25, 2, 5);
pos = new Vec3(4.55, 1.4, 7.4);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 1.4, 4.8);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 1.4, 9.8);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

//NEW BRICK RIGHT

//Cyllinders
tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 0, -1.75);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 0, -4.55);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 0, -1.75);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 0, -4.55);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cylinder on the inside of the brick
tube = new Cylinder(2, 0.95, 0.95, 1);
pos = new Vec3(2.125, 1.4, -3.15);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cover plate of the brick carrying the 2*2 top cylinders
cube = new Cube(5, 0.25, 5);
pos = new Vec3(2.1, 0.5, -3.2);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

//4 vertical sides on the brick
cube = new Cube(0.25, 2, 5);
pos = new Vec3(-0.4, 1.4, -3.2);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(0.25, 2, 5);
pos = new Vec3(4.55, 1.4, -3.2);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 1.4, -0.65);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 1.4, -5.65);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

//NEW BRICK TOP

//2*2 cylinders on top of the brick
tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 2, 0.75);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(0.75, 2, 3.5);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 2, 0.75);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

tube = new Cylinder(0.75, 1, 1, 1);
pos = new Vec3(3.5, 2, 3.5);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cylinder on the inside of the brick
tube = new Cylinder(2, 0.95, 0.95, 1);
pos = new Vec3(2.125, 3.4, 2.125);
script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));

//1 cover plate of the brick carrying the 2*2 top cylinders
cube = new Cube(5, 0.25, 5);
pos = new Vec3(2.1, 3.5, 2.1);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

//4 vertical sides on the brick
cube = new Cube(0.25, 2, 5);
pos = new Vec3(-0.4, 3.4, 2.1);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(0.25, 2, 5);
pos = new Vec3(4.55, 3.4, 2.1);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 3.4, -0.4);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));

cube = new Cube(5, 2, 0.25);
pos = new Vec3(2.1, 3.4, 4.55);
script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));