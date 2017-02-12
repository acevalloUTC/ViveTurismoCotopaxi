# --- Sample dataset

# --- !Ups


insert into categoria (id,name) values (  1,'Manifetaciones Culturales.');
insert into categoria (id,name) values (  2,'Sitios Naturales.');
insert into categoria (id,name) values (  3,'Páramos y Aventuras.');
insert into categoria (id,name) values (  4,' ');

insert into subcategoria (id,name,categoria_id) values (  1,'Aconteciminetos Programados.',1);
insert into subcategoria (id,name,categoria_id) values (  2,'Etnográficas.',1);
insert into subcategoria(id,name,categoria_id) values (  3,'Históricas.',1);
insert into subcategoria (id,name,categoria_id) values (  4,'Realizaciones Científicas y Técnicas.',1);

insert into subcategoria (id,name,categoria_id) values (  5,'Aguas Subterráneas y Ambientes Lacustres.',2);
insert into subcategoria (id,name,categoria_id) values (  6,'Fenómenos Espeleogógicos y Geológicos.',2);
insert into subcategoria(id,name,categoria_id) values (  7,'Montañas y Planicies.',2);
insert into subcategoria (id,name,categoria_id) values (  8,'Ríos.',2);
insert into subcategoria (id,name,categoria_id) values (  9,'Sistemas de Áreas Protegidas.',2);

insert into subcategoria (id,name,categoria_id) values (  10,'Rutas.',3);

insert into subcategoria (id,name,categoria_id) values (  11,' ', 4);
insert into subcategoria (id,name,categoria_id) values (  12,' ', 4);
insert into subcategoria (id,name,categoria_id) values (  13,' ', 4);
insert into subcategoria (id,name,categoria_id) values (  14,' ', 4);
insert into subcategoria (id,name,categoria_id) values (  15,' ', 4);

insert into canton (id,nomcanton) values (  1,'Latacunga.');
insert into canton (id,nomcanton) values (  2,'Salcedo.');
insert into canton (id,nomcanton) values (  3,'Pujilí.');
insert into canton (id,nomcanton) values (  4,'La Maná');
insert into canton (id,nomcanton) values (  5,'Pangua');
insert into canton (id,nomcanton) values (  6,'Saquisilí');
insert into canton (id,nomcanton) values (  7,'Sigchos.');

insert into parroquia (id,name,canton_id) values (  1,'La Matriz.',1);
insert into parroquia (id,name,canton_id) values (  2,'Ignacio Flores.',1);
insert into parroquia (id,name,canton_id) values (  3,'Eloy Alfaro',1);
insert into parroquia (id,name,canton_id) values (  4,'Juan Montalvo',1);
insert into parroquia (id,name,canton_id) values (  5,'San Buenaventura.',1);
insert into parroquia (id,name,canton_id) values (  6,'Toacaso.',1);
insert into parroquia (id,name,canton_id) values (  7,'Pastocalle.',1);
insert into parroquia (id,name,canton_id) values (  8,'Mulaló.',1);
insert into parroquia (id,name,canton_id) values (  9,'Tanicuchi.',1);
insert into parroquia (id,name,canton_id) values (  10,'Guaytacama.',1);
insert into parroquia (id,name,canton_id) values (  11,'Aláquez.',1);
insert into parroquia (id,name,canton_id) values (  12,'Poaló.',1);
insert into parroquia (id,name,canton_id) values (  13,'Once de Noviembre.',1);
insert into parroquia (id,name,canton_id) values (  14,'Belisario Quevedo.',1);
insert into parroquia (id,name,canton_id) values (  15,'Joseguango Bajo.',1);

insert into parroquia (id,name,canton_id) values (  16,'Panzaleo.',2);
insert into parroquia (id,name,canton_id) values (  17,'Antonio Jóse Holguin-Sta.Lucia.',2);
insert into parroquia (id,name,canton_id) values (  18,'Cusubamba.',2);
insert into parroquia (id,name,canton_id) values (  19,'Mulalillo.',2);
insert into parroquia (id,name,canton_id) values (  20,'Mulliquindil-Santa Ana.',2);

insert into parroquia (id,name,canton_id) values (  21,'Angamarca.',3);
insert into parroquia (id,name,canton_id) values (  22,'Guangaje.',3);
insert into parroquia (id,name,canton_id) values (  23,'La Victoria.',3);
insert into parroquia (id,name,canton_id) values (  24,'Pilaló.',3);
insert into parroquia (id,name,canton_id) values (  26,'Tingo',3);
insert into parroquia (id,name,canton_id) values (  27,'La Esperanza.',3);
insert into parroquia (id,name,canton_id) values (  28,'Zumbahua',3);

