package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitch: ImageVector? = null

val Icons.Sc.LightSwitch: ImageVector
    get() = _LightSwitch ?: UXIcon(name = "LightSwitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.51f, 13f)
                curveToRelative(0.04f, 1.47f, 0.14f, 2.78f, 0.25f, 3.79f)
                curveToRelative(1.56f, 0.28f, 2.92f, 0.28f, 4.49f, 0f)
                curveToRelative(0.11f, -1.01f, 0.22f, -2.33f, 0.25f, -3.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.49f, 11f)
                curveToRelative(-0.03f, -1.25f, -0.11f, -2.54f, -0.25f, -3.79f)
                curveToRelative(-1.57f, -0.28f, -2.93f, -0.28f, -4.49f, 0f)
                curveToRelative(-0.11f, 1.01f, -0.22f, 2.32f, -0.25f, 3.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.05f, 2.91f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.59f, -0.64f, -0.71f)
                curveToRelative(-0.14f, -0.05f, -3.47f, -1.21f, -7.41f, -1.21f)
                reflectiveCurveToRelative(-7.27f, 1.16f, -7.41f, 1.21f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.04f, 0.16f, -0.95f, 3.98f, -0.95f, 9.08f)
                curveToRelative(0f, 5.15f, 0.91f, 8.93f, 0.95f, 9.09f)
                curveToRelative(0.08f, 0.33f, 0.32f, 0.59f, 0.64f, 0.71f)
                curveToRelative(0.14f, 0.05f, 3.47f, 1.21f, 7.41f, 1.21f)
                reflectiveCurveToRelative(7.27f, -1.16f, 7.41f, -1.21f)
                curveToRelative(0.32f, -0.11f, 0.56f, -0.38f, 0.64f, -0.71f)
                curveToRelative(0.04f, -0.16f, 0.95f, -3.98f, 0.95f, -9.08f)
                curveToRelative(0f, -5.15f, -0.91f, -8.93f, -0.95f, -9.09f)
                close()
                moveTo(16.15f, 17.75f)
                curveToRelative(-0.05f, 0.42f, -0.36f, 0.76f, -0.77f, 0.85f)
                curveToRelative(-1.18f, 0.27f, -2.31f, 0.4f, -3.37f, 0.4f)
                reflectiveCurveToRelative(-2.2f, -0.13f, -3.38f, -0.4f)
                curveToRelative(-0.41f, -0.09f, -0.72f, -0.43f, -0.77f, -0.85f)
                curveToRelative(-0.24f, -1.91f, -0.36f, -3.85f, -0.36f, -5.75f)
                curveToRelative(0f, -2.36f, 0.2f, -4.43f, 0.36f, -5.75f)
                curveToRelative(0.05f, -0.42f, 0.36f, -0.76f, 0.77f, -0.85f)
                curveToRelative(2.35f, -0.53f, 4.4f, -0.53f, 6.75f, 0f)
                curveToRelative(0.41f, 0.09f, 0.72f, 0.43f, 0.77f, 0.85f)
                curveToRelative(0.24f, 1.91f, 0.36f, 3.85f, 0.36f, 5.75f)
                curveToRelative(0f, 1.89f, -0.12f, 3.83f, -0.36f, 5.75f)
                close()
            }
        }.also { _LightSwitch = it}
