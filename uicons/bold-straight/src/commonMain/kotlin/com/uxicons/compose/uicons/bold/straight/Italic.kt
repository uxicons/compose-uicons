package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italic: ImageVector? = null

val Icons.Bs.Italic: ImageVector
    get() = _Italic ?: UXIcon(name = "Italic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineToRelative(0f, -3f)
                lineToRelative(-15f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(5.71f, 0f)
                lineToRelative(-2.45f, 18f)
                lineToRelative(-6.26f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(15f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-5.71f, 0f)
                lineToRelative(2.45f, -18f)
                lineToRelative(6.26f, 0f)
                close()
            }
        }.also { _Italic = it}
