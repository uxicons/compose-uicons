package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Sc.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.79f, 8.85f)
                curveToRelative(-0.47f, -1.26f, -1.55f, -2.0f, -2.87f, -1.95f)
                curveToRelative(-1.0f, 0.03f, -2.0f, 0.06f, -3.01f, 0.08f)
                curveToRelative(-0.45f, 0.04f, -0.87f, -0.28f, -1.0f, -0.73f)
                curveToRelative(-0.3f, -0.96f, -0.59f, -1.92f, -0.9f, -2.88f)
                curveToRelative(-0.41f, -1.3f, -1.59f, -2.14f, -3.01f, -2.14f)
                reflectiveCurveToRelative(-2.6f, 0.84f, -3.01f, 2.14f)
                curveToRelative(-0.3f, 0.96f, -0.6f, 1.92f, -0.9f, 2.88f)
                curveToRelative(-0.14f, 0.45f, -0.54f, 0.77f, -1.0f, 0.73f)
                curveToRelative(-1.0f, -0.02f, -2.0f, -0.05f, -3.0f, -0.08f)
                curveToRelative(-1.31f, -0.05f, -2.41f, 0.69f, -2.88f, 1.95f)
                curveToRelative(-0.51f, 1.37f, -0.08f, 2.89f, 1.07f, 3.79f)
                curveToRelative(0.81f, 0.62f, 1.62f, 1.23f, 2.42f, 1.83f)
                curveToRelative(0.38f, 0.28f, 0.53f, 0.8f, 0.37f, 1.27f)
                curveToRelative(-0.33f, 0.98f, -0.68f, 1.96f, -1.04f, 2.95f)
                curveToRelative(-0.49f, 1.3f, -0.14f, 2.66f, 0.89f, 3.45f)
                curveToRelative(1.09f, 0.84f, 2.63f, 0.83f, 3.85f, -0.04f)
                lineToRelative(2.56f, -1.84f)
                curveToRelative(0.41f, -0.3f, 0.95f, -0.3f, 1.36f, 0f)
                lineToRelative(2.56f, 1.84f)
                curveToRelative(0.61f, 0.44f, 1.31f, 0.66f, 1.99f, 0.66f)
                curveToRelative(0.66f, 0f, 1.31f, -0.21f, 1.85f, -0.62f)
                curveToRelative(1.03f, -0.8f, 1.38f, -2.15f, 0.9f, -3.44f)
                curveToRelative(-0.36f, -0.99f, -0.71f, -1.98f, -1.05f, -2.95f)
                curveToRelative(-0.16f, -0.47f, -0.01f, -0.98f, 0.37f, -1.27f)
                curveToRelative(0.81f, -0.6f, 1.61f, -1.21f, 2.43f, -1.84f)
                curveToRelative(1.14f, -0.89f, 1.57f, -2.41f, 1.06f, -3.78f)
                close()
            }
        }.also { _Star = it}
