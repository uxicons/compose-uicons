package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Br.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 10.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(-3.59f)
            curveToRelative(0f, -0.81f, -0.99f, -1.22f, -1.57f, -0.64f)
            lineTo(3.23f, 11.36f)
            curveToRelative(-0.11f, 0.11f, -0.19f, 0.25f, -0.23f, 0.39f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7.25f)
            curveToRelative(0.04f, 0.14f, 0.12f, 0.28f, 0.23f, 0.39f)
            lineToRelative(5.19f, 5.09f)
            curveToRelative(0.58f, 0.57f, 1.57f, 0.17f, 1.57f, -0.64f)
            verticalLineToRelative(-3.59f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltToLeft = it }
