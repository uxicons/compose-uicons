package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltUp: ImageVector? = null

val Icons.Br.ArrowAltUp: ImageVector
    get() = _ArrowAltUp ?: UXIcon(name = "ArrowAltUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.73f, 5.42f)
            lineTo(12.64f, 0.27f)
            curveToRelative(-0.36f, -0.36f, -0.93f, -0.36f, -1.29f, 0f)
            lineTo(6.27f, 5.42f)
            curveToRelative(-0.57f, 0.58f, -0.17f, 1.57f, 0.64f, 1.57f)
            horizontalLineToRelative(3.59f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(3.59f)
            curveToRelative(0.81f, 0f, 1.22f, -0.99f, 0.64f, -1.57f)
            close()
        }
    }.also { _ArrowAltUp = it }
