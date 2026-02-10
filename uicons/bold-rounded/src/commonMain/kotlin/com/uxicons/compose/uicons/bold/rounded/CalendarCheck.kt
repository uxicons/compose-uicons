package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCheck: ImageVector? = null

val Icons.Br.CalendarCheck: ImageVector
    get() = _CalendarCheck ?: UXIcon(name = "CalendarCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.5f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 9f)
            lineTo(21f, 9f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(17.84f, 11.97f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.07f, 2.12f)
            lineToRelative(-4.18f, 3.91f)
            curveToRelative(-0.63f, 0.63f, -1.5f, 0.99f, -2.44f, 0.99f)
            reflectiveCurveToRelative(-1.81f, -0.36f, -2.48f, -1.03f)
            lineToRelative(-2.48f, -2.4f)
            curveToRelative(-0.6f, -0.58f, -0.61f, -1.52f, -0.04f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.61f, 2.12f, -0.04f)
            lineToRelative(2.5f, 2.41f)
            curveToRelative(0.15f, 0.14f, 0.29f, 0.16f, 0.37f, 0.16f)
            reflectiveCurveToRelative(0.23f, -0.02f, 0.35f, -0.15f)
            lineToRelative(4.21f, -3.95f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.07f)
            close()
        }
    }.also { _CalendarCheck = it }
