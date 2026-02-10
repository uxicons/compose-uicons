package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Telescope: ImageVector? = null

val Icons.Bs.Telescope: ImageVector
    get() = _Telescope ?: UXIcon(name = "Telescope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.25f, 11.25f)
                lineToRelative(2.77f, -1.17f)
                lineTo(19.79f, 0.09f)
                lineToRelative(-2.77f, 1.17f)
                lineToRelative(0.56f, 1.32f)
                lineTo(2.76f, 8.9f)
                lineToRelative(0.97f, 2.3f)
                lineTo(0.05f, 12.75f)
                lineToRelative(1.17f, 2.76f)
                lineToRelative(3.69f, -1.55f)
                lineToRelative(0.97f, 2.31f)
                lineToRelative(5.07f, -2.16f)
                lineToRelative(-4.34f, 9.89f)
                horizontalLineToRelative(3.28f)
                lineToRelative(3.63f, -8.27f)
                lineToRelative(3.63f, 8.27f)
                horizontalLineToRelative(3.28f)
                lineToRelative(-5.15f, -11.74f)
                lineToRelative(5.44f, -2.32f)
                lineToRelative(0.55f, 1.31f)
                close()
                moveTo(7.46f, 12.33f)
                lineToRelative(-0.78f, -1.84f)
                lineToRelative(12.06f, -5.15f)
                lineToRelative(0.78f, 1.84f)
                lineToRelative(-12.06f, 5.15f)
                close()
            }
        }.also { _Telescope = it}
