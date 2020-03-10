CREATE TYPE user_management.address_type AS ENUM (
    'BILLING'
    );

ALTER TABLE user_management.address
    ADD COLUMN address_type user_management.address_type NOT NULL DEFAULT 'BILLING';
