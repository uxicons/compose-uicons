package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmergencyCall: ImageVector? = null

val Icons.Ts.EmergencyCall: ImageVector
    get() = _EmergencyCall ?: UXIcon(name = "EmergencyCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                lineTo(18f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(18.5f, 11f)
                horizontalLineToRelative(-5.5f)
                lineTo(13f, 5.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(14f, 10f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(17.53f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveTo(9.19f, 24f, 0f, 14.81f, 0f, 7.61f)
                curveTo(0f, 6.1f, 0.57f, 4.71f, 1.6f, 3.67f)
                lineTo(4.48f, 0.79f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(1.49f, 3.51f, 3.96f, 5.99f, 7.36f, 7.37f)
                lineToRelative(3.38f, -3.38f)
                close()
                moveTo(21.79f, 19.52f)
                lineToRelative(-4.26f, -4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(-0.3f, -0.12f)
                curveToRelative(-3.92f, -1.5f, -6.73f, -4.31f, -8.36f, -8.35f)
                lineToRelative(-0.12f, -0.31f)
                lineToRelative(3.13f, -3.13f)
                lineTo(4.48f, 2.21f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-0.85f, 0.84f, -1.31f, 1.99f, -1.31f, 3.23f)
                curveToRelative(0f, 6.62f, 8.77f, 15.39f, 15.39f, 15.39f)
                curveToRelative(1.24f, 0f, 2.39f, -0.47f, 3.23f, -1.31f)
                lineToRelative(2.17f, -2.17f)
                close()
            }
        }.also { _EmergencyCall = it}
