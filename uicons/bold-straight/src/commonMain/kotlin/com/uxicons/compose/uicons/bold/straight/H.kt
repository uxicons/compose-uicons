package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H: ImageVector? = null

val Icons.Bs.H: ImageVector
    get() = _H ?: UXIcon(name = "H") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineToRelative(0f, 10f)
                lineToRelative(-14f, 0f)
                lineToRelative(0f, -10f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 24f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -11f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, 11f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -24f)
                lineToRelative(-3f, 0f)
                close()
            }
        }.also { _H = it}
