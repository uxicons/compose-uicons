package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHomeAlt: ImageVector? = null

val Icons.Ts.SmartHomeAlt: ImageVector
    get() = _SmartHomeAlt ?: UXIcon(name = "SmartHomeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 7.87f)
                lineTo(13.66f, 0.57f)
                curveToRelative(-0.98f, -0.77f, -2.34f, -0.77f, -3.32f, 0f)
                lineTo(1.03f, 7.87f)
                curveToRelative(-0.65f, 0.51f, -1.03f, 1.3f, -1.03f, 2.12f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.82f, -0.39f, -1.61f, -1.03f, -2.12f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-13.01f)
                curveToRelative(0f, -0.52f, 0.24f, -1.01f, 0.65f, -1.33f)
                lineTo(10.96f, 1.36f)
                curveToRelative(0.61f, -0.48f, 1.47f, -0.48f, 2.08f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.41f, 0.32f, 0.65f, 0.82f, 0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                close()
                moveTo(12.5f, 15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                close()
                moveTo(18f, 14f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -2.21f, 1.21f, -4.15f, 3f, -5.19f)
                verticalLineToRelative(1.21f)
                curveToRelative(-1.21f, 0.91f, -2f, 2.35f, -2f, 3.97f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.63f, -0.79f, -3.06f, -2f, -3.97f)
                verticalLineToRelative(-1.21f)
                curveToRelative(1.79f, 1.04f, 3f, 2.97f, 3f, 5.19f)
                close()
            }
        }.also { _SmartHomeAlt = it}
