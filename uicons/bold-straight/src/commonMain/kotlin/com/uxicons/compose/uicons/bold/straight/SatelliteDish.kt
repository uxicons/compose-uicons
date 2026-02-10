package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Bs.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 12f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(3f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                horizontalLineToRelative(3f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(12.41f, 13.71f)
                lineToRelative(6.21f, 6.21f)
                lineToRelative(-1.06f, 1.06f)
                curveToRelative(-2.0f, 2.0f, -4.64f, 3.01f, -7.27f, 3.01f)
                reflectiveCurveToRelative(-5.27f, -1.0f, -7.27f, -3.01f)
                curveTo(-1.0f, 16.98f, -1.0f, 10.45f, 3.01f, 6.44f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(6.21f, 6.21f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.65f, 1.65f)
                close()
                moveTo(14.27f, 19.82f)
                lineTo(4.18f, 9.73f)
                curveToRelative(-1.84f, 2.82f, -1.53f, 6.66f, 0.95f, 9.13f)
                curveToRelative(2.48f, 2.48f, 6.31f, 2.79f, 9.13f, 0.95f)
                close()
            }
        }.also { _SatelliteDish = it}
