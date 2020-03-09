CREATE TABLE user_management.address
(
    id                 UUID                     NOT NULL PRIMARY KEY,
    country            VARCHAR,
    city               VARCHAR,
    street             VARCHAR,
    house_number       VARCHAR,
    floor              VARCHAR,
    zip_code           VARCHAR,
    additional_address VARCHAR,
    info               VARCHAR,
    created_at         TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at         TIMESTAMP WITH TIME ZONE NOT NULL
);