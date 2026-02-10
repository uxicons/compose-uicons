package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Br.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 0f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7.25f)
            curveToRelative(-0.14f, 0.04f, -0.28f, 0.12f, -0.39f, 0.23f)
            lineToRelative(-5.09f, 5.19f)
            curveToRelative(-0.57f, 0.58f, -0.17f, 1.57f, 0.64f, 1.57f)
            horizontalLineToRelative(3.59f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(3.59f)
            curveToRelative(0.81f, 0f, 1.22f, -0.99f, 0.64f, -1.57f)
            lineTo(12.64f, 3.23f)
            curveToRelative(-0.11f, -0.11f, -0.25f, -0.19f, -0.39f, -0.23f)
            horizontalLineToRelative(7.25f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltToTop = it }
