package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Ts.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                verticalLineToRelative(-1f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                close()
                moveTo(15f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                horizontalLineToRelative(1f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(10.29f, 14.42f)
                lineToRelative(6.42f, 6.42f)
                lineToRelative(-0.35f, 0.35f)
                curveToRelative(-1.87f, 1.87f, -4.32f, 2.8f, -6.77f, 2.8f)
                reflectiveCurveToRelative(-4.91f, -0.94f, -6.77f, -2.8f)
                curveToRelative(-3.73f, -3.73f, -3.73f, -9.81f, 0f, -13.55f)
                lineToRelative(0.35f, -0.35f)
                lineToRelative(6.42f, 6.42f)
                lineToRelative(2.07f, -2.07f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.07f, 2.07f)
                close()
                moveTo(15.28f, 20.83f)
                lineTo(3.17f, 8.72f)
                curveToRelative(-3.0f, 3.36f, -2.88f, 8.54f, 0.34f, 11.77f)
                curveToRelative(3.23f, 3.23f, 8.4f, 3.34f, 11.77f, 0.34f)
                close()
            }
        }.also { _SatelliteDish = it}
