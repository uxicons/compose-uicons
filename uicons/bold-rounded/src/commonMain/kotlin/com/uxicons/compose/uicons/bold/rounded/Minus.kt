package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Minus: ImageVector? = null

val Icons.Br.Minus: ImageVector
    get() = _Minus ?: UXIcon(name = "Minus", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(480f, 288f)
            horizontalLineTo(32f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
            horizontalLineToRelative(448f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            reflectiveCurveTo(497.67f, 288f, 480f, 288f)
            close()
        }
    }.also { _Minus = it }
