package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMask: ImageVector? = null

val Icons.Ts.UserMask: ImageVector
    get() = _UserMask ?: UXIcon(name = "UserMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.29f, -1.32f, 4.38f, -3.37f, 5.38f)
                curveToRelative(-0.19f, 0.39f, -0.21f, 0.38f, -0.38f, 0.62f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.17f, -0.23f, -0.2f, -0.22f, -0.38f, -0.62f)
                curveToRelative(-2.05f, -1.0f, -3.37f, -3.1f, -3.37f, -5.38f)
                close()
                moveTo(9.02f, 10.0f)
                curveToRelative(-0.01f, -0.16f, -0.02f, -0.32f, -0.02f, -0.5f)
                curveToRelative(0f, -0.69f, 0.12f, -1.22f, 0.26f, -1.6f)
                curveToRelative(-0.82f, -0.2f, -1.58f, -0.67f, -2.2f, -1.17f)
                curveToRelative(0.19f, 1.31f, 0.91f, 2.48f, 1.97f, 3.27f)
                close()
                moveTo(14f, 9.5f)
                curveToRelative(0f, -0.74f, -0.17f, -1.24f, -0.29f, -1.5f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.12f, 0.26f, -0.29f, 0.76f, -0.29f, 1.5f)
                reflectiveCurveToRelative(0.17f, 1.24f, 0.29f, 1.5f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.12f, -0.26f, 0.29f, -0.76f, 0.29f, -1.5f)
                close()
                moveTo(16.95f, 6.73f)
                curveToRelative(-0.62f, 0.5f, -1.38f, 0.97f, -2.2f, 1.17f)
                curveToRelative(0.13f, 0.38f, 0.26f, 0.91f, 0.26f, 1.6f)
                curveToRelative(0f, 0.18f, -0.01f, 0.34f, -0.02f, 0.5f)
                curveToRelative(1.06f, -0.79f, 1.77f, -1.96f, 1.97f, -3.27f)
                close()
                moveTo(7.06f, 5.4f)
                curveToRelative(0.62f, 0.6f, 1.82f, 1.59f, 2.94f, 1.59f)
                horizontalLineToRelative(4f)
                curveToRelative(1.12f, 0f, 2.32f, -1.0f, 2.94f, -1.59f)
                curveToRelative(-0.3f, -2.47f, -2.39f, -4.41f, -4.94f, -4.41f)
                reflectiveCurveToRelative(-4.64f, 1.93f, -4.94f, 4.41f)
                close()
            }
        }.also { _UserMask = it}
