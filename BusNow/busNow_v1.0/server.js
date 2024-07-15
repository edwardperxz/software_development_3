const express = require('express');
const mysql = require('mysql2');
const cors = require('cors');
const bodyParser = require('body-parser');
const bcrypt = require('bcrypt');

const app = express();
const port = 3306;

// Configurar CORS y Body Parser
app.use(cors());
app.use(bodyParser.json());

// Configurar la conexión a la base de datos
const db = mysql.createConnection({
  host: 'localhost:3306',
  user: 'root',
  password: 'vanGOGH/3GG',
  database: 'BusNow'
});

db.connect((err) => {
  if (err) {
    throw err;
  }
  console.log('Connected to database');
});

// Crear rutas CRUD

// Crear usuario
app.post('/api/users', async (req, res) => {
  const { nombre, correo, password } = req.body;
  const hashedPassword = await bcrypt.hash(password, 10);
  const user = { nombre, correo, password: hashedPassword };
  const sql = 'INSERT INTO users SET ?';
  db.query(sql, user, (err, result) => {
    if (err) throw err;
    res.send(result);
  });
});

// Leer todos los usuarios
app.get('/api/users', (req, res) => {
  const sql = 'SELECT * FROM users';
  db.query(sql, (err, results) => {
    if (err) throw err;
    res.send(results);
  });
});

// Leer un usuario por ID
app.get('/api/users/:id', (req, res) => {
  const { id } = req.params;
  const sql = 'SELECT * FROM users WHERE id = ?';
  db.query(sql, [id], (err, result) => {
    if (err) throw err;
    res.send(result);
  });
});

// Actualizar un usuario por ID
app.put('/api/users/:id', async (req, res) => {
  const { id } = req.params;
  const { nombre, correo, password } = req.body;
  const hashedPassword = await bcrypt.hash(password, 10);
  const user = { nombre, correo, password: hashedPassword };
  const sql = 'UPDATE users SET ? WHERE id = ?';
  db.query(sql, [user, id], (err, result) => {
    if (err) throw err;
    res.send(result);
  });
});

// Eliminar un usuario por ID
app.delete('/api/users/:id', (req, res) => {
  const { id } = req.params;
  const sql = 'DELETE FROM users WHERE id = ?';
  db.query(sql, [id], (err, result) => {
    if (err) throw err;
    res.send(result);
  });
});

// Iniciar el servidor
app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});
