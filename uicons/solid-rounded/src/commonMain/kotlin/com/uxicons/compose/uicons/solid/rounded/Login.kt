package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Login: ImageVector? = null

val Icons.Sr.Login: ImageVector
    get() = _Login ?: UXIcon(name = "Login") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.18f, 14.09f)
                curveToRelative(-1.2f, 0.25f, -2.23f, 1.02f, -2.78f, 2.16f)
                curveToRelative(-0.24f, 0.5f, -0.85f, 0.7f, -1.34f, 0.46f)
                curveToRelative(-0.5f, -0.24f, -0.7f, -0.84f, -0.46f, -1.34f)
                curveToRelative(0.87f, -1.79f, 2.59f, -3.02f, 4.52f, -3.31f)
                curveToRelative(0.09f, -0.39f, 0.22f, -0.77f, 0.42f, -1.11f)
                curveToRelative(-1.71f, -0.23f, -3.05f, -1.68f, -3.05f, -3.45f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.53f, -0.13f, 1.03f, -0.34f, 1.49f)
                curveToRelative(0.37f, 0.02f, 0.74f, 0.09f, 1.1f, 0.21f)
                lineToRelative(5.66f, 2.05f)
                curveToRelative(0.05f, -0.41f, 0.09f, -0.82f, 0.09f, -1.25f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 4.48f, -10f, 10f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                curveToRelative(0.43f, 0f, 0.85f, -0.04f, 1.27f, -0.09f)
                curveToRelative(-0.03f, -0.13f, -2.08f, -5.69f, -2.09f, -5.82f)
                close()
                moveTo(23.71f, 22.28f)
                lineTo(20.02f, 18.59f)
                lineTo(22.71f, 15.9f)
                curveToRelative(0.24f, -0.24f, 0.34f, -0.59f, 0.27f, -0.92f)
                curveToRelative(-0.07f, -0.33f, -0.31f, -0.61f, -0.64f, -0.72f)
                lineToRelative(-8.73f, -3.16f)
                curveToRelative(-0.72f, -0.24f, -1.5f, -0.07f, -2.03f, 0.47f)
                curveToRelative(-0.54f, 0.54f, -0.72f, 1.33f, -0.46f, 2.05f)
                lineToRelative(3.16f, 8.71f)
                curveToRelative(0.12f, 0.32f, 0.39f, 0.56f, 0.72f, 0.64f)
                curveToRelative(0.33f, 0.07f, 0.68f, -0.03f, 0.92f, -0.27f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(3.69f, 3.69f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.42f)
                close()
            }
        }.also { _Login = it}
