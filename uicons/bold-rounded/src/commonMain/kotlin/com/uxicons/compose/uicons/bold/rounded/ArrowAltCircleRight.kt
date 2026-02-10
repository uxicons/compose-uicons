package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleRight: ImageVector? = null

val Icons.Br.ArrowAltCircleRight: ImageVector
    get() = _ArrowAltCircleRight ?: UXIcon(name = "ArrowAltCircleRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(17.77f, 11.45f)
            curveToRelative(0.31f, 0.3f, 0.31f, 0.8f, 0f, 1.1f)
            lineToRelative(-4.24f, 4.19f)
            curveToRelative(-0.57f, 0.56f, -1.52f, 0.16f, -1.52f, -0.64f)
            verticalLineToRelative(-2.6f)
            lineTo(7.5f, 13.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(-2.6f)
            curveToRelative(0f, -0.8f, 0.96f, -1.2f, 1.52f, -0.64f)
            lineToRelative(4.24f, 4.19f)
            close()
        }
    }.also { _ArrowAltCircleRight = it }
