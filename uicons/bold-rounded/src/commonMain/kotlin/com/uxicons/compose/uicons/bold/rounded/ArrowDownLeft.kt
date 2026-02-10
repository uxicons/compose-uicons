package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Br.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 2.56f)
            lineTo(5.12f, 21f)
            horizontalLineTo(13.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4.5f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineTo(10.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(8.38f)
            lineTo(21.44f, 0.44f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.54f, 0f, 2.12f)
            close()
        }
    }.also { _ArrowDownLeft = it }
