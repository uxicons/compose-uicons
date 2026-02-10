package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lips: ImageVector? = null

val Icons.Sr.Lips: ImageVector
    get() = _Lips ?: UXIcon(name = "Lips") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.55f, 10.33f)
                curveToRelative(-2.02f, -3.28f, -4.58f, -5.65f, -6.29f, -6.76f)
                curveToRelative(-0.57f, -0.37f, -1.18f, -0.56f, -1.81f, -0.56f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.93f, 0.01f, -1.73f, 0.32f, -2.31f, 0.91f)
                lineToRelative(-1.12f, 1.1f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-0.59f, -0.59f, -1.37f, -0.91f, -2.2f, -0.91f)
                curveToRelative(-0.71f, 0f, -1.36f, 0.18f, -1.89f, 0.53f)
                curveToRelative(-1.61f, 1.05f, -4.23f, 3.46f, -6.33f, 6.79f)
                curveToRelative(-0.67f, 1.07f, -0.62f, 2.41f, 0.13f, 3.42f)
                curveToRelative(0.78f, 1.04f, 4.98f, 6.25f, 11.4f, 6.25f)
                reflectiveCurveToRelative(10.62f, -5.22f, 11.4f, -6.27f)
                curveToRelative(0.75f, -1.0f, 0.8f, -2.34f, 0.15f, -3.4f)
                close()
                moveTo(21.22f, 12.98f)
                curveToRelative(-0.19f, 0.04f, -4.64f, 1.02f, -9.22f, 1.02f)
                reflectiveCurveToRelative(-9.03f, -0.98f, -9.22f, -1.02f)
                curveToRelative(-0.46f, -0.1f, -0.78f, -0.51f, -0.78f, -0.98f)
                reflectiveCurveToRelative(0.33f, -0.87f, 0.78f, -0.98f)
                curveToRelative(0.19f, -0.04f, 4.64f, -1.02f, 9.22f, -1.02f)
                curveToRelative(3.44f, 0f, 6.49f, 0.55f, 8.12f, 0.85f)
                curveToRelative(0.44f, 0.08f, 0.75f, 0.14f, 0.9f, 0.15f)
                curveToRelative(0.5f, 0.03f, 0.92f, 0.42f, 0.95f, 0.92f)
                curveToRelative(0.04f, 0.5f, -0.27f, 0.95f, -0.76f, 1.05f)
                close()
            }
        }.also { _Lips = it}
