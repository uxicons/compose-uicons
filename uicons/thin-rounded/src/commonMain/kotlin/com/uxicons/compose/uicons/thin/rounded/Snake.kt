package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snake: ImageVector? = null

val Icons.Tr.Snake: ImageVector
    get() = _Snake ?: UXIcon(name = "Snake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-1.18f, -1.42f)
                curveToRelative(-0.57f, -0.69f, -1.24f, -2.41f, -1.39f, -3.6f)
                curveToRelative(-0.07f, -0.58f, 0.14f, -1.15f, 0.57f, -1.54f)
                curveToRelative(0.43f, -0.38f, 1.01f, -0.53f, 1.57f, -0.39f)
                curveToRelative(1.06f, 0.26f, 2.87f, 1.01f, 3.77f, 1.69f)
                curveToRelative(-0.57f, -1.37f, -0.93f, -2.81f, -0.93f, -4.24f)
                curveToRelative(0f, -2.38f, 1.07f, -3.85f, 1.97f, -4.66f)
                curveToRelative(1.59f, -1.44f, 4.69f, -2.14f, 6.11f, -2.31f)
                curveToRelative(0.3f, -0.04f, 0.58f, -0.16f, 0.79f, -0.35f)
                curveToRelative(1.78f, -1.61f, 4.49f, -1.54f, 6.17f, 0.14f)
                curveToRelative(0.14f, 0.14f, 0.57f, 0.58f, 1.1f, 1.11f)
                curveToRelative(1.12f, 1.14f, 1.12f, 3.0f, 0f, 4.14f)
                curveToRelative(-0.53f, 0.54f, -0.95f, 0.97f, -1.1f, 1.11f)
                curveToRelative(-1.65f, 1.65f, -4.33f, 1.74f, -6.1f, 0.21f)
                curveToRelative(-0.32f, -0.27f, -0.72f, -0.41f, -1.1f, -0.36f)
                curveToRelative(-0.9f, 0.1f, -1.86f, 0.41f, -1.86f, 0.97f)
                curveToRelative(0f, 0.98f, 0f, 2.31f, 2.24f, 4.93f)
                curveToRelative(1.08f, 1.26f, 3.3f, 3.61f, 4.9f, 4.57f)
                horizontalLineToRelative(0.85f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 8.5f)
                curveToRelative(0f, 2.75f, 1.44f, 5.56f, 3.17f, 7.76f)
                curveToRelative(0f, 0f, 1.04f, 1.24f, 1.54f, 1.74f)
                horizontalLineToRelative(5.72f)
                curveToRelative(-1.48f, -1.19f, -3.08f, -2.9f, -3.95f, -3.92f)
                curveToRelative(-2.48f, -2.9f, -2.48f, -4.51f, -2.48f, -5.58f)
                curveToRelative(0f, -0.5f, 0.27f, -1.69f, 2.75f, -1.97f)
                curveToRelative(0.66f, -0.07f, 1.34f, 0.15f, 1.86f, 0.6f)
                curveToRelative(1.38f, 1.19f, 3.46f, 1.12f, 4.74f, -0.16f)
                curveToRelative(0.14f, -0.14f, 0.57f, -0.57f, 1.09f, -1.11f)
                curveToRelative(0.74f, -0.76f, 0.74f, -1.98f, 0f, -2.74f)
                curveToRelative(-0.52f, -0.53f, -0.95f, -0.96f, -1.09f, -1.11f)
                curveToRelative(-1.31f, -1.31f, -3.42f, -1.35f, -4.8f, -0.11f)
                curveToRelative(-0.37f, 0.33f, -0.84f, 0.55f, -1.35f, 0.6f)
                curveToRelative(-1.52f, 0.18f, -4.26f, 0.88f, -5.56f, 2.06f)
                curveToRelative(-0.75f, 0.68f, -1.64f, 1.91f, -1.64f, 3.92f)
                close()
                moveTo(5.87f, 18f)
                horizontalLineToRelative(5.46f)
                curveToRelative(-0.3f, -0.33f, -0.6f, -0.69f, -0.89f, -1.06f)
                lineToRelative(-2.89f, -3.21f)
                curveToRelative(-0.39f, -0.47f, -2.39f, -1.41f, -3.63f, -1.71f)
                curveToRelative(-0.24f, -0.06f, -0.48f, 0.0f, -0.67f, 0.17f)
                curveToRelative(-0.19f, 0.17f, -0.28f, 0.41f, -0.25f, 0.67f)
                curveToRelative(0.14f, 1.1f, 0.76f, 2.59f, 1.17f, 3.09f)
                lineToRelative(1.69f, 2.06f)
                close()
                moveTo(23f, 21f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(3f, 19f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _Snake = it}
