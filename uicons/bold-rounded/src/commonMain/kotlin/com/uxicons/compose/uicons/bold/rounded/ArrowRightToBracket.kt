package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToBracket: ImageVector? = null

val Icons.Br.ArrowRightToBracket: ImageVector
    get() = _ArrowRightToBracket ?: UXIcon(name = "ArrowRightToBracket") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(18f, 12f)
            curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1f, -2.45f)
            lineToRelative(-4.41f, -4.59f)
            curveToRelative(-0.58f, -0.6f, -1.52f, -0.62f, -2.12f, -0.04f)
            curveToRelative(-0.6f, 0.57f, -0.62f, 1.52f, -0.04f, 2.12f)
            lineToRelative(3.33f, 3.46f)
            lineTo(1.5f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(13.75f, 13.5f)
            lineToRelative(-3.33f, 3.46f)
            curveToRelative(-0.57f, 0.6f, -0.56f, 1.55f, 0.04f, 2.12f)
            curveToRelative(0.29f, 0.28f, 0.67f, 0.42f, 1.04f, 0.42f)
            curveToRelative(0.39f, 0f, 0.79f, -0.15f, 1.08f, -0.46f)
            lineToRelative(4.39f, -4.56f)
            curveToRelative(0.66f, -0.66f, 1.03f, -1.54f, 1.03f, -2.48f)
            close()
        }
    }.also { _ArrowRightToBracket = it }
