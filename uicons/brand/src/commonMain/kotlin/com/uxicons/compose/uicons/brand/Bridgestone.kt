package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bridgestone: ImageVector? = null

val Icons.Brand.Bridgestone: ImageVector
    get() = _Bridgestone ?: UXIcon(name = "Bridgestone") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.95f, 13.55f)
            lineTo(5.88f, 3.26f)
            curveTo(6.17f, 2.2f, 7.34f, 1.24f, 8.52f, 1.24f)
            horizontalLineToRelative(8.97f)
            curveToRelative(0.15f, 0f, 0.2f, 0.2f, 0.08f, 0.28f)
            curveTo(12.91f, 4.7f, 7.28f, 9.44f, 3.2f, 13.68f)
            curveTo(3.1f, 13.8f, 2.91f, 13.71f, 2.95f, 13.55f)
            lineTo(2.95f, 13.55f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.04f, 19.73f)
            lineToRelative(2.9f, -10.16f)
            curveToRelative(0.04f, -0.15f, -0.12f, -0.27f, -0.25f, -0.16f)
            curveToRelative(-4.27f, 3.68f, -9.43f, 9.04f, -12.65f, 13.11f)
            curveToRelative(-0.08f, 0.1f, -0.04f, 0.26f, 0.1f, 0.26f)
            horizontalLineToRelative(12.57f)
            curveToRelative(5.3f, 0f, 8.2f, -1.64f, 9.25f, -5.57f)
            curveToRelative(0.86f, -3.19f, -0.82f, -5.38f, -3.49f, -5.94f)
            curveToRelative(-0.05f, -0.01f, -0.09f, -0.1f, 0f, -0.12f)
            curveToRelative(2.26f, -0.39f, 4.54f, -1.3f, 5.36f, -4.6f)
            curveToRelative(0.88f, -3.57f, -1.85f, -5.53f, -4.99f, -5.33f)
            lineToRelative(-4.8f, 16.82f)
            curveToRelative(-0.26f, 0.91f, -1.23f, 1.67f, -2.16f, 1.67f)
            horizontalLineTo(10.04f)
            lineTo(10.04f, 19.73f)
            close()
        }
    }.also { _Bridgestone = it }
