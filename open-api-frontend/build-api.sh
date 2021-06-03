rm lib/openApiClient-1.0.0.tgz
openapi-generator-cli generate -g typescript-angular -i contracts/openapi3.yaml -o temp --additional-properties=npmName=openApiClient,npmVersion=1.0.0
cd temp
npm install --force && npm run build --force
cd dist
npm pack
cp openApiClient-1.0.0.tgz ../../lib/
cd ../../
rm -rf temp
