package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Xing: ImageVector? = null

val Icons.Brand.Xing: ImageVector
    get() = _Xing ?: UXIcon(name = "Xing") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.65f, 4.75f)
            curveToRelative(-0.21f, 0f, -0.38f, 0.08f, -0.47f, 0.22f)
            curveToRelative(-0.09f, 0.15f, -0.1f, 0.32f, 0f, 0.51f)
            lineToRelative(2.35f, 4.06f)
            curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0f, 0.02f)
            lineToRelative(-3.67f, 6.48f)
            curveToRelative(-0.1f, 0.19f, -0.09f, 0.39f, 0f, 0.54f)
            curveToRelative(0.09f, 0.14f, 0.23f, 0.24f, 0.44f, 0.24f)
            horizontalLineToRelative(3.47f)
            curveToRelative(0.52f, 0f, 0.75f, -0.36f, 0.93f, -0.69f)
            curveToRelative(0f, 0f, 3.6f, -6.36f, 3.74f, -6.6f)
            curveTo(10.43f, 9.52f, 8.07f, 5.38f, 8.07f, 5.38f)
            curveTo(7.9f, 5.07f, 7.62f, 4.75f, 7.09f, 4.75f)
            horizontalLineTo(3.65f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.19f, 0f)
            curveToRelative(-0.52f, 0f, -0.74f, 0.33f, -0.93f, 0.66f)
            curveToRelative(0f, 0f, -7.46f, 13.22f, -7.7f, 13.66f)
            curveToRelative(0.01f, 0.02f, 4.92f, 9.02f, 4.92f, 9.02f)
            curveTo(14.65f, 23.65f, 14.91f, 24f, 15.44f, 24f)
            horizontalLineTo(18.9f)
            curveToRelative(0.21f, 0f, 0.37f, -0.08f, 0.46f, -0.22f)
            curveToRelative(0.09f, -0.15f, 0.09f, -0.34f, -0.01f, -0.54f)
            lineToRelative(-4.88f, -8.91f)
            curveToRelative(-0.0f, -0.01f, -0.0f, -0.02f, 0f, -0.02f)
            lineToRelative(7.66f, -13.55f)
            curveToRelative(0.1f, -0.19f, 0.1f, -0.39f, 0.01f, -0.53f)
            curveTo(22.05f, 0.08f, 21.89f, 0f, 21.68f, 0f)
            lineTo(18.19f, 0f)
            lineTo(18.19f, 0f)
            close()
        }
    }.also { _Xing = it }
