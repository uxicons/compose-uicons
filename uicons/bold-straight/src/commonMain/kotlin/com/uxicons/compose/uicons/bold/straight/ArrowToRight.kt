package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToRight: ImageVector? = null

val Icons.Bs.ArrowToRight: ImageVector
    get() = _ArrowToRight ?: UXIcon(name = "ArrowToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9.26f)
                lineToRelative(-4.33f, -4.33f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.45f, 3.45f)
                lineToRelative(-18.0f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(18.0f, 0f)
                lineToRelative(-3.45f, 3.45f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.33f, -4.33f)
                lineToRelative(0f, 4.26f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -14f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 4.26f)
                close()
            }
        }.also { _ArrowToRight = it}
