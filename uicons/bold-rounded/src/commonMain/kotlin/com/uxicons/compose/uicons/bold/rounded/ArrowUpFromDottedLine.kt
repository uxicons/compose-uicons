package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromDottedLine: ImageVector? = null

val Icons.Br.ArrowUpFromDottedLine: ImageVector
    get() = _ArrowUpFromDottedLine ?: UXIcon(name = "ArrowUpFromDottedLine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(17f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(22f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(7f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(2f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(14.48f, 1.03f)
            curveToRelative(-0.66f, -0.66f, -1.54f, -1.03f, -2.48f, -1.03f)
            reflectiveCurveToRelative(-1.81f, 0.36f, -2.45f, 1f)
            lineTo(4.96f, 5.42f)
            curveToRelative(-0.6f, 0.58f, -0.62f, 1.52f, -0.04f, 2.12f)
            reflectiveCurveToRelative(1.52f, 0.61f, 2.12f, 0.04f)
            lineToRelative(3.46f, -3.33f)
            verticalLineToRelative(13.25f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(13.5f, 4.25f)
            lineToRelative(3.46f, 3.33f)
            curveToRelative(0.29f, 0.28f, 0.67f, 0.42f, 1.04f, 0.42f)
            curveToRelative(0.39f, 0f, 0.79f, -0.15f, 1.08f, -0.46f)
            curveToRelative(0.57f, -0.6f, 0.56f, -1.55f, -0.04f, -2.12f)
            lineTo(14.48f, 1.03f)
            close()
        }
    }.also { _ArrowUpFromDottedLine = it }
