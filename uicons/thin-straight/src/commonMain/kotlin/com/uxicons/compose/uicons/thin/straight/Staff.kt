package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Ts.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.77f, 23.94f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(12.36f, -12.36f)
                curveToRelative(0.89f, -0.88f, 1.46f, -2.06f, 1.63f, -3.29f)
                lineToRelative(0.66f, -4.97f)
                curveToRelative(0.2f, -1.48f, 1.48f, -2.6f, 2.97f, -2.6f)
                horizontalLineToRelative(3.31f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-1.0f, 0f, -1.85f, 0.75f, -1.98f, 1.74f)
                lineToRelative(-0.66f, 4.97f)
                curveToRelative(-0.19f, 1.46f, -0.87f, 2.83f, -1.91f, 3.87f)
                lineTo(0.77f, 23.94f)
                close()
            }
        }.also { _Staff = it}
