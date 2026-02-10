package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y: ImageVector? = null

val Icons.Bs.Y: ImageVector
    get() = _Y ?: UXIcon(name = "Y") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.66f, 0f)
                lineToRelative(-3.72f, 0f)
                lineToRelative(-6.94f, 9.46f)
                lineToRelative(-6.94f, -9.46f)
                lineToRelative(-3.72f, 0f)
                lineToRelative(9.16f, 12.49f)
                lineToRelative(0f, 11.51f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -11.51f)
                lineToRelative(9.16f, -12.49f)
                close()
            }
        }.also { _Y = it}
