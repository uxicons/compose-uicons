package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteAccess: ImageVector? = null

val Icons.Ss.RemoteAccess: ImageVector
    get() = _RemoteAccess ?: UXIcon(name = "RemoteAccess") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.51f, 2.51f)
                curveToRelative(-0.77f, 0.77f, -0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(2.51f, 2.51f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.51f, -1.5f)
                horizontalLineToRelative(3.01f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5.91f, 16.09f)
                lineTo(4.5f, 17.5f)
                lineTo(6.01f, 19f)
                horizontalLineToRelative(-3.01f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.51f, -2.51f)
                curveToRelative(0.77f, -0.77f, 0.77f, -2.04f, 0f, -2.81f)
                lineToRelative(-2.51f, -2.51f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _RemoteAccess = it}
