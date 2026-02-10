package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Ss.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.45f, 23.97f)
                lineTo(0.03f, 22.55f)
                lineToRelative(11.54f, -11.54f)
                curveToRelative(0.81f, -0.81f, 1.34f, -1.88f, 1.49f, -3.01f)
                lineToRelative(0.66f, -4.97f)
                curveToRelative(0.23f, -1.73f, 1.72f, -3.04f, 3.47f, -3.04f)
                horizontalLineToRelative(3.31f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-0.75f, 0f, -1.39f, 0.56f, -1.49f, 1.3f)
                lineToRelative(-0.66f, 4.97f)
                curveToRelative(-0.21f, 1.56f, -0.94f, 3.04f, -2.06f, 4.16f)
                lineTo(1.45f, 23.97f)
                close()
            }
        }.also { _Staff = it}
