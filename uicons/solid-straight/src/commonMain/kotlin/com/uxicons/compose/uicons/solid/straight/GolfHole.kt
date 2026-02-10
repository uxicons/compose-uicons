package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Ss.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                curveToRelative(0f, 3.42f, -5.16f, 6f, -12f, 6f)
                reflectiveCurveTo(0f, 21.42f, 0f, 18f)
                curveToRelative(0f, -2.9f, 3.71f, -5.18f, 9f, -5.82f)
                verticalLineToRelative(7.82f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7.82f)
                curveToRelative(5.29f, 0.63f, 9f, 2.92f, 9f, 5.82f)
                close()
                moveTo(13f, 18f)
                verticalLineToRelative(-6.39f)
                lineToRelative(9.49f, -4.97f)
                lineTo(13.61f, 0.11f)
                curveToRelative(-0.54f, -0.2f, -1.25f, -0.14f, -1.74f, 0.17f)
                curveToRelative(-0.4f, 0.25f, -0.87f, 0.77f, -0.87f, 1.86f)
                verticalLineToRelative(15.86f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _GolfHole = it}
