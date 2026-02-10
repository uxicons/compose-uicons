package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassEmpty: ImageVector? = null

val Icons.Br.GlassEmpty: ImageVector
    get() = _GlassEmpty ?: UXIcon(name = "GlassEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.08f, 1.14f)
            curveToRelative(-0.66f, -0.72f, -1.6f, -1.14f, -2.58f, -1.14f)
            lineTo(4.5f, 0f)
            curveToRelative(-0.97f, 0f, -1.91f, 0.41f, -2.57f, 1.13f)
            curveToRelative(-0.66f, 0.72f, -0.99f, 1.69f, -0.92f, 2.66f)
            lineToRelative(1.25f, 15.16f)
            curveToRelative(0.23f, 2.83f, 2.64f, 5.05f, 5.48f, 5.05f)
            horizontalLineToRelative(8.43f)
            curveToRelative(2.87f, 0f, 5.23f, -2.16f, 5.48f, -5.02f)
            lineToRelative(1.33f, -15.18f)
            curveToRelative(0.09f, -0.97f, -0.24f, -1.95f, -0.91f, -2.67f)
            close()
            moveTo(20.0f, 3.54f)
            lineToRelative(-1.33f, 15.18f)
            curveToRelative(-0.11f, 1.3f, -1.19f, 2.28f, -2.49f, 2.28f)
            lineTo(7.74f, 21f)
            curveToRelative(-1.29f, 0f, -2.39f, -1.01f, -2.49f, -2.29f)
            lineToRelative(-1.25f, -15.16f)
            curveToRelative(-0.02f, -0.19f, 0.07f, -0.32f, 0.13f, -0.38f)
            curveToRelative(0.06f, -0.06f, 0.18f, -0.16f, 0.37f, -0.16f)
            horizontalLineToRelative(15f)
            curveToRelative(0.19f, 0f, 0.31f, 0.1f, 0.37f, 0.16f)
            curveToRelative(0.06f, 0.06f, 0.15f, 0.19f, 0.13f, 0.38f)
            close()
        }
    }.also { _GlassEmpty = it }
