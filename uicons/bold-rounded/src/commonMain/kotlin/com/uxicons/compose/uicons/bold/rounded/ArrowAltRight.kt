package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltRight: ImageVector? = null

val Icons.Br.ArrowAltRight: ImageVector
    get() = _ArrowAltRight ?: UXIcon(name = "ArrowAltRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.73f, 11.36f)
            lineToRelative(-5.15f, -5.09f)
            curveToRelative(-0.58f, -0.57f, -1.57f, -0.17f, -1.57f, 0.64f)
            verticalLineToRelative(3.59f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(15.5f)
            verticalLineToRelative(3.59f)
            curveToRelative(0f, 0.81f, 0.99f, 1.22f, 1.57f, 0.64f)
            lineToRelative(5.15f, -5.09f)
            curveToRelative(0.36f, -0.36f, 0.36f, -0.93f, 0f, -1.29f)
            close()
        }
    }.also { _ArrowAltRight = it }
