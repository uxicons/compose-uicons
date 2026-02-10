package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Sc.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.69f, 5.98f)
                curveToRelative(0.31f, 0.08f, 0.6f, 0.12f, 0.86f, 0.12f)
                curveToRelative(0.4f, 0f, 0.76f, -0.09f, 1.08f, -0.28f)
                curveToRelative(0.53f, -0.31f, 0.9f, -0.86f, 1.1f, -1.64f)
                horizontalLineToRelative(0f)
                curveToRelative(0.23f, -0.91f, 0.32f, -2.51f, -1.78f, -3.06f)
                curveToRelative(-0.72f, -0.19f, -1.31f, -0.16f, -1.82f, 0.09f)
                curveToRelative(-0.6f, 0.29f, -1.01f, 0.87f, -1.23f, 1.71f)
                curveToRelative(-0.23f, 0.91f, -0.32f, 2.51f, 1.78f, 3.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.03f, 16.36f)
                lineToRelative(-0.73f, -0.59f)
                curveToRelative(-0.13f, -0.11f, -0.25f, -0.22f, -0.36f, -0.35f)
                lineToRelative(-2.42f, 0.23f)
                curveToRelative(-0.55f, 0.05f, -0.95f, 0.54f, -0.9f, 1.09f)
                curveToRelative(0.05f, 0.52f, 0.48f, 0.91f, 0.99f, 0.91f)
                curveToRelative(0.03f, 0f, 0.06f, 0f, 0.09f, -0.0f)
                lineToRelative(4.17f, -0.39f)
                curveToRelative(-0.24f, -0.33f, -0.52f, -0.63f, -0.84f, -0.89f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 12.12f)
                curveToRelative(-1.09f, -0.68f, -1.82f, -1.8f, -2.0f, -3.07f)
                lineToRelative(-0.15f, -1.02f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(-0.05f, -0.33f, -0.27f, -0.63f, -0.59f, -0.77f)
                curveToRelative(-1.14f, -0.49f, -2.34f, -0.79f, -3.65f, -0.88f)
                curveToRelative(-0.0f, 0f, -1.07f, -0.01f, -1.07f, -0.01f)
                curveToRelative(-1.87f, -0.01f, -3.65f, 0.77f, -4.88f, 2.17f)
                curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.1f, 1.41f)
                curveToRelative(0.19f, 0.17f, 0.42f, 0.25f, 0.66f, 0.25f)
                curveToRelative(0.28f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.68f, -0.77f, 1.58f, -1.27f, 2.59f, -1.43f)
                curveToRelative(-0.77f, 1.51f, -1.27f, 3.16f, -1.47f, 4.85f)
                curveToRelative(0f, 0.01f, -0.0f, 0.01f, -0.0f, 0.01f)
                curveToRelative(-0.04f, 0.35f, 0.1f, 0.69f, 0.37f, 0.91f)
                lineToRelative(0.73f, 0.59f)
                curveToRelative(0.73f, 0.57f, 1.23f, 1.3f, 1.23f, 1.3f)
                curveToRelative(1.1f, 1.55f, 1.48f, 3.5f, 1.03f, 5.35f)
                lineToRelative(-0.07f, 0.31f)
                curveToRelative(-0.13f, 0.54f, 0.2f, 1.08f, 0.74f, 1.21f)
                curveToRelative(0.08f, 0.02f, 0.16f, 0.03f, 0.23f, 0.03f)
                curveToRelative(0.45f, 0f, 0.86f, -0.31f, 0.97f, -0.77f)
                lineToRelative(0.07f, -0.31f)
                curveToRelative(0.5f, -2.1f, 0.2f, -4.31f, -0.84f, -6.18f)
                curveToRelative(0.39f, -0.43f, 0.68f, -0.92f, 0.86f, -1.46f)
                lineToRelative(1.1f, -2.88f)
                curveToRelative(0.52f, 0.98f, 1.29f, 1.81f, 2.25f, 2.41f)
                curveToRelative(0.17f, 0.1f, 0.35f, 0.15f, 0.53f, 0.15f)
                curveToRelative(0.33f, 0f, 0.66f, -0.17f, 0.85f, -0.47f)
                curveToRelative(0.29f, -0.47f, 0.15f, -1.09f, -0.32f, -1.38f)
                close()
            }
        }.also { _Running = it}
