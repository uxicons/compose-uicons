package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Tr.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.86f, 8.95f)
                curveToRelative(-0.39f, -1.19f, -1.44f, -1.95f, -2.69f, -1.95f)
                horizontalLineToRelative(-4.81f)
                lineToRelative(-1.67f, -5.04f)
                curveToRelative(-0.38f, -1.19f, -1.44f, -1.96f, -2.69f, -1.96f)
                reflectiveCurveToRelative(-2.31f, 0.77f, -2.69f, 1.96f)
                lineToRelative(-1.67f, 5.04f)
                lineTo(2.83f, 7f)
                curveToRelative(-1.25f, 0f, -2.3f, 0.77f, -2.69f, 1.95f)
                curveToRelative(-0.39f, 1.18f, 0.01f, 2.42f, 1.02f, 3.16f)
                lineToRelative(4.04f, 2.95f)
                lineToRelative(-1.53f, 4.75f)
                curveToRelative(-0.39f, 1.19f, 0.02f, 2.43f, 1.04f, 3.16f)
                curveToRelative(1.0f, 0.72f, 2.33f, 0.71f, 3.33f, -0.02f)
                lineToRelative(3.96f, -2.91f)
                lineToRelative(3.96f, 2.91f)
                curveToRelative(0.51f, 0.37f, 1.09f, 0.56f, 1.68f, 0.56f)
                curveToRelative(0.57f, 0f, 1.15f, -0.18f, 1.65f, -0.54f)
                curveToRelative(1.01f, -0.73f, 1.42f, -1.97f, 1.04f, -3.16f)
                lineToRelative(-1.53f, -4.75f)
                lineToRelative(4.04f, -2.95f)
                curveToRelative(1.01f, -0.73f, 1.41f, -1.98f, 1.02f, -3.16f)
                close()
                moveTo(22.25f, 11.3f)
                lineToRelative(-4.33f, 3.17f)
                curveToRelative(-0.17f, 0.13f, -0.25f, 0.35f, -0.18f, 0.56f)
                lineToRelative(1.65f, 5.09f)
                curveToRelative(0.25f, 0.77f, -0.01f, 1.57f, -0.67f, 2.04f)
                curveToRelative(-0.66f, 0.47f, -1.5f, 0.47f, -2.15f, -0.01f)
                lineToRelative(-4.26f, -3.13f)
                curveToRelative(-0.18f, -0.13f, -0.42f, -0.13f, -0.59f, 0f)
                lineToRelative(-4.26f, 3.13f)
                curveToRelative(-0.65f, 0.47f, -1.51f, 0.47f, -2.15f, 0.01f)
                curveToRelative(-0.66f, -0.47f, -0.92f, -1.27f, -0.67f, -2.04f)
                lineToRelative(1.65f, -5.09f)
                curveToRelative(0.07f, -0.21f, -0.01f, -0.43f, -0.18f, -0.56f)
                lineTo(1.75f, 11.3f)
                curveToRelative(-0.65f, -0.48f, -0.91f, -1.28f, -0.66f, -2.04f)
                curveToRelative(0.25f, -0.77f, 0.93f, -1.26f, 1.74f, -1.26f)
                horizontalLineToRelative(5.17f)
                curveToRelative(0.21f, 0f, 0.41f, -0.14f, 0.47f, -0.34f)
                lineToRelative(1.78f, -5.39f)
                curveToRelative(0.25f, -0.77f, 0.93f, -1.27f, 1.74f, -1.27f)
                reflectiveCurveToRelative(1.49f, 0.5f, 1.74f, 1.27f)
                lineToRelative(1.78f, 5.38f)
                curveToRelative(0.07f, 0.2f, 0.26f, 0.34f, 0.47f, 0.34f)
                horizontalLineToRelative(5.17f)
                curveToRelative(0.81f, 0f, 1.49f, 0.49f, 1.74f, 1.26f)
                reflectiveCurveToRelative(-0.01f, 1.57f, -0.66f, 2.04f)
                close()
            }
        }.also { _Star = it}
