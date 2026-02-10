package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Tc.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.24f, 5.27f)
                curveToRelative(-0.07f, -0.37f, -0.14f, -0.74f, -0.2f, -1.12f)
                curveToRelative(-0.03f, -0.19f, -0.17f, -0.34f, -0.35f, -0.4f)
                curveToRelative(-1.75f, -0.51f, -3.92f, -1.13f, -7.18f, -1.23f)
                verticalLineToRelative(-1.02f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.02f)
                curveToRelative(-3.27f, 0.1f, -5.44f, 0.72f, -7.19f, 1.24f)
                curveToRelative(-0.18f, 0.05f, -0.32f, 0.21f, -0.35f, 0.4f)
                curveToRelative(-0.06f, 0.37f, -0.13f, 0.73f, -0.2f, 1.08f)
                curveToRelative(-0.36f, 1.92f, -0.74f, 3.91f, -0.76f, 8.77f)
                curveToRelative(0.01f, 4.96f, 4.05f, 9.0f, 9f, 9.0f)
                curveToRelative(4.79f, 0f, 9f, -4.21f, 9f, -9.0f)
                curveToRelative(-0.03f, -4.81f, -0.4f, -6.8f, -0.76f, -8.72f)
                close()
                moveTo(19.11f, 4.62f)
                curveToRelative(0.05f, 0.28f, 0.1f, 0.56f, 0.15f, 0.83f)
                curveToRelative(0.23f, 1.23f, 0.46f, 2.5f, 0.6f, 4.54f)
                horizontalLineToRelative(-7.36f)
                verticalLineToRelative(-6.48f)
                curveToRelative(2.94f, 0.09f, 4.9f, 0.61f, 6.61f, 1.11f)
                close()
                moveTo(4.75f, 5.42f)
                curveToRelative(0.05f, -0.27f, 0.1f, -0.53f, 0.15f, -0.79f)
                curveToRelative(1.71f, -0.5f, 3.67f, -1.02f, 6.61f, -1.11f)
                verticalLineToRelative(6.48f)
                horizontalLineToRelative(-7.37f)
                curveToRelative(0.14f, -2.08f, 0.38f, -3.35f, 0.61f, -4.58f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-4.33f, 0f, -7.99f, -3.66f, -8f, -8.0f)
                curveToRelative(0.01f, -1.15f, 0.03f, -2.14f, 0.07f, -3.0f)
                horizontalLineToRelative(15.85f)
                curveToRelative(0.04f, 0.86f, 0.07f, 1.85f, 0.08f, 3f)
                curveToRelative(0f, 4.26f, -3.74f, 8f, -8f, 8f)
                close()
            }
        }.also { _ComputerMouse = it}
