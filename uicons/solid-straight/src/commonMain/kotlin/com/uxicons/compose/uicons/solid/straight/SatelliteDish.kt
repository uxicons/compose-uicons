package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Ss.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(-2f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                close()
                moveTo(14f, 12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(2f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(11.2f, 14.21f)
                lineToRelative(6.21f, 6.21f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-1.91f, 1.91f, -4.42f, 2.86f, -6.92f, 2.86f)
                reflectiveCurveToRelative(-5.01f, -0.95f, -6.92f, -2.86f)
                curveToRelative(-3.82f, -3.81f, -3.82f, -10.03f, 0f, -13.84f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(6.21f, 6.21f)
                lineToRelative(1.51f, -1.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.51f, 1.51f)
                close()
            }
        }.also { _SatelliteDish = it}
