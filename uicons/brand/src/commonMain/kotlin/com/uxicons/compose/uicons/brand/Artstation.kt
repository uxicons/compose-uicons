package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Artstation: ImageVector? = null

val Icons.Brand.Artstation: ImageVector
    get() = _Artstation ?: UXIcon(name = "Artstation") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 17.73f)
            lineToRelative(2.03f, 3.5f)
            lineToRelative(0f, 0f)
            curveToRelative(0.4f, 0.79f, 1.22f, 1.33f, 2.17f, 1.33f)
            lineToRelative(0f, 0f)
            lineToRelative(0f, 0f)
            horizontalLineToRelative(13.46f)
            lineToRelative(-2.79f, -4.84f)
            horizontalLineTo(0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 17.75f)
            curveToRelative(0f, -0.48f, -0.15f, -0.94f, -0.39f, -1.31f)
            lineTo(15.73f, 2.72f)
            curveToRelative(-0.41f, -0.77f, -1.21f, -1.29f, -2.14f, -1.29f)
            horizontalLineTo(9.42f)
            lineToRelative(12.18f, 21.1f)
            lineToRelative(1.92f, -3.33f)
            curveTo(23.9f, 18.57f, 24f, 18.3f, 24f, 17.75f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.87f, 14.29f)
            lineToRelative(-5.45f, -9.44f)
            lineToRelative(-5.45f, 9.44f)
            close()
        }
    }.also { _Artstation = it }
