package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassPlay: ImageVector? = null

val Icons.Ss.MagnifyingGlassPlay: ImageVector
    get() = _MagnifyingGlassPlay ?: UXIcon(name = "MagnifyingGlassPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.52f, 10f)
                lineToRelative(-2.52f, 1.47f)
                verticalLineToRelative(-2.93f)
                close()
                moveTo(23.96f, 22.54f)
                lineTo(22.54f, 23.96f)
                lineTo(16.32f, 17.74f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(15.48f, 10f)
                lineTo(7f, 5.05f)
                verticalLineToRelative(9.9f)
                close()
            }
        }.also { _MagnifyingGlassPlay = it}
