<template>
  <div id="app">
    <hello-world>
    </hello-world>
    <option-list>
    </option-list>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld";
import OptionList from "@/components/OptionList";

export default {
  components:{
    HelloWorld,
    OptionList
  },
  async mounted(){
    await this.$store.dispatch('loadOptionList')

  }
}
</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color:  #4991df;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #4991df;
    background: #8c2c7f;
    &.router-link-exact-active {
      color: #322c8c;
    }
  }
}
</style>
