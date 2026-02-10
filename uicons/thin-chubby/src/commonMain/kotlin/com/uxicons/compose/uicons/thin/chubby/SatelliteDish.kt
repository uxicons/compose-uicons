package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Tc.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 12.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -7.56f, -2.94f, -10.5f, -10.5f, -10.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(8.17f, 0f, 11.5f, 3.33f, 11.5f, 11.5f)
                close()
                moveTo(11.52f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(4.72f, 0f, 6.48f, 1.76f, 6.48f, 6.48f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -5.24f, -2.24f, -7.48f, -7.48f, -7.48f)
                close()
                moveTo(17.86f, 18.75f)
                curveToRelative(0.19f, 0.19f, 0.19f, 0.52f, 0f, 0.71f)
                curveToRelative(-2.36f, 2.36f, -4.51f, 3.55f, -6.66f, 3.55f)
                reflectiveCurveToRelative(-4.29f, -1.18f, -6.66f, -3.55f)
                curveToRelative(-4.73f, -4.73f, -4.73f, -8.58f, 0f, -13.31f)
                curveToRelative(0.19f, -0.19f, 0.52f, -0.19f, 0.71f, 0f)
                lineToRelative(5.96f, 5.96f)
                lineToRelative(0.96f, -0.96f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-0.96f, 0.96f)
                lineToRelative(5.94f, 5.94f)
                close()
                moveTo(16.79f, 19.1f)
                lineTo(4.9f, 7.21f)
                curveToRelative(-3.93f, 4.11f, -3.81f, 7.38f, 0.35f, 11.54f)
                curveToRelative(4.16f, 4.16f, 7.43f, 4.28f, 11.54f, 0.35f)
                close()
            }
        }.also { _SatelliteDish = it}
