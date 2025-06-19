-- Inserciones en cargo
insert into cargo (nombre) values ('Administrador');
insert into cargo (nombre) values ('Almacenero');
insert into cargo (nombre) values ('Asistente de Recibo');
insert into cargo (nombre) values ('Gerente de Compras');
insert into cargo (nombre) values ('Coordinador de Producción');

-- Inserciones en usuario
insert into usuario (nombre, correo, contrasena, cargo_id) values ('Carlos Pérez', 'carlos@tailoy.com', '123456', 1);
insert into usuario (nombre, correo, contrasena, cargo_id) values ('Lucía Gómez', 'lucia@tailoy.com', 'abcdef', 2);
insert into usuario (nombre, correo, contrasena, cargo_id) values ('Jorge Rivas', 'jorge@tailoy.com', 'clave123', 3);
insert into usuario (nombre, correo, contrasena, cargo_id) values ('Ana Torres', 'ana@tailoy.com', 'qwerty', 4);
insert into usuario (nombre, correo, contrasena, cargo_id) values ('Luis Mendoza', 'luis@tailoy.com', 'zxcvbn', 5);

-- Inserciones en categoria
insert into categoria (nombre) values ('Útiles escolares');
insert into categoria (nombre) values ('Tecnología');
insert into categoria (nombre) values ('Juguetería');
insert into categoria (nombre) values ('Papelería');
insert into categoria (nombre) values ('Oficina');

-- Inserciones en subcategoria
insert into subcategoria (nombre, categoria_id) values ('Lapiceros', 1);
insert into subcategoria (nombre, categoria_id) values ('Cuadernos', 1);
insert into subcategoria (nombre, categoria_id) values ('Tablets', 2);
insert into subcategoria (nombre, categoria_id) values ('Laptops', 2);
insert into subcategoria (nombre, categoria_id) values ('Rompecabezas', 3);

-- Inserciones en producto
insert into producto (codigo, nombre, marca, descripcion, subcategoria_id, stock, precio_unitario, unidad_medida, estado) values (1001, 'Lapicero Azul', 'Faber-Castell', 'Lapicero tinta azul', 1, 100, 1.50, 'Unidad', 1);
insert into producto (codigo, nombre, marca, descripcion, subcategoria_id, stock, precio_unitario, unidad_medida, estado) values (1002, 'Cuaderno rayado', 'Standford', 'Cuaderno A4 rayado', 2, 200, 3.20, 'Unidad', 1);
insert into producto (codigo, nombre, marca, descripcion, subcategoria_id, stock, precio_unitario, unidad_medida, estado) values (2001, 'Tablet Android', 'Lenovo', 'Tablet de 10 pulgadas', 3, 50, 350.00, 'Unidad', 1);
insert into producto (codigo, nombre, marca, descripcion, subcategoria_id, stock, precio_unitario, unidad_medida, estado) values (2002, 'Laptop 15"', 'HP', 'Laptop 15 pulgadas, 8GB RAM', 4, 30, 2400.00, 'Unidad', 1);
insert into producto (codigo, nombre, marca, descripcion, subcategoria_id, stock, precio_unitario, unidad_medida, estado) values (3001, 'Puzzle 500 piezas', 'Ravensburger', 'Rompecabezas infantil', 5, 80, 25.00, 'Caja', 1);

-- Inserciones en proveedor
insert into proveedor (nombre, ruc, telefono, direccion, estado) values ('Distribuidora Escolar SAC', '20123456789', '012345678', 'Av. Perú 1234', 1);
insert into proveedor (nombre, ruc, telefono, direccion, estado) values ('Tech Import S.A.', '20567891234', '012345679', 'Jr. Tecnología 456', 1);
insert into proveedor (nombre, ruc, telefono, direccion, estado) values ('Juguetes y Más SAC', '20876543210', '012345680', 'Av. Juguetes 789', 1);
insert into proveedor (nombre, ruc, telefono, direccion, estado) values ('Oficinas Perú SRL', '20987654321', '012345681', 'Av. Arequipa 321', 1);
insert into proveedor (nombre, ruc, telefono, direccion, estado) values ('Papelería Lima', '20765432109', '012345682', 'Av. La Marina 654', 1);

-- Inserciones en orden_compra
insert into orden_compra (proveedor_id, fecha, estado_operacion) values (1, '2025-06-01 09:00:00', 1);
insert into orden_compra (proveedor_id, fecha, estado_operacion) values (2, '2025-06-03 14:30:00', 1);
insert into orden_compra (proveedor_id, fecha, estado_operacion) values (3, '2025-06-05 10:15:00', 1);
insert into orden_compra (proveedor_id, fecha, estado_operacion) values (4, '2025-06-07 16:00:00', 0);
insert into orden_compra (proveedor_id, fecha, estado_operacion) values (5, '2025-06-10 11:45:00', 0);

-- Inserciones en orden_compra_producto
insert into orden_compra_detalle (orden_compra_id, producto_id, cantidad, precio_unitario, observaciones) values (1, 1, 50, 1.50, 'Entrega rápida');
insert into orden_compra_detalle (orden_compra_id, producto_id, cantidad, precio_unitario, observaciones) values (2, 3, 10, 350.00, 'Revisar garantía');
insert into orden_compra_detalle (orden_compra_id, producto_id, cantidad, precio_unitario, observaciones) values (3, 5, 20, 25.00, 'Entrega parcial');
insert into orden_compra_detalle (orden_compra_id, producto_id, cantidad, precio_unitario, observaciones) values (4, 2, 100, 3.20, '');
insert into orden_compra_detalle (orden_compra_id, producto_id, cantidad, precio_unitario, observaciones) values (5, 4, 5, 2400.00, 'Urgente');

