package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarHeart: ImageVector? = null

val Icons.Br.CalendarHeart: ImageVector
    get() = _CalendarHeart ?: UXIcon(name = "CalendarHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.45f, 13.47f)
            curveToRelative(0f, 1.84f, -2.31f, 4.11f, -3.63f, 5.2f)
            curveToRelative(-0.53f, 0.44f, -1.29f, 0.44f, -1.82f, 0f)
            curveToRelative(-1.31f, -1.08f, -3.55f, -3.35f, -3.55f, -5.2f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            close()
            moveTo(24f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 7.5f)
            curveTo(0f, 4.47f, 2.47f, 2f, 5.5f, 2f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 18.5f)
            verticalLineToRelative(-9.5f)
            lineTo(3f, 9f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _CalendarHeart = it }
