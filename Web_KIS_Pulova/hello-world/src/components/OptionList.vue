<template>
  <div style="text-align: center">
    <button class="btn1" v-on:click="appendRow">Добавить</button>
    <button class="btn2" v-on:click="appendRow">Удалить</button>
    <button class="btn3" v-on:click="appendRow">Изменить</button>
    <TABLE>
      <TR>
        <TH>Имя</TH>
        <TH>Значение</TH>
      </TR>
      <option-row v-for="option in optionList" v-bind:key="option.optionName" :option-data="option">
      </option-row>
    </TABLE>
  </div>
</template>

<script>
import OptionRow from "./OptionRow";

export default {

  name: "OptionList",
  components: {
    OptionRow
 },
  computed:{
    optionList(){
      return this.$store.getters.getOptionList
    },
  },
  methods: {
    appendRow(){
      alert('Сообщение')
    }
  }
}
</script>

<style scoped>

TABLE{
  background: #3eb146;
  width: 50%;
  margin-left: auto;
  margin-right: auto;
}
TH{
  color: #c7fff8;
}
TR{
  color: #b77d1a;
}
TR:hover{
  color: #c7fff8;
}
TH{
  font-size: 18px;
}

.btn1{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 15px 0 0;
  height: 46px;
  width: 100px;
  border: none;
  font-size: 12px;
  font-weight: bold;
  background-color: #8c2c7f;
  color: #322c8c;
}
.btn1:hover{
  transition: all 0.2s;
  background-color: #322c8c;
  color: #4991df;
}
.btn1:active{
  background-color: #49df8a;
}
.btn2{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 15px 15px 0;
  height: 46px;
  width: 100px;
  border: none;
  font-size: 14px;
  font-weight: bold;
  background-color: #4991df;
  color: #322c8c;
}
.btn2:hover{
  transition: all 0.2s;
  background-color: #322c8c;
  color: #4991df;
}
.btn2:active{
  background-color: #49df8a;
}
.btn3{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 0 15px 0;
  height: 46px;
  width: 100px;
  border: none;
  font-size: 14px;
  font-weight: bold;
  background-color: #4991df;
  color: #322c8c;
}
.btn3:hover{
  transition: all 0.2s;
  background-color: #322c8c;
  color: #4991df;
}
.btn3:active{
  background-color: #322c8c;
}
</style>