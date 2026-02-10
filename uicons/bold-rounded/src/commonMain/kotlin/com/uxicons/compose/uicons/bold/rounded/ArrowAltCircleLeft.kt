package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Br.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
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
            moveTo(18f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(2.63f)
            curveToRelative(0f, 0.79f, -0.95f, 1.18f, -1.51f, 0.63f)
            lineToRelative(-4.26f, -4.21f)
            curveToRelative(-0.31f, -0.3f, -0.31f, -0.8f, 0f, -1.1f)
            lineToRelative(4.26f, -4.21f)
            curveToRelative(0.56f, -0.55f, 1.51f, -0.16f, 1.51f, 0.63f)
            verticalLineToRelative(2.63f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ArrowAltCircleLeft = it }
