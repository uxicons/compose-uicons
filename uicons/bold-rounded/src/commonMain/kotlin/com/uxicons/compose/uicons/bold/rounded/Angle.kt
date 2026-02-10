package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle: ImageVector? = null

val Icons.Br.Angle: ImageVector
    get() = _Angle ?: UXIcon(name = "Angle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24.01f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4.42f, 24f)
            curveToRelative(-1.57f, 0f, -2.99f, -0.81f, -3.8f, -2.16f)
            curveToRelative(-0.8f, -1.35f, -0.83f, -2.99f, -0.08f, -4.37f)
            lineTo(9.63f, 0.78f)
            curveToRelative(0.4f, -0.73f, 1.31f, -1.0f, 2.04f, -0.6f)
            curveToRelative(0.73f, 0.4f, 1.0f, 1.31f, 0.6f, 2.04f)
            lineTo(3.17f, 18.91f)
            curveToRelative(-0.35f, 0.64f, -0.1f, 1.19f, 0.03f, 1.4f)
            curveToRelative(0.12f, 0.21f, 0.49f, 0.69f, 1.22f, 0.69f)
            horizontalLineToRelative(18.09f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(15.76f, 10.0f)
            curveToRelative(0.29f, 0.38f, 0.74f, 0.58f, 1.19f, 0.58f)
            curveToRelative(0.32f, 0f, 0.65f, -0.1f, 0.92f, -0.32f)
            curveToRelative(0.65f, -0.51f, 0.77f, -1.45f, 0.27f, -2.1f)
            curveToRelative(-0.81f, -1.05f, -1.75f, -2.02f, -2.77f, -2.87f)
            curveToRelative(-0.63f, -0.53f, -1.58f, -0.44f, -2.11f, 0.19f)
            curveToRelative(-0.53f, 0.64f, -0.45f, 1.58f, 0.19f, 2.11f)
            curveToRelative(0.86f, 0.72f, 1.64f, 1.52f, 2.32f, 2.4f)
            close()
            moveTo(18.15f, 14.41f)
            curveToRelative(0.37f, 1.05f, 0.62f, 2.15f, 0.75f, 3.27f)
            curveToRelative(0.09f, 0.76f, 0.74f, 1.32f, 1.49f, 1.32f)
            curveToRelative(0.06f, 0f, 0.12f, -0.0f, 0.18f, -0.01f)
            curveToRelative(0.82f, -0.1f, 1.41f, -0.84f, 1.31f, -1.67f)
            curveToRelative(-0.16f, -1.33f, -0.46f, -2.64f, -0.9f, -3.9f)
            curveToRelative(-0.27f, -0.78f, -1.13f, -1.2f, -1.91f, -0.93f)
            curveToRelative(-0.78f, 0.27f, -1.2f, 1.13f, -0.92f, 1.91f)
            close()
        }
    }.also { _Angle = it }
