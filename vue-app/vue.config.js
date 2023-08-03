const { defineConfig } = require('@vue/cli-service')
const target = 'http://localhost:8080'
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 9090,   // you can change the port there
    proxy:{
      '/api':{
        target,
        changeOrigin:true
      },
      '/findAll':{
        target,
        changeOrigin:true
      }
    }
  },
  outputDir: '../app/src/main/resources/static'
})
