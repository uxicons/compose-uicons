package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Br.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 19f)
            curveToRelative(-1.18f, 0f, -2.29f, -0.46f, -3.13f, -1.3f)
            lineToRelative(-3.92f, -3.87f)
            curveToRelative(-0.59f, -0.58f, -0.6f, -1.53f, -0.01f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.12f, -0.01f)
            lineToRelative(3.93f, 3.88f)
            curveToRelative(0.55f, 0.55f, 1.49f, 0.55f, 2.03f, 0.01f)
            lineToRelative(3.94f, -3.89f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.58f, 2.12f, 0.01f)
            curveToRelative(0.58f, 0.59f, 0.58f, 1.54f, -0.01f, 2.12f)
            lineToRelative(-3.93f, 3.88f)
            curveToRelative(-0.83f, 0.83f, -1.94f, 1.29f, -3.12f, 1.29f)
            close()
            moveTo(13.06f, 12.56f)
            lineToRelative(6.0f, -6f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-4.94f, 4.94f)
            lineTo(7.06f, 4.44f)
            curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(6.0f, 6f)
            curveToRelative(0.28f, 0.28f, 0.66f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.78f, -0.16f, 1.06f, -0.44f)
            close()
        }
    }.also { _AngleDoubleSmallDown = it }
