package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exclamation: ImageVector? = null

val Icons.Br.Exclamation: ImageVector
    get() = _Exclamation ?: UXIcon(name = "Exclamation", viewportWidth = 512f, viewportHeight = 512f) {
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
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 321.94f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineTo(140.61f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(149.33f)
            curveTo(224f, 307.61f, 238.33f, 321.94f, 256f, 321.94f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(256.11f, 373.33f)
            moveToRelative(-32f, 0f)
            arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
            arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
        }
    }.also { _Exclamation = it }
