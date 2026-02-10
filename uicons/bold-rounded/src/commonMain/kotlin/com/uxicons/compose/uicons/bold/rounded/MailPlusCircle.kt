package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailPlusCircle: ImageVector? = null

val Icons.Br.MailPlusCircle: ImageVector
    get() = _MailPlusCircle ?: UXIcon(name = "MailPlusCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 14.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 8.5f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.96f, 0f, -1.78f, 0.55f, -2.2f, 1.34f)
            lineToRelative(6.93f, 6.93f)
            curveToRelative(0.94f, 0.94f, 2.59f, 0.94f, 3.53f, 0f)
            lineToRelative(0.33f, -0.33f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.58f, 2.12f, 0.0f)
            curveToRelative(0.58f, 0.59f, 0.58f, 1.54f, -0.0f, 2.12f)
            lineToRelative(-0.33f, 0.33f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
            lineTo(3f, 11.28f)
            verticalLineToRelative(7.22f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12f, 6f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            close()
            moveTo(14f, 6f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            lineTo(19f, 3f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            close()
        }
    }.also { _MailPlusCircle = it }
