package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Bs.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.13f, 23.99f)
                lineTo(0.01f, 21.87f)
                lineToRelative(10.71f, -10.71f)
                curveToRelative(0.73f, -0.73f, 1.21f, -1.7f, 1.34f, -2.72f)
                lineToRelative(0.66f, -4.97f)
                curveToRelative(0.26f, -1.98f, 1.97f, -3.47f, 3.96f, -3.47f)
                horizontalLineToRelative(3.31f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.37f, -0.99f, 0.87f)
                lineToRelative(-0.66f, 4.97f)
                curveToRelative(-0.22f, 1.67f, -1.0f, 3.25f, -2.2f, 4.45f)
                lineTo(2.13f, 23.99f)
                close()
            }
        }.also { _Staff = it}
