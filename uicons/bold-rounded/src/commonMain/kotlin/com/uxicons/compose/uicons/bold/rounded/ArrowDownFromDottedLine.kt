package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromDottedLine: ImageVector? = null

val Icons.Br.ArrowDownFromDottedLine: ImageVector
    get() = _ArrowDownFromDottedLine ?: UXIcon(name = "ArrowDownFromDottedLine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(17f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(22f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(7f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(2f, 0f)
            curveTo(1.17f, 0f, 0.5f, 0.67f, 0.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16.96f, 16.42f)
            lineToRelative(-3.46f, 3.33f)
            lineTo(13.5f, 6.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(13.25f)
            lineToRelative(-3.46f, -3.33f)
            curveToRelative(-0.6f, -0.58f, -1.55f, -0.56f, -2.12f, 0.04f)
            curveToRelative(-0.57f, 0.6f, -0.56f, 1.55f, 0.04f, 2.12f)
            lineToRelative(4.56f, 4.39f)
            curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.48f, 1.03f)
            reflectiveCurveToRelative(1.81f, -0.36f, 2.45f, -1.01f)
            lineToRelative(4.59f, -4.41f)
            curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.04f, -2.12f)
            curveToRelative(-0.57f, -0.6f, -1.52f, -0.62f, -2.12f, -0.04f)
            close()
        }
    }.also { _ArrowDownFromDottedLine = it }
