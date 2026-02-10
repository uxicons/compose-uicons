package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LoginLock: ImageVector? = null

val Icons.Bs.LoginLock: ImageVector
    get() = _LoginLock ?: UXIcon(name = "LoginLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 15f)
                curveToRelative(0.73f, 0f, 1.41f, -0.21f, 2f, -0.56f)
                verticalLineToRelative(4.56f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.76f)
                curveToRelative(-0.7f, 0.85f, -1.14f, 1.89f, -1.24f, 3f)
                horizontalLineToRelative(-10.52f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.17f, 1.99f, -3.88f, 4.24f, -3.42f)
                curveToRelative(1.64f, 0.34f, 2.77f, 1.85f, 2.77f, 3.52f)
                verticalLineToRelative(1.4f)
                close()
                moveTo(20f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 3.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(5f, 11.99f)
                verticalLineToRelative(1f)
                lineToRelative(7f, 0.01f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineToRelative(-3f, -0.01f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _LoginLock = it}
