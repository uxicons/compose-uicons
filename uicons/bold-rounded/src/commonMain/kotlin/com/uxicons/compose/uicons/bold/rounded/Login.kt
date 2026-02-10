package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Login: ImageVector? = null

val Icons.Br.Login: ImageVector
    get() = _Login ?: UXIcon(name = "Login") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
            lineToRelative(-2.66f, -2.66f)
            lineToRelative(-1.41f, 1.41f)
            curveToRelative(-0.45f, 0.45f, -1.07f, 0.7f, -1.7f, 0.7f)
            curveToRelative(-0.99f, 0.0f, -1.91f, -0.65f, -2.23f, -1.57f)
            lineToRelative(-2.25f, -6.18f)
            curveToRelative(-0.42f, -1.17f, -0.14f, -2.44f, 0.73f, -3.32f)
            curveToRelative(0.87f, -0.87f, 2.17f, -1.16f, 3.32f, -0.74f)
            lineToRelative(6.18f, 2.25f)
            curveToRelative(0.77f, 0.28f, 1.33f, 0.92f, 1.51f, 1.72f)
            curveToRelative(0.18f, 0.81f, -0.06f, 1.63f, -0.64f, 2.21f)
            lineToRelative(-1.4f, 1.4f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(19.5f, 15.93f)
            lineTo(14.27f, 14.04f)
            curveToRelative(-0.14f, -0.04f, -0.28f, 0.06f, -0.23f, 0.25f)
            lineToRelative(1.89f, 5.21f)
            lineToRelative(3.57f, -3.57f)
            close()
            moveTo(9.01f, 14.07f)
            curveToRelative(0.02f, -1.08f, 0.37f, -2.13f, 1.04f, -3.01f)
            curveToRelative(-0.18f, -0.02f, -0.36f, -0.06f, -0.55f, -0.06f)
            curveToRelative(-2.07f, 0f, -3.85f, 1.27f, -4.61f, 3.07f)
            curveToRelative(-1.17f, -1.18f, -1.89f, -2.8f, -1.89f, -4.57f)
            curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
            curveToRelative(3.27f, 0f, 6.05f, 2.44f, 6.45f, 5.69f)
            curveToRelative(0.1f, 0.82f, 0.85f, 1.41f, 1.67f, 1.3f)
            curveToRelative(0.82f, -0.1f, 1.41f, -0.85f, 1.3f, -1.67f)
            curveToRelative(-0.59f, -4.74f, -4.64f, -8.31f, -9.43f, -8.31f)
            curveToRelative(-5.24f, 0f, -9.5f, 4.26f, -9.5f, 9.5f)
            curveToRelative(0f, 4.78f, 3.57f, 8.84f, 8.31f, 9.43f)
            curveToRelative(0.81f, 0.11f, 1.57f, -0.48f, 1.67f, -1.3f)
            curveToRelative(0.1f, -0.82f, -0.48f, -1.57f, -1.3f, -1.67f)
            curveToRelative(-0.4f, -0.05f, -0.79f, -0.14f, -1.16f, -0.26f)
            curveToRelative(0.12f, -0.79f, 0.71f, -1.43f, 1.49f, -1.63f)
            close()
        }
    }.also { _Login = it }
