package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Rc.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.64f, 4.91f)
                curveToRelative(-0.07f, -0.37f, -0.34f, -0.67f, -0.7f, -0.78f)
                curveToRelative(-1.59f, -0.47f, -3.21f, -0.93f, -5.94f, -1.1f)
                verticalLineToRelative(-1.03f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.03f)
                curveToRelative(-2.74f, 0.17f, -4.35f, 0.64f, -5.94f, 1.1f)
                curveToRelative(-0.36f, 0.11f, -0.63f, 0.41f, -0.7f, 0.78f)
                curveToRelative(-0.36f, 2.02f, -0.83f, 4.58f, -0.86f, 9.72f)
                curveToRelative(0.01f, 4.62f, 3.83f, 8.38f, 8.5f, 8.38f)
                curveToRelative(4.61f, 0f, 8.5f, -3.82f, 8.5f, -8.34f)
                reflectiveCurveToRelative(-0.64f, -8.51f, -0.86f, -9.75f)
                close()
                moveTo(13.0f, 5.03f)
                curveToRelative(2.04f, 0.12f, 3.82f, 0.56f, 4.77f, 0.84f)
                curveToRelative(0.17f, 0.73f, 0.36f, 2.15f, 0.54f, 4.13f)
                horizontalLineToRelative(-5.3f)
                verticalLineToRelative(-4.97f)
                close()
                moveTo(6.21f, 5.87f)
                curveToRelative(0.96f, -0.28f, 2.73f, -0.72f, 4.79f, -0.84f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(-5.32f)
                curveToRelative(0.16f, -1.97f, 0.4f, -3.42f, 0.53f, -4.13f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-3.58f, 0f, -6.49f, -2.86f, -6.5f, -6.38f)
                curveToRelative(-0.0f, -0.93f, 0.02f, -1.8f, 0.06f, -2.62f)
                horizontalLineToRelative(12.88f)
                curveToRelative(0.04f, 0.83f, 0.07f, 1.71f, 0.07f, 2.66f)
                curveToRelative(0f, 3.44f, -2.98f, 6.34f, -6.5f, 6.34f)
                close()
            }
        }.also { _ComputerMouse = it}
