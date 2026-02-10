package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snake: ImageVector? = null

val Icons.Rr.Snake: ImageVector
    get() = _Snake ?: UXIcon(name = "Snake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 4.99f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 17f)
                horizontalLineToRelative(-0.22f)
                curveToRelative(-1.14f, -0.71f, -2.57f, -2.05f, -4.16f, -3.9f)
                curveToRelative(-2.01f, -2.34f, -2.12f, -3.57f, -2.12f, -4.46f)
                curveToRelative(0.22f, -0.05f, 0.57f, -0.1f, 1.01f, -0.1f)
                curveToRelative(1.95f, 1.92f, 5.1f, 1.92f, 7.02f, -0.01f)
                lineToRelative(0.88f, -0.88f)
                curveToRelative(1.44f, -1.46f, 1.44f, -3.84f, 0.0f, -5.3f)
                lineToRelative(-0.88f, -0.89f)
                curveToRelative(-1.93f, -1.93f, -5.09f, -1.9f, -7.04f, 0.03f)
                curveToRelative(-1.44f, 0.06f, -4.11f, 0.39f, -5.86f, 1.98f)
                curveToRelative(-0.97f, 0.88f, -2.14f, 2.47f, -2.14f, 5.03f)
                curveToRelative(0f, 0.78f, 0.12f, 1.6f, 0.33f, 2.42f)
                curveToRelative(-0.57f, -0.27f, -1.39f, -0.56f, -2.59f, -0.85f)
                curveToRelative(-0.71f, -0.17f, -1.45f, 0.01f, -2.0f, 0.5f)
                curveToRelative(-0.54f, 0.48f, -0.81f, 1.2f, -0.72f, 1.93f)
                curveToRelative(0.36f, 2.82f, 0.95f, 3.54f, 1.16f, 3.79f)
                lineToRelative(0.63f, 0.73f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.48f, 4.94f)
                curveToRelative(1.33f, -1.21f, 3.66f, -1.42f, 4.6f, -1.46f)
                curveToRelative(0.49f, -0.02f, 0.95f, -0.23f, 1.33f, -0.6f)
                curveToRelative(1.17f, -1.15f, 3.06f, -1.16f, 4.21f, -0.0f)
                lineToRelative(0.87f, 0.88f)
                curveToRelative(0.68f, 0.69f, 0.68f, 1.8f, 0f, 2.49f)
                lineToRelative(-0.86f, 0.87f)
                curveToRelative(-1.15f, 1.15f, -3.04f, 1.15f, -4.21f, -0.0f)
                curveToRelative(-0.45f, -0.44f, -1.01f, -0.65f, -1.58f, -0.61f)
                curveToRelative(-1.77f, 0.14f, -2.19f, 0.53f, -2.35f, 0.67f)
                curveToRelative(-0.33f, 0.3f, -0.49f, 0.73f, -0.49f, 1.32f)
                curveToRelative(0f, 1.08f, 0f, 2.88f, 2.6f, 5.91f)
                curveToRelative(0.87f, 1.01f, 1.69f, 1.88f, 2.46f, 2.6f)
                lineToRelative(-4.14f, -0.01f)
                curveToRelative(-1.98f, -2.08f, -3.93f, -5.71f, -3.93f, -8.5f)
                curveToRelative(0f, -1.83f, 0.8f, -2.94f, 1.48f, -3.55f)
                close()
                moveTo(4.07f, 12.06f)
                curveToRelative(0.04f, -0.03f, 0.1f, -0.07f, 0.19f, -0.05f)
                curveToRelative(2.31f, 0.56f, 2.73f, 1.03f, 2.78f, 1.1f)
                lineToRelative(2.3f, 2.45f)
                curveToRelative(0.31f, 0.51f, 0.64f, 0.99f, 0.98f, 1.45f)
                horizontalLineToRelative(-3.87f)
                lineToRelative(-1.75f, -2.02f)
                curveToRelative(-0.04f, -0.05f, -0.42f, -0.56f, -0.7f, -2.74f)
                curveToRelative(-0.01f, -0.09f, 0.03f, -0.15f, 0.07f, -0.18f)
                close()
                moveTo(20.5f, 22f)
                lineTo(3.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Snake = it}
