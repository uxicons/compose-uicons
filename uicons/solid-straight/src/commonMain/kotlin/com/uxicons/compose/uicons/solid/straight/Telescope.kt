package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Telescope: ImageVector? = null

val Icons.Ss.Telescope: ImageVector
    get() = _Telescope ?: UXIcon(name = "Telescope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.09f, 10.88f)
                lineToRelative(1.84f, -0.78f)
                lineTo(19.72f, 0.1f)
                lineToRelative(-1.84f, 0.78f)
                lineToRelative(0.75f, 1.78f)
                lineTo(3.16f, 9.29f)
                lineToRelative(0.97f, 2.3f)
                lineTo(-0.01f, 13.33f)
                lineToRelative(0.78f, 1.84f)
                lineToRelative(4.15f, -1.75f)
                lineToRelative(0.97f, 2.31f)
                lineToRelative(5.34f, -2.29f)
                lineToRelative(-4.63f, 10.55f)
                horizontalLineToRelative(2.19f)
                lineToRelative(4.72f, -10.76f)
                lineToRelative(4.72f, 10.76f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-5.36f, -12.2f)
                lineToRelative(6.29f, -2.7f)
                lineToRelative(0.75f, 1.77f)
                close()
            }
        }.also { _Telescope = it}
