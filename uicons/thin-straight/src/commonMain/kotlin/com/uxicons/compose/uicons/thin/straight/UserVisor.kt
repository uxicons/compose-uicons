package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Ts.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(15.96f, 18f)
                curveToRelative(-0.63f, 0.62f, -1.14f, 1.42f, -1.47f, 2.39f)
                curveToRelative(-0.23f, 0.72f, -0.41f, 1.58f, -0.49f, 2.61f)
                curveToRelative(0f, 0.02f, 1.5f, -1.5f, 2.29f, -1.5f)
                curveToRelative(0.59f, 0f, 1.37f, 0.59f, 1.71f, 1f)
                curveToRelative(-0.1f, -0.86f, -0.26f, -1.51f, -0.59f, -2.29f)
                curveToRelative(-0.33f, -0.8f, -0.84f, -1.59f, -1.46f, -2.21f)
                close()
                moveTo(4f, 7.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.52f)
                curveTo(7.02f, 1.6f, 9.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4.98f, 1.6f, 5.98f, 4f)
                horizontalLineToRelative(0.52f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.52f)
                curveToRelative(-1.01f, 2.4f, -3.36f, 4f, -5.98f, 4f)
                reflectiveCurveToRelative(-4.98f, -1.6f, -5.98f, -4f)
                horizontalLineToRelative(-0.52f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16.89f, 9f)
                lineTo(7.11f, 9f)
                curveToRelative(0.93f, 1.82f, 2.81f, 3f, 4.89f, 3f)
                reflectiveCurveToRelative(3.96f, -1.18f, 4.89f, -3f)
                close()
                moveTo(7.11f, 4f)
                horizontalLineToRelative(9.78f)
                curveToRelative(-0.93f, -1.82f, -2.81f, -3f, -4.89f, -3f)
                reflectiveCurveToRelative(-3.96f, 1.18f, -4.89f, 3f)
                close()
                moveTo(5f, 7.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _UserVisor = it}
