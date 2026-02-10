package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PasswordLock: ImageVector? = null

val Icons.Ss.PasswordLock: ImageVector
    get() = _PasswordLock ?: UXIcon(name = "PasswordLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.34f, 2f, 0f, 3.34f, 0f, 5f)
                lineTo(0f, 15f)
                lineTo(10f, 15f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(0.08f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                reflectiveCurveToRelative(5.44f, 2.17f, 5.92f, 5f)
                horizontalLineToRelative(0.08f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(6.47f, 9.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(1.04f, 1.04f)
                close()
                moveTo(10.96f, 8.5f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-1.04f, 1.04f)
                close()
            }
        }.also { _PasswordLock = it}
