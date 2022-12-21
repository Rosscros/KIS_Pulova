<template>
  <TR>
    <TD>{{optionData.optionName}}</TD>
    <TD>{{optionData.optionValue}}</TD>
  </TR>
</template>

<script>
export default {
  name: "OptionRow",
  props: {
    optionData: Object
  }
}
</script>

<style scoped>
TR{
  background: #857099;
  font-size: 18px;
  font-weight: bold;
  text-align: left;
}
TR:hover{
  background-color: #5b0606;
}
TD{
  padding-left: 3px;
  width: 50%;
}

</style>