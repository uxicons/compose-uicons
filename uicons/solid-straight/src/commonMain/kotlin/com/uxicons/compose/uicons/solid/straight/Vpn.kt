package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vpn: ImageVector? = null

val Icons.Ss.Vpn: ImageVector
    get() = _Vpn ?: UXIcon(name = "Vpn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 10.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 4.18f)
                verticalLineToRelative(15.64f)
                lineToRelative(-0.8f, 0.16f)
                curveToRelative(-0.21f, 0.04f, -5.17f, 1.02f, -11.2f, 1.02f)
                reflectiveCurveToRelative(-10.99f, -0.98f, -11.2f, -1.02f)
                lineToRelative(-0.8f, -0.16f)
                lineTo(-0f, 4.18f)
                lineToRelative(0.8f, -0.16f)
                curveToRelative(0.21f, -0.04f, 5.17f, -1.02f, 11.2f, -1.02f)
                reflectiveCurveToRelative(10.99f, 0.98f, 11.2f, 1.02f)
                lineToRelative(0.8f, 0.16f)
                close()
                moveTo(8.94f, 8f)
                horizontalLineToRelative(-1.67f)
                lineToRelative(-1.26f, 6.31f)
                lineToRelative(-1.37f, -6.31f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(1.38f, 6.47f)
                curveToRelative(0.11f, 0.56f, 0.68f, 1.53f, 1.62f, 1.53f)
                reflectiveCurveToRelative(1.5f, -0.93f, 1.63f, -1.57f)
                lineToRelative(1.31f, -6.42f)
                close()
                moveTo(15f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.28f)
                lineToRelative(-2f, -4.27f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.23f)
                lineToRelative(2f, 4.23f)
                horizontalLineToRelative(1.5f)
                lineTo(21f, 8f)
                close()
            }
        }.also { _Vpn = it}
