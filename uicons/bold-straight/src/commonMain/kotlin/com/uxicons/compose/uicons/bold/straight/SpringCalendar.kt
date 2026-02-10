package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpringCalendar: ImageVector? = null

val Icons.Bs.SpringCalendar: ImageVector
    get() = _SpringCalendar ?: UXIcon(name = "SpringCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(8.97f)
                curveToRelative(-0.17f, 0.13f, -1.73f, 1.41f, -1.73f, 2.97f)
                curveToRelative(0f, 0.05f, 0.01f, 0.1f, 0.01f, 0.15f)
                curveToRelative(-1.42f, -0.78f, -3.41f, 0.03f, -3.41f, 0.03f)
                curveToRelative(0f, 0f, 0.22f, 1.87f, 1.37f, 2.82f)
                curveToRelative(-1.15f, 0.95f, -1.37f, 2.82f, -1.37f, 2.82f)
                curveToRelative(0f, 0f, 1.99f, 0.8f, 3.41f, 0.03f)
                curveToRelative(-0.0f, 0.05f, -0.01f, 0.1f, -0.01f, 0.15f)
                curveToRelative(0f, 1.66f, 1.76f, 3f, 1.76f, 3f)
                curveToRelative(0f, 0f, 1.76f, -1.34f, 1.76f, -3f)
                curveToRelative(0f, -0.04f, -0.01f, -0.09f, -0.01f, -0.13f)
                curveToRelative(1.42f, 0.77f, 3.4f, -0.03f, 3.4f, -0.03f)
                curveToRelative(0f, 0f, -0.22f, -1.88f, -1.38f, -2.83f)
                curveToRelative(1.16f, -0.95f, 1.38f, -2.83f, 1.38f, -2.83f)
                curveToRelative(0f, 0f, -1.99f, -0.8f, -3.41f, -0.03f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f)
                curveToRelative(0f, -1.57f, -1.57f, -2.84f, -1.73f, -2.97f)
                horizontalLineToRelative(8.97f)
                verticalLineToRelative(12f)
                lineTo(3f, 21f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _SpringCalendar = it}
