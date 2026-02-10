package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToRight: ImageVector? = null

val Icons.Br.ArrowAltToRight: ImageVector
    get() = _ArrowAltToRight ?: UXIcon(name = "ArrowAltToRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.25f)
            curveToRelative(-0.04f, -0.14f, -0.12f, -0.28f, -0.23f, -0.39f)
            lineToRelative(-5.19f, -5.09f)
            curveToRelative(-0.58f, -0.57f, -1.57f, -0.17f, -1.57f, 0.64f)
            verticalLineToRelative(3.59f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(14f)
            verticalLineToRelative(3.59f)
            curveToRelative(0f, 0.81f, 0.99f, 1.22f, 1.57f, 0.64f)
            lineToRelative(5.19f, -5.09f)
            curveToRelative(0.11f, -0.11f, 0.19f, -0.25f, 0.23f, -0.39f)
            verticalLineToRelative(7.25f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltToRight = it }
