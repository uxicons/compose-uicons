package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Sc.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.21f, 18.01f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-2.39f, 2.39f, -4.61f, 3.58f, -6.82f, 3.58f)
                reflectiveCurveToRelative(-4.43f, -1.19f, -6.82f, -3.58f)
                curveToRelative(-4.78f, -4.78f, -4.78f, -8.86f, 0.0f, -13.64f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(5.06f, 5.06f)
                lineToRelative(0.41f, -0.41f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
                lineToRelative(-0.41f, 0.41f)
                lineToRelative(5.04f, 5.04f)
                close()
                moveTo(13.52f, 4.99f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(2.03f, 0f, 2.5f, 0.47f, 2.5f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -3.7f, -1.8f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(13.52f, 0.99f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(4.86f, 0f, 6.5f, 1.64f, 6.5f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -6.57f, -2.93f, -9.5f, -9.5f, -9.5f)
                close()
            }
        }.also { _SatelliteDish = it}
