package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarriottInternational: ImageVector? = null

val Icons.Brand.MarriottInternational: ImageVector
    get() = _MarriottInternational ?: UXIcon(name = "MarriottInternational") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.49f, 20.41f)
            horizontalLineTo(24f)
            lineTo(16.45f, 2.42f)
            lineTo(12.66f, 4.26f)
            lineToRelative(2.64f, 6.26f)
            lineToRelative(-1.22f, 2.91f)
            lineTo(9.35f, 2.13f)
            lineToRelative(-3.83f, 1.75f)
            lineToRelative(3.06f, 7.25f)
            curveToRelative(-1.9f, 4.56f, -4.22f, 5.81f, -4.45f, 5.89f)
            curveToRelative(-0.54f, 0.22f, -1.12f, 0.34f, -1.73f, 0.34f)
            curveToRelative(-0.19f, 0f, -0.37f, -0.01f, -0.55f, -0.03f)
            lineTo(0f, 21.31f)
            curveToRelative(0.61f, 0.35f, 1.3f, 0.56f, 2.03f, 0.56f)
            curveToRelative(0.93f, 0f, 1.77f, -0.32f, 2.48f, -0.85f)
            lineToRelative(-0.01f, 0.02f)
            curveToRelative(0f, 0f, 1.75f, -0.89f, 3.62f, -5.74f)
            curveToRelative(0f, -0.01f, 1.1f, -2.65f, 1.1f, -2.65f)
            lineToRelative(3.29f, 7.78f)
            horizontalLineToRelative(4.5f)
            lineToRelative(-2.32f, -5.48f)
            lineToRelative(1.23f, -2.91f)
            lineTo(19.49f, 20.41f)
            close()
        }
    }.also { _MarriottInternational = it }
