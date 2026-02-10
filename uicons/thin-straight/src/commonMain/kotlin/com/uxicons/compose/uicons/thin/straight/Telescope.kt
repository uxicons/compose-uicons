package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Telescope: ImageVector? = null

val Icons.Ts.Telescope: ImageVector
    get() = _Telescope ?: UXIcon(name = "Telescope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.04f, 10.39f)
                lineToRelative(0.92f, -0.39f)
                lineTo(19.74f, -0.0f)
                lineToRelative(-0.92f, 0.39f)
                lineToRelative(0.72f, 1.7f)
                lineTo(1.7f, 9.8f)
                lineToRelative(1.22f, 2.89f)
                lineTo(0.02f, 13.97f)
                lineToRelative(0.4f, 0.92f)
                lineToRelative(2.89f, -1.27f)
                lineToRelative(1.2f, 2.84f)
                lineToRelative(8.03f, -3.47f)
                lineToRelative(-4.84f, 11.02f)
                horizontalLineToRelative(1.09f)
                lineToRelative(4.71f, -10.74f)
                lineToRelative(4.71f, 10.74f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-5.15f, -11.72f)
                lineToRelative(8.19f, -3.54f)
                lineToRelative(0.69f, 1.65f)
                close()
                moveTo(5.03f, 15.13f)
                lineToRelative(-2.03f, -4.81f)
                lineTo(19.93f, 3.01f)
                lineToRelative(2.03f, 4.81f)
                lineTo(5.03f, 15.13f)
                close()
            }
        }.also { _Telescope = it}
