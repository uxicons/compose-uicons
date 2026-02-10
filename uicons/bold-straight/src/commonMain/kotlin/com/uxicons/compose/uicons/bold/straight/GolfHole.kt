package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Bs.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 18f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2.0f)
                curveTo(10.5f, 0.0f, 12.25f, -0.26f, 13.12f, 0.18f)
                lineToRelative(7.88f, 5.82f)
                lineToRelative(-7.5f, 3.93f)
                verticalLineToRelative(8.07f)
                close()
                moveTo(16f, 10.48f)
                verticalLineToRelative(3.08f)
                curveToRelative(3.02f, 0.72f, 5f, 2.19f, 5f, 3.54f)
                curveToRelative(0f, 1.89f, -3.85f, 4f, -9f, 4f)
                reflectiveCurveToRelative(-9f, -2.11f, -9f, -4f)
                curveToRelative(0f, -1.35f, 1.98f, -2.82f, 5f, -3.54f)
                verticalLineToRelative(-3.08f)
                curveTo(3.25f, 11.4f, 0f, 13.94f, 0f, 17.1f)
                curveToRelative(0f, 3.99f, 5.16f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.01f, 12f, -7f)
                curveToRelative(0f, -3.16f, -3.25f, -5.7f, -8f, -6.62f)
                close()
            }
        }.also { _GolfHole = it}