insert into parroquia (id,name,canton_id) values (  29,'Guasaganda.',4);
insert into parroquia (id,name,canton_id) values (  30,'Pucayácu.',4);
insert into parroquia (id,name,canton_id) values (  31,'El Carmen',4);
insert into parroquia (id,name,canton_id) values (  32,'El Triunfo.',4);
insert into parroquia (id,name,canton_id) values (  33,'La Matriz',4);

insert into parroquia (id,name,canton_id) values (  34,'Pinllopata.',5);
insert into parroquia (id,name,canton_id) values (  35,'Ramón Campaña.',5);
insert into parroquia (id,name,canton_id) values (  36,'Moraspungo',5);
insert into parroquia (id,name,canton_id) values (  37,'El Corazón.',5);

insert into parroquia (id,name,canton_id) values (  38,'Cochapamba.',6);
insert into parroquia (id,name,canton_id) values (  39,'Canchagua.',6);
insert into parroquia (id,name,canton_id) values (  40,'Chantilin',6);

insert into parroquia (id,name,canton_id) values (  41,'Chugchilán.',7);
insert into parroquia (id,name,canton_id) values (  42,'Las Pampas.',7);
insert into parroquia (id,name,canton_id) values (  43,'Palo Quemado.',7);
insert into parroquia (id,name,canton_id) values (  44,'La Matriz.',7);
insert into parroquia (id,name,canton_id) values (  45,'Isinliví.',7);

insert into parroquia (id,name,canton_id) values (  46,'La Matriz',2);
insert into parroquia (id,name,canton_id) values (  47,'La Matriz',3);
insert into parroquia (id,name,canton_id) values (  48,'La Matriz',6);

insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100001,'Fiestas de Carnaval La Mana','La Fiesta del folclor, y la alegría es el carnaval,y gracias a uno de los alcaldes del cantón hace unos años atrás se inició la festividad con la participación de comparsas locales y nacionales, teniendo una respuesta inmediata y una gran acogida, integrándola asi, a su cultura y su forma de vivir el carnaval. Estas fiestas duran de 2 a 3 días, con actividades para todo ámbito social niños,adultos, personas con capacidades especiales y jóvenes, todos disfrutan de las fiestas, entre los principales eventos esta la elección de la reina de Carnaval, Camisetas mojadas, La señorita de los ojitos bonitos y las piernas bonitas además por las noches realizan shows bailables con artitas reconocidos a nivel nacional e internacional. También se realizan ferias gastronómicas , de turismo, artesanales, juegos tradicionales, torneo de citas, rodeos montubios, entre otras actividads que ponen en relieve la elegria y el folklor de estas festividades.','A 212 m.s.n.m','895.png',1,1,4,33);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100002,'Mama Negra','Es la fiesta con la cual los habitates de la cuida de Latacunga celebran año tras año el aniversario de su independencia o fiestas política. Es un desfile de personajes populares,militares, civiles, eclesiásticos etc. cada uno de los personajes son escogidos por su desempeño y labores que realizan cada año,aunque no siempre estan todos los personajes que participan en la Mama Negra del 23 y 24 de septiembre. Su organización se encuentra a cargo del GAD Cantonal mediante jochas a las instituciones públicas, La Mama Negra es la figura central de esta fiesta, va cabalgando con donaire y maestría , ataviada con ricos ropajes típicos entre los que se destacan grandes faldones, blusa bordada, adornos y herosos pañolones que son cambiados en cada esquina del recorrido, con la ayuda de dos personas, mientras que una tercera porta un maletín lleno de estas prendas en gama completa de colores y modelos','Su recorrido avanza hasta la avenida Unidad Nacional','1562.png',1,1,1,1);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100003,'Fiestas de Navidad Los Caporales','Esta festividades se realizan en Navidad del 22 al 25 de Diciembre, dirigida por dos priostes llamados El Compadre y La Comadre, como una tradición antigua en adoración el Ñino Jesús con la ayuda de los Yuras quienes se encargan de los Caporales, los yumbos,las chinas, los loantes,ellos buscanlos disfraces y participates para representarlos. Además un Yura especial para la banda de músicos , y un Yura del árbol de la Navidad, a esto se suman otros personajes como la doña, el renguante, la guaricha y el payaso','A 36 km de Apahua y una altitud de 2882 m.s.n.m','1559.png',1,1,3,21);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100004,'Festividades de la Virgen del Quinche','Las Festividades se llevan acabo en la cabecera cantonal de Saquisilí, por las principales calles de la ciudad . La realización de las actividades programadas está a cargo del Comité de Fiestas del Cantón, sta festividad tiene casi un mes de duración, con diferentes eventos en los 36 barrios, las instituciones educativas y deportivas. Se llevan a cabo actividades populares y pricipalmente religiosas, acompañadas de toros de pueblo, música de banda, juegos pirotécnicos, show artísticos, bailes populares, posadas con la Imagen de la Virgen, El tradicional toro de matanza donado por el Prioste Mayor y el Saludo de Buenos Días a todos los Barrios. El evento de mayor concurrencia, los realizan el primer sábadp de febrero en que e desarrolla el desfile de confraternidad, con la participación de todos los Saquisilences en un desfile multicolor. Y el último día se lleva a cabo la Misa de fiestas en honor a la Virgen del Quinche con una procesión por las principales calles de la ciudad.',' A 31 km del Cantón Latacunga a una altitud de 2922 m.s.n.m','443.png',1,1,6,48);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100005,'Pista de Parapente Proterillo','Se desarrollan eventos programados por los clubes de parapente existentes en la Porvincia de Cotopaxi, quienes practican este deporte, ási como también algunas operadoras de turismo ofertan esta actividad, en dos pistas de tierra, con una diensión de 3 m por 10 m aproximadamente, en el Cerro Putzalahua.','A 9 km del centro de Belisario Quevedo','793.png',1,1,1,14);


insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100006,'Danzantes de Pujili','El Danzante es el protagonista más representativo de las celebraciones del Corpus Cristi en Pujilí, se tiene diversas teorías sobre su orígen, pero una de las más acogidos dice que tiene sus raíces en el antiguo Capac Citua o baile de los militares, el Danzante, Tushug o Sacerdote de la lluvia , baila en agradecimiento y alegría por la cosecha del maíz, representando movimientos rituales de guerra en honor al Inca o Cacique principal, se expresa también que los movimientos de sus brazos y el ritmo del baile hacen referencia al cóndor andino, en el pasado llevaba en su mano derecha una planta de maíz, costumbre transformada en la Colonia mediante el uso del Alfanje o sable El Danzante como personaje de gran valor cultural inmaterial forma parte de las diferentes fiestas en la zona, y mantiene una estrecha relación  con la música caracterizada del bombo y pingulo, quienes mantienen aún esta tradición y conocimiento, se ubican principalmente en sectores como Alpamalag de la parroquia Matriz, asi también en otros como Guangaje y Tigua, en base a su riqueza cultural ha sido declarado como Patrimonio Cultural Intangible del Ecuador del 11 de Abril de año 2002.','Centro de Pujili','1603.jpg',1,2,3,47);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100007,'Gastronomía Típica de Pujilí','Uno de los principales platos es el “hornado”, que viene acompañado de tostado, plátano maduro, mote y tortillas de papa, y su precio varía entre USD 3,00 Y USD 5,00 este plato es vendido los días sábado y domingos en el horario de 09h00 a 17hoo en el mercado central.Otro de platos típicos es el “caldo de menudo”, que se lo realiza con intestino y páncreas de cerdo , el caldo tiene leche y va acompañado de picadillo, su valor es de USD 2,00 el igual que las “morcillas” que son intestinos de cerdo rellenos con una mezcla dulce de col, arroz, pasas y varias especias.','Centro de Pujili ','1600.jpg',1,2,3,47);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100008,'Artesanías en Miniatura de Pujilí','La familia Olmos, es una de las familias que ha desarrollado esta técnica y otras diferentes, continuando con la tradición de elaborar diversos tipos de objetos utilitarios, ornamentalmente, juguetes y otros del cantón Pujilí, desde hace ya varios años se elaboran estas artesanías en miniatura y hacen referencia al nombre de Pujilí, con una de sus significados “tierra de juguetes” Parte del conocimiento es familiar ya que tienen alrededor de la quinta generación elaborando este tipo de artesanías,  sus obras de arte siempre son elaboradas con motivo de las fiestas del cantón, los pueblos rurales, los danzantes, músicos, vacas locas y otras tradiciones . Uno de los puntos de exposición y venta se encuentra ubicado en la esquina del parque central de la cabecera cantonal de Pujilí, y otro a unas 3 cuadras del terminal terrestre , vía a Latacunga, así también varias familias distribuidas en diferentes sitios de la ciudad elaboran este tipo de piezas, especialmente para las Feria de Finados que se lleva a cabo en el mes de noviembre.','Centro de Pujili junto al Parque','1597.jpg',1,2,3,47);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100009,'Alfarería La Victoria','La mayoría de artesanos de la cerámica en la parroquia tienen una historia de herencia familiar en cuanto a la elaboración de objetos de barro, ya que las técnicas del trabajo con el barro han sido transmitidas por medio de la observación y la practica el ayudar en los talleres familiares.  Se conoce que desde antes de la conquista ya existía la alfarería en el sector, los principales productos que se elaboraban eran tinajas y ollas, sin embargo no tenían una técnica específica y fue después de la llegada de la Misión Andina por los años 70, gracias a la instalación de un taller, que este conocimiento se ha ido desarrollando técnicamente. En la actualidad existen contados artesanos que aun trabajan el barro en tornos artesanales y producen objetos utilitarios, adornos, juguetes, entre otros, siendo el lugar más representativo el sector de El Tejar de la Parroquia La Victoria.',' A 10 Km de Zumbagua en la vía Zubahua-Pujilí','1594.jpg',1,2,3,23);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100010,'Galerías Artesanales de Tigua','En este sitio se puede adquirir algunos tipos de artesanías como: cuadros pintados en cuero de borrego con paisajes del sector y leyendas tradicionales, como la del “Cóndor Enamorado”, máscaras de madera con figuras de animales como perros, lobos y diablos, con vistosos colores, así como también gorras, guantes, bufandas, tejidas en lana. Las Tradicionales pinturas en cuero de borrego o estilo “naif” con variados colores y representaciones de actividades y tradiciones de la zona, constituyen un valor artístico inigualable, siendo Julio y Alfredo Toaquiza los artistas más representativos que se dedican a este arte, desde hace ya cuarenta años.','a 10 Km de Zumbagua en la vía Zubahua-Pujilí','1591.jpg',1,2,3,28);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100011,'Feria de Zumbahua','La Feria Zumbahua es un lugar donde se puede observar la expresión cultural local, a través de la gente que participan en ella desde tempranas horas de la mañana, especialmente en la plaza  Rumiñahui donde se concentran los comerciales para la compra y venta de productos, entre los principales se encuentran las papas de cebolla conjuntamente con productos de diferentes zonas de país, como la panela, aguardiente, bananos, plátanos, entre otras. En otras áreas se presenta toda clase de víveres y comida como papas con cuy asado, mote, fritada, caldo de gallina, entre otros.Así también, en otro espacio se ubican artesanías y prendas de vestir como chalinas, bufandas y gorras. Y en la plaza de animales se encuentran camélidos , bovinos, ovinos , caprinos , porcinos, y especies menores como conejos, cuyes, gallinas.','1588.jpg',1,2,3,28);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100012,'Gastronomía de Mulliquindil Santa Ana','El plato más reconocido en la parroquia es el pescado, que se ha convertido en algo típico desde hace más de 30 años, La especialidad es el pescado frito hecho a fuego de leña, se sirve con papas fritas, yuca cocinada y ensalada, y se lo combina con chicha de avena y otras bebidas, también se lo prepara al vapor para las personas que prefieren comer más saludable. El tipo de pescado más apetecido es la tilapia, picudo, lenguado; para abastecer a la demanda se usa entre 16 a 20 quintales de pescado semanales.La afluencia de visitantes rodea las 1500 personas cada fin de semana, provenientes de diferentes partes del país, principalmente de Tungurahua, Chimborazo, Pichincha y de la misma provincia de Cotopaxi.','A 5 Km de Salcedo','1585.jpg',1,2,3,20);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (100013,'Zona Gastronómica de Panzaleo','En este sector muy conocido gastronómicas desde 1998 se venden las conocidas fritada, en alrededor de 11 locales y 4 de estos también ofrecen los deliciosos cuyes asados. Anteriormente se faenaban a los animales en los mismos locales, y era común mirar al chancho colgado de la puerta, actualmente este proceso se lleva a cabo en el camal municipal garantizando la seguridad alimentaria. Después del faenamiento del chancho, la carne se la deja reposaren agua una noche, después se cocina la carne con aliños naturales, como ajo, cebolla blanca, cebolla colorada durante una hora, luego se retira la carne y se la pone a dorar en la grasa del propio cerdo, en pailas de  bronce que ayudan a que La cocción sea más efectiva. Se sirve con papas, maduro y ensalada. El cuy asado, se acompaña con papas, con salsa, aguacate y ensalada. ','Latacunga-Ambato','1582.jpg',1,2,2,16);


insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (1000014,'Parque Náutico "Laguna Ignacio Flores"','Por el año 1850 era una llanura con fuentes naturales de agua, de uso agropecuario y lavanderías de ropa para las familias nobles, sobre la cual en 1920 se construyó la laguna artificial, que tiene forma ovalada, con un “islote” al cual se accede por un puente ornamental de diseño moderno.En su entorno se ha añadido facilidades como una tarima de madera para espectáculos, juegos infantiles, máquinas de ejercicios al aire libre, biblioteca, área infantil lúdica, espacios verdes, señalización, ciclo vías adoquinadas de 4 m de acho alrededor del parque, iluminación nocturna de la laguna, basureros ecológicos, sitios de descanso como bancas, mesas y una pista peatonal para quienes disfrutan de caminatas.','Sector MiraFlores','796.png',1,4,3,2);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (1000015,'Mirador Shalalá','Esta obra técnica constituye una verdadera oportunidad para ofrecer al visitante la opción de apreciar la Lagua de Quilotoa desde el punto más alto y prominente de la caldera en el cráter en que esta se forma.Desde el punto de vista arquitectónico, constituye una estructura austera que busca integrarse al entorno, formada por una unidad estructural de acero recubierta con madera que se mimetiza en los colores de la naturaleza. Integrada por una plataforma que se extiende hacia el interior del cráter desde si borde y un graderío que sigue la inclinación del declive natural, ofrece una vista privilegiada provocado contemplación y vértigo.Ofrece elementos de protección que a la vez facilitan la visibilidad del entorno, por esto, se utiliza únicamente vidrios de seguridad en los bordes abiertos, a esto se suma el sendero que lleva al mirador con bordes de piedra y relleno de grava, señalética y recolectores de basura que brindan las facilidades para su uso y aprovechamiento.','Borde de la Laguna Quilotoa','1639.jpg',1,4,3,28);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (1000016,'Centro Recreacional Nagsiche','Su infraestructura se encuentra conformada por dos piscinas, una grande, cuya característica especial es su piso de madera que permite la circulación del agua, y una piscina para niños al lado sur, cuenta con camerinos, área de duchas, construcción en la que se ha implementado un salón de eventos con todas las facilidades, cuenta también con dos puentes peatonales que permiten el acceso desde la ciudad por una ruta de caminatas y ciclismo, se complementa con canchas de básquet, vóley e indor.','A 1.3 Km al noroeste del Parque de Panzleo','349.png',1,4,2,46);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (1000017,'Producción de Quesos de La Parroquia Chugchilán','La producción quesera en la parroquia y especialmente en el sector de Chinaló tuvo su origen en los proyectos implementados por organizaciones no gubernamentales como OMG “Operación Mato Grosso” con la utilización de técnicas suizas, lo cual ha atraído la atención de turistas, nacionales y degustar sus productos.A partir de estos emprendimientos varias asociaciones comunitarias desarrollan actividades en torno a la producción de lácteos en la parroquia, con el trabajo productivo que incluye, la obtención de crema, elaboración de helados y productos de quesos, que consiste en la recolección de leche en un tanque al cual se añade un fermento natural y cuajo hasta formar una cuajada que se corta con una lira y se deja en reposo por cinco minutos, para luego batir la mezcla y sacar el suero, dejando la masa con la que finalmente se arman los quesos en moldes.','En la Comunidad de Chinaló','383.png',1,4,7,41);
insert into turismo (id,name,description,direccion,foto,categoria_id,subcategoria_id,canton_id,parroquia_id) values (1000018,'Producción de Chocho de la Parroquia Chugchilán','Principalmente las comunidades de Guayama San Pedro, Guayama Grande y otros lugares de la parroquia se dedican a la producción de chocho, a partir de la intervención de varias ONGs, entre ellas CESA y Maquita Cushunchic para la conformación de redes de producción y comercialización.Para obtener el producto procesado que sale a la venta se adquiere el chocho fresco que pasa por un proceso de secad, luego es lavado y colocado en el tanque de hidratación por 24 horas, se cocina durante 45 minutos a una temperatura de 92° C, luego se pasa al tanque de enfriamiento, una vez cocinado se selecciona y se cambia de agua 3 veces diarias durante 7 días, finalmente pasa a ser clasificado y empacado en varias presentaciones.','Vía Sigchos – Chugchilán','379.png',1,4,7,41);

# --- !Downs


delete from subcategoria;
delete from turismo;
delete from parroquia;
delete from canton;

update from subcategoria;
update from categoria;
update from turismo;
update from parroquia;
update from canton;
