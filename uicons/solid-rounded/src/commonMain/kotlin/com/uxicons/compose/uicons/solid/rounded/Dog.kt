package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dog: ImageVector? = null

val Icons.Sr.Dog: ImageVector
    get() = _Dog ?: UXIcon(name = "Dog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-0.31f, 0f, -0.59f, -0.17f, -0.72f, -0.45f)
                curveToRelative(-0.48f, -0.96f, -1.44f, -1.55f, -2.51f, -1.55f)
                horizontalLineToRelative(-1.38f)
                verticalLineTo(0.77f)
                curveToRelative(0f, -0.53f, -0.52f, -0.9f, -1.01f, -0.73f)
                curveToRelative(-1.16f, 0.42f, -1.99f, 1.52f, -1.99f, 2.82f)
                verticalLineToRelative(1.63f)
                lineToRelative(-0.96f, 2.84f)
                curveToRelative(-0.14f, 0.4f, -0.52f, 0.66f, -0.94f, 0.66f)
                lineToRelative(-5.1f, 0.0f)
                curveToRelative(-1.09f, 0f, -2.1f, 0.35f, -2.92f, 0.95f)
                curveToRelative(-0.6f, -0.28f, -2.08f, -1.14f, -2.08f, -2.95f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 2.47f, 1.6f, 3.83f, 2.69f, 4.48f)
                curveToRelative(-0.44f, 0.74f, -0.69f, 1.61f, -0.69f, 2.53f)
                lineToRelative(0.0f, 8.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.51f)
                lineToRelative(6f, -0.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0f, -0.4f, 0.04f, -0.8f, 0.12f, -1.19f)
                lineToRelative(2.06f, -6.15f)
                curveToRelative(2.12f, -0.09f, 3.82f, -1.85f, 3.82f, -4.0f)
                curveToRelative(0f, -0.92f, -0.7f, -1.9f, -2f, -1.9f)
                close()
            }
        }.also { _Dog = it}
