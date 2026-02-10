package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceShuttle: ImageVector? = null

val Icons.Sc.SpaceShuttle: ImageVector
    get() = _SpaceShuttle ?: UXIcon(name = "SpaceShuttle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.24f, 16.96f)
                curveToRelative(1.81f, -0.98f, 2.95f, -2.82f, 2.95f, -4.94f)
                verticalLineToRelative(-0.02f)
                curveToRelative(-0.01f, -1.82f, -0.93f, -3.87f, -2.94f, -4.96f)
                horizontalLineTo(7.27f)
                verticalLineToRelative(9.91f)
                horizontalLineToRelative(4.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.28f, 7.04f)
                horizontalLineToRelative(-1.94f)
                curveToRelative(-0.39f, 0f, -0.75f, 0.23f, -0.91f, 0.59f)
                curveToRelative(-0.03f, 0.07f, -0.79f, 1.82f, -0.79f, 4.36f)
                curveToRelative(0f, 2.57f, 0.76f, 4.3f, 0.8f, 4.37f)
                curveToRelative(0.16f, 0.36f, 0.52f, 0.59f, 0.91f, 0.59f)
                horizontalLineToRelative(1.94f)
                verticalLineTo(7.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.18f, 12.0f)
                curveToRelative(0f, 1.85f, -0.64f, 3.58f, -1.75f, 4.9f)
                curveToRelative(5.26f, -0.51f, 6.8f, -4.37f, 6.87f, -4.55f)
                curveToRelative(0.09f, -0.23f, 0.09f, -0.48f, -0.0f, -0.72f)
                curveToRelative(-0.07f, -0.17f, -1.63f, -4.04f, -6.88f, -4.54f)
                curveToRelative(1.12f, 1.33f, 1.77f, 2.96f, 1.77f, 4.9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.27f, 22.82f)
                curveToRelative(1.19f, -0.84f, 2.11f, -2.33f, 2.78f, -3.87f)
                curveToRelative(0f, 0f, -8.93f, -0.01f, -9.04f, -0.02f)
                curveToRelative(0.79f, 1.57f, 2.1f, 3.7f, 2.16f, 3.77f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.72f, 0.3f)
                horizontalLineToRelative(2.81f)
                curveToRelative(0.2f, 0f, 0.41f, -0.06f, 0.57f, -0.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.05f, 5.05f)
                curveToRelative(-0.68f, -1.54f, -1.59f, -3.03f, -2.78f, -3.87f)
                curveToRelative(-0.17f, -0.12f, -0.37f, -0.18f, -0.57f, -0.18f)
                horizontalLineToRelative(-2.81f)
                curveToRelative(-0.27f, 0f, -0.53f, 0.11f, -0.72f, 0.3f)
                curveToRelative(-0.06f, 0.07f, -1.37f, 2.2f, -2.16f, 3.77f)
                curveToRelative(0.11f, -0.01f, 9.04f, -0.02f, 9.04f, -0.02f)
                close()
            }
        }.also { _SpaceShuttle = it}
