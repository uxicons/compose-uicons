package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Rc.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -6.55f, -2.43f, -8.98f, -8.98f, -8.98f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(7.7f, 0f, 10.98f, 3.28f, 10.98f, 10.98f)
                close()
                moveTo(12.02f, 4.98f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(3.75f, 0f, 5.02f, 1.27f, 5.02f, 5.02f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.85f, -2.17f, -7.02f, -7.02f, -7.02f)
                close()
                moveTo(18.23f, 18.02f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-2.39f, 2.39f, -4.61f, 3.58f, -6.82f, 3.58f)
                reflectiveCurveToRelative(-4.43f, -1.19f, -6.82f, -3.58f)
                curveToRelative(-4.78f, -4.78f, -4.78f, -8.86f, 0f, -13.64f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(5.42f, 5.42f)
                lineToRelative(0.92f, -0.92f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.92f, 0.92f)
                lineToRelative(5.4f, 5.4f)
                close()
                moveTo(16.09f, 18.71f)
                lineTo(5.31f, 7.93f)
                curveToRelative(-3.29f, 3.62f, -3.06f, 6.34f, 0.69f, 10.09f)
                curveToRelative(3.75f, 3.75f, 6.47f, 3.98f, 10.09f, 0.69f)
                close()
            }
        }.also { _SatelliteDish = it}
