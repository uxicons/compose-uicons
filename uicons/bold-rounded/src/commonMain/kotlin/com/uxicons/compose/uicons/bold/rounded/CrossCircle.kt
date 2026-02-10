package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossCircle: ImageVector? = null

val Icons.Br.CrossCircle: ImageVector
    get() = _CrossCircle ?: UXIcon(name = "CrossCircle", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(342.64f, 169.37f)
            curveToRelative(-12.49f, -12.5f, -32.75f, -12.51f, -45.26f, -0.01f)
            curveToRelative(-0f, 0f, -0.01f, 0.01f, -0.01f, 0.01f)
            lineTo(256f, 210.75f)
            lineToRelative(-41.37f, -41.39f)
            curveToRelative(-12.5f, -12.5f, -32.77f, -12.5f, -45.27f, 0f)
            reflectiveCurveToRelative(-12.5f, 32.77f, 0f, 45.27f)
            lineTo(210.75f, 256f)
            lineToRelative(-41.39f, 41.37f)
            curveToRelative(-12.5f, 12.5f, -12.5f, 32.77f, 0f, 45.27f)
            curveToRelative(12.5f, 12.5f, 32.77f, 12.5f, 45.27f, 0f)
            lineToRelative(0f, 0f)
            lineTo(256f, 301.25f)
            lineToRelative(41.37f, 41.39f)
            curveToRelative(12.5f, 12.5f, 32.77f, 12.5f, 45.27f, 0f)
            curveToRelative(12.5f, -12.5f, 12.5f, -32.77f, 0f, -45.27f)
            lineTo(301.25f, 256f)
            lineToRelative(41.39f, -41.37f)
            curveToRelative(12.5f, -12.49f, 12.51f, -32.75f, 0.01f, -45.26f)
            curveTo(342.64f, 169.38f, 342.64f, 169.37f, 342.64f, 169.37f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 0f)
            curveTo(114.61f, 0f, 0f, 114.61f, 0f, 256f)
            reflectiveCurveToRelative(114.61f, 256f, 256f, 256f)
            reflectiveCurveToRelative(256f, -114.61f, 256f, -256f)
            curveTo(511.85f, 114.68f, 397.32f, 0.15f, 256f, 0f)
            close()
            moveTo(256f, 448f)
            curveToRelative(-106.04f, 0f, -192f, -85.96f, -192f, -192f)
            reflectiveCurveTo(149.96f, 64f, 256f, 64f)
            reflectiveCurveToRelative(192f, 85.96f, 192f, 192f)
            curveTo(447.88f, 361.99f, 361.99f, 447.88f, 256f, 448f)
            close()
        }
    }.also { _CrossCircle = it }
