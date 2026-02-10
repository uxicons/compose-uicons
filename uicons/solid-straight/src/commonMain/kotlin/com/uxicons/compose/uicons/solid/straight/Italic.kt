package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italic: ImageVector? = null

val Icons.Ss.Italic: ImageVector
    get() = _Italic ?: UXIcon(name = "Italic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineToRelative(0f, -2f)
                lineToRelative(-15f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(6.35f, 0f)
                lineToRelative(-2.73f, 20f)
                lineToRelative(-6.63f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(15f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-6.35f, 0f)
                lineToRelative(2.73f, -20f)
                lineToRelative(6.63f, 0f)
                close()
            }
        }.also { _Italic = it}
