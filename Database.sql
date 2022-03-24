SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'app'
AND table_name = 'logins';