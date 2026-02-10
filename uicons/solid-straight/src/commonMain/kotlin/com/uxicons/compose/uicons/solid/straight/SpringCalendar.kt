package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpringCalendar: ImageVector? = null

val Icons.Ss.SpringCalendar: ImageVector
    get() = _SpringCalendar ?: UXIcon(name = "SpringCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(24f)
                close()
                moveTo(15.78f, 17.01f)
                curveToRelative(1.16f, -0.95f, 1.38f, -2.83f, 1.38f, -2.83f)
                curveToRelative(0f, 0f, -1.99f, -0.8f, -3.41f, -0.03f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f)
                curveToRelative(0f, -1.66f, -1.76f, -3f, -1.76f, -3f)
                curveToRelative(0f, 0f, -1.76f, 1.34f, -1.76f, 3f)
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
                close()
            }
        }.also { _SpringCalendar = it}
