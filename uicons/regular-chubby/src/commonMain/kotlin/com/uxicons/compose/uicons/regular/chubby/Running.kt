package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Rc.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.65f, 5.98f)
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
                moveTo(18.88f, 12.12f)
                curveToRelative(-1.09f, -0.68f, -1.82f, -1.8f, -2.0f, -3.07f)
                lineToRelative(-0.15f, -1.02f)
                curveToRelative(-0.05f, -0.34f, -0.28f, -0.63f, -0.59f, -0.77f)
                curveToRelative(-1.14f, -0.49f, -2.34f, -0.81f, -3.65f, -0.88f)
                curveToRelative(-0.0f, 0f, -1.07f, -0.01f, -1.07f, -0.01f)
                curveToRelative(-1.87f, -0.01f, -3.65f, 0.77f, -4.88f, 2.17f)
                curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.1f, 1.41f)
                curveToRelative(0.19f, 0.17f, 0.42f, 0.25f, 0.66f, 0.25f)
                curveToRelative(0.28f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.68f, -0.77f, 1.59f, -1.27f, 2.59f, -1.43f)
                curveToRelative(-0.77f, 1.51f, -1.27f, 3.16f, -1.47f, 4.85f)
                curveToRelative(0f, 0.01f, -0.0f, 0.01f, -0.0f, 0.01f)
                curveToRelative(-0.04f, 0.35f, 0.1f, 0.69f, 0.37f, 0.91f)
                lineToRelative(0.73f, 0.59f)
                curveToRelative(1.96f, 1.58f, 2.85f, 4.19f, 2.26f, 6.66f)
                lineToRelative(-0.07f, 0.31f)
                curveToRelative(-0.13f, 0.54f, 0.2f, 1.08f, 0.74f, 1.21f)
                curveToRelative(0.08f, 0.02f, 0.16f, 0.03f, 0.23f, 0.03f)
                curveToRelative(0.45f, 0f, 0.86f, -0.31f, 0.97f, -0.77f)
                lineToRelative(0.07f, -0.31f)
                curveToRelative(0.77f, -3.21f, -0.39f, -6.62f, -2.95f, -8.68f)
                lineToRelative(-0.3f, -0.24f)
                curveToRelative(0.26f, -1.62f, 0.84f, -3.18f, 1.71f, -4.57f)
                curveToRelative(0.52f, 0.07f, 1.04f, 0.18f, 1.54f, 0.34f)
                lineToRelative(-1.43f, 3.92f)
                curveToRelative(-0.05f, 0.14f, -0.11f, 0.28f, -0.18f, 0.42f)
                curveToRelative(0.51f, 0.5f, 0.95f, 1.06f, 1.33f, 1.66f)
                curveToRelative(0.3f, -0.42f, 0.54f, -0.89f, 0.73f, -1.39f)
                lineToRelative(0.69f, -1.91f)
                curveToRelative(0.52f, 0.95f, 1.28f, 1.77f, 2.22f, 2.36f)
                curveToRelative(0.47f, 0.29f, 1.08f, 0.15f, 1.38f, -0.32f)
                curveToRelative(0.29f, -0.47f, 0.15f, -1.09f, -0.32f, -1.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.62f, 15.58f)
                lineToRelative(-0.3f, -0.24f)
                lineToRelative(-3.77f, 0.38f)
                curveToRelative(-0.55f, 0.06f, -0.95f, 0.55f, -0.9f, 1.09f)
                curveToRelative(0.05f, 0.52f, 0.49f, 0.9f, 0.99f, 0.9f)
                curveToRelative(0.03f, 0f, 0.07f, -0.0f, 0.1f, -0.01f)
                lineToRelative(4.03f, -0.4f)
                curveToRelative(0.39f, -0.03f, 0.77f, -0.11f, 1.14f, -0.21f)
                curveToRelative(-0.33f, -0.57f, -0.77f, -1.08f, -1.29f, -1.51f)
                close()
            }
        }.also { _Running = it}
