<?php

class classRef {

    public function ref($item) {
        return "<a href=\"profile.php?item={$rs['itemnumber']}\">{$rs['itemnumber']}</a>";
    }

    public function form() {
        return
                "<div class=\"container text-center\">
      <div class=\"row-fluid\">
        <div class=\"span12\">
            <form method=\"GET\" action=\"profile.php\">
                <div class=\"control-group\">
                    <input type=\"hidden\" value=\"{$item}\" name=\"item\">
                </div>
                <div class=\"control-group\">
                    <div class=\"controls\">
                        <button type=\"submit\" class=\"btn btn-info btn-large\">{$item}</button>
                    </div>
                </div>
            </form>
        </div>
    </div>    
</div>";
        ;
    }

}
?>






