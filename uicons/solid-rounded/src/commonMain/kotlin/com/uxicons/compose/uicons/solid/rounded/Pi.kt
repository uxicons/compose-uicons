package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Sr.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(6.5f)
                curveTo(4.48f, 0f, 2.88f, 0.59f, 1.73f, 1.75f)
                curveTo(-0.01f, 3.51f, 0f, 5.91f, 0f, 6.01f)
                curveToRelative(0.01f, 0.55f, 0.45f, 0.99f, 1f, 0.99f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, -0.0f, 0.99f, -0.45f, 0.99f, -1.0f)
                curveToRelative(0f, -0.41f, 0.13f, -3.99f, 4.5f, -3.99f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(13.61f)
                curveToRelative(0f, 4.08f, -2.66f, 6.63f, -2.68f, 6.66f)
                curveToRelative(-0.41f, 0.38f, -0.43f, 1.01f, -0.05f, 1.41f)
                curveToRelative(0.2f, 0.21f, 0.47f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0f, 0.49f, -0.09f, 0.68f, -0.27f)
                curveToRelative(0.14f, -0.13f, 3.32f, -3.14f, 3.32f, -8.12f)
                verticalLineTo(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Pi = it}
