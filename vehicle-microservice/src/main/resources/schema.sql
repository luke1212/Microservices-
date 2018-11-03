CREATE TABLE IF NOT EXISTS Vehicle (
  id                BIGINT AUTO_INCREMENT,
  make              CHAR(20),
  model             CHAR(20),
  model_year        INT,
  registration_id   BIGINT,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Registration (
  id                BIGINT AUTO_INCREMENT,
  license_plate     CHAR(16),
  licensed_to       CHAR(128),
  PRIMARY KEY (id)
)
