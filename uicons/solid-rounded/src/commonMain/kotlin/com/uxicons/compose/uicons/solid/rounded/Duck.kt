package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Sr.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 17f)
                curveToRelative(-1.03f, 0f, -2.69f, 0.96f, -3.98f, 1.89f)
                curveToRelative(0.98f, 0.51f, 2.46f, 1.11f, 3.98f, 1.11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.61f, 10.97f)
                curveToRelative(-1.38f, 1.3f, -3.19f, 2.03f, -5.11f, 2.03f)
                curveToRelative(-0.53f, 0f, -1.06f, -0.05f, -1.6f, -0.17f)
                curveToRelative(-1.67f, -0.35f, -3.15f, -1.3f, -4.21f, -2.6f)
                curveToRelative(-1.48f, 1.47f, -3.27f, 2.77f, -4.23f, 2.77f)
                curveToRelative(-0.43f, 0f, -1.02f, -1.09f, -1.31f, -1.62f)
                curveToRelative(-0.09f, -0.17f, -0.18f, -0.34f, -0.27f, -0.47f)
                curveToRelative(-0.37f, -0.63f, -1.09f, -0.98f, -1.82f, -0.89f)
                curveToRelative(-0.73f, 0.09f, -1.32f, 0.59f, -1.53f, 1.29f)
                curveTo(0.18f, 12.57f, -0.02f, 14.95f, 0.0f, 16.02f)
                curveToRelative(0.12f, 4.7f, 3.67f, 7.97f, 8.65f, 7.97f)
                horizontalLineToRelative(6.94f)
                curveToRelative(3.59f, 0f, 7.41f, -2.56f, 7.41f, -7.3f)
                curveToRelative(0f, -2.11f, -1.25f, -4.26f, -2.38f, -5.73f)
                close()
                moveTo(16.96f, 19.06f)
                curveToRelative(-0.28f, 1.81f, -2.0f, 3.01f, -3.84f, 2.93f)
                curveToRelative(-2.22f, -0.1f, -4.16f, -1.02f, -5.43f, -1.8f)
                curveToRelative(-0.85f, -0.53f, -0.93f, -1.73f, -0.15f, -2.36f)
                curveToRelative(1.48f, -1.2f, 3.87f, -2.83f, 5.96f, -2.83f)
                curveToRelative(2.11f, 0f, 3.8f, 1.89f, 3.46f, 4.06f)
                close()
                moveTo(24f, 6.25f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.45f, -0.28f, 0.85f, -0.7f, 1.01f)
                lineToRelative(-3.15f, 1.18f)
                curveToRelative(-1.17f, 1.84f, -3.4f, 2.94f, -5.83f, 2.43f)
                curveToRelative(-2.08f, -0.43f, -3.76f, -2.11f, -4.19f, -4.19f)
                curveToRelative(-0.74f, -3.56f, 1.95f, -6.68f, 5.38f, -6.68f)
                curveToRelative(2.63f, 0f, 4.84f, 1.85f, 5.37f, 4.33f)
                lineToRelative(2.42f, 0.91f)
                curveToRelative(0.42f, 0.16f, 0.7f, 0.56f, 0.7f, 1.01f)
                close()
            }
        }.also { _Duck = it}
