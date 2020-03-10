CREATE TYPE user_management.AddressType AS ENUM (
    'BILLING'
    );

ALTER TABLE user_management.address
    ADD COLUMN address_type AddressType NOT NULL DEFAULT 'BILLING';