-- Inserciones en sucursal
insert into sucursal (ciudad, direccion, correo) values ('Lima', 'Av. Brasil 123', 'lima@tailoy.com');
insert into sucursal (ciudad, direccion, correo) values ('Arequipa', 'Av. Ejército 456', 'arequipa@tailoy.com');
insert into sucursal (ciudad, direccion, correo) values ('Trujillo', 'Av. Larco 789', 'trujillo@tailoy.com');
insert into sucursal (ciudad, direccion, correo) values ('Cusco', 'Av. Cultura 321', 'cusco@tailoy.com');
insert into sucursal (ciudad, direccion, correo) values ('Chiclayo', 'Av. Bolognesi 654', 'chiclayo@tailoy.com');

-- Inserciones en despacho_sucursal
insert into despacho_sucursal (estado_operacion, fecha, sucursal_id) values (1, '2025-06-02 08:30:00', 1);
insert into despacho_sucursal (estado_operacion, fecha, sucursal_id) values (1, '2025-06-04 13:00:00', 2);
insert into despacho_sucursal (estado_operacion, fecha, sucursal_id) values (0, '2025-06-06 15:20:00', 3);
insert into despacho_sucursal (estado_operacion, fecha, sucursal_id) values (1, '2025-06-08 17:50:00', 4);
insert into despacho_sucursal (estado_operacion, fecha, sucursal_id) values (0, '2025-06-11 10:00:00', 5);

-- Inserciones en despacho_sucursal_producto
insert into despacho_sucursal_detalle (despacho_sucursal_id, producto_id, cantidad, precio_unitario, observaciones) values (1, 1, 30, 1.50, 'Bien embalado');
insert into despacho_sucursal_detalle (despacho_sucursal_id, producto_id, cantidad, precio_unitario, observaciones) values (2, 2, 40, 3.20, '');
insert into despacho_sucursal_detalle (despacho_sucursal_id, producto_id, cantidad, precio_unitario, observaciones) values (3, 3, 5, 350.00, 'Cuidado con pantalla');
insert into despacho_sucursal_detalle (despacho_sucursal_id, producto_id, cantidad, precio_unitario, observaciones) values (4, 4, 2, 2400.00, 'Manejo con cuidado');
insert into despacho_sucursal_detalle (despacho_sucursal_id, producto_id, cantidad, precio_unitario, observaciones) values (5, 5, 10, 25.00, 'Sin observación');

-- Inserciones en movimiento_almacen
insert into movimiento_almacen (tipo_almacen, cantidad) values (1, 100);
insert into movimiento_almacen (tipo_almacen, cantidad) values (2, 50);
insert into movimiento_almacen (tipo_almacen, cantidad) values (1, 70);
insert into movimiento_almacen (tipo_almacen, cantidad) values (2, 20);
insert into movimiento_almacen (tipo_almacen, cantidad) values (1, 40);

-- Inserciones en movimiento_almacen_producto
insert into movimiento_almacen_detalle (movimiento_almacen_id, producto_id) values (1, 1);
insert into movimiento_almacen_detalle (movimiento_almacen_id, producto_id) values (2, 3);
insert into movimiento_almacen_detalle (movimiento_almacen_id, producto_id) values (3, 2);
insert into movimiento_almacen_detalle (movimiento_almacen_id, producto_id) values (4, 5);
insert into movimiento_almacen_detalle (movimiento_almacen_id, producto_id) values (5, 4);

-- Inserciones en historial_accion
insert into historial_accion (usuario_id, tipo_accion, descripcion, modulo) values (1, 1, 'Creación de producto', 1);
insert into historial_accion (usuario_id, tipo_accion, descripcion, modulo) values (2, 2, 'Actualización de stock', 2);
insert into historial_accion (usuario_id, tipo_accion, descripcion, modulo) values (3, 3, 'Eliminación de orden', 3);
insert into historial_accion (usuario_id, tipo_accion, descripcion, modulo) values (4, 1, 'Creación de proveedor', 4);
insert into historial_accion (usuario_id, tipo_accion, descripcion, modulo) values (5, 2, 'Modificación de categoría', 5);

-- Inserciones en movimiento_inventario
insert into movimiento_inventario (producto_id, cantidad, nombre, tipo_movimiento, usuario_id) values (1, 50, 'Ingreso por compra', 1, 1);
insert into movimiento_inventario (producto_id, cantidad, nombre, tipo_movimiento, usuario_id) values (2, 100, 'Ingreso inicial', 1, 2);
insert into movimiento_inventario (producto_id, cantidad, nombre, tipo_movimiento, usuario_id) values (3, 10, 'Salida por despacho', 2, 3);
insert into movimiento_inventario (producto_id, cantidad, nombre, tipo_movimiento, usuario_id) values (4, 5, 'Salida por baja', 2, 4);
insert into movimiento_inventario (producto_id, cantidad, nombre, tipo_movimiento, usuario_id) values (5, 20, 'Ingreso por ajuste', 1, 5);
