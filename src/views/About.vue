<template>
  <div class="about">
    <h1>This is an about page</h1>
    <HelloWorld msg="hello hello"></HelloWorld>
  </div>
</template>

<script>

import Vue from 'vue'
import HelloWorld from '@/components/HelloWorld.vue'

export default Vue.extend({
  name: 'about',
  components: {
    HelloWorld,
  }
})
</script>