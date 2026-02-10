package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayChartUp: ImageVector? = null

val Icons.Br.DisplayChartUp: ImageVector
    get() = _DisplayChartUp ?: UXIcon(name = "DisplayChartUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 1f)
            lineTo(5.5f, 1f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 12.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 15f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 6.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(6f)
            close()
            moveTo(19f, 7.08f)
            verticalLineToRelative(3.51f)
            curveToRelative(0f, 0.82f, -1.0f, 1.24f, -1.58f, 0.65f)
            lineToRelative(-0.78f, -0.78f)
            lineToRelative(-1.4f, 1.4f)
            curveToRelative(-0.55f, 0.55f, -1.27f, 0.82f, -1.99f, 0.82f)
            reflectiveCurveToRelative(-1.44f, -0.27f, -1.99f, -0.82f)
            lineToRelative(-1.75f, -1.75f)
            lineToRelative(-1.96f, 1.95f)
            curveToRelative(-0.59f, 0.58f, -1.54f, 0.58f, -2.12f, -0.01f)
            curveToRelative(-0.58f, -0.59f, -0.58f, -1.54f, 0.01f, -2.12f)
            lineToRelative(2.09f, -2.08f)
            curveToRelative(1.1f, -1.09f, 2.88f, -1.09f, 3.97f, 0.01f)
            lineToRelative(1.75f, 1.75f)
            lineToRelative(1.27f, -1.27f)
            lineToRelative(-0.75f, -0.75f)
            curveToRelative(-0.58f, -0.58f, -0.17f, -1.58f, 0.65f, -1.58f)
            horizontalLineToRelative(3.51f)
            curveToRelative(0.59f, 0f, 1.06f, 0.47f, 1.06f, 1.06f)
            close()
        }
    }.also { _DisplayChartUp = it }
