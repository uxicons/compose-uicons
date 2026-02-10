package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snooze: ImageVector? = null

val Icons.Ss.Snooze: ImageVector
    get() = _Snooze ?: UXIcon(name = "Snooze") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 24f)
                lineTo(1.7f, 24f)
                curveToRelative(-0.69f, 0f, -1.31f, -0.41f, -1.57f, -1.05f)
                reflectiveCurveToRelative(-0.12f, -1.37f, 0.37f, -1.85f)
                lineToRelative(7.13f, -8.1f)
                lineTo(0f, 13.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.3f)
                curveToRelative(0.69f, 0f, 1.31f, 0.41f, 1.57f, 1.05f)
                reflectiveCurveToRelative(0.12f, 1.37f, -0.37f, 1.85f)
                lineToRelative(-7.13f, 8.1f)
                horizontalLineToRelative(7.63f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 22f)
                horizontalLineToRelative(-5.55f)
                curveToRelative(-0.59f, 0f, -1.11f, -0.35f, -1.34f, -0.89f)
                reflectiveCurveToRelative(-0.1f, -1.16f, 0.31f, -1.58f)
                lineToRelative(3.92f, -4.53f)
                horizontalLineToRelative(-4.34f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.55f)
                curveToRelative(0.59f, 0f, 1.11f, 0.35f, 1.34f, 0.89f)
                reflectiveCurveToRelative(0.1f, 1.16f, -0.31f, 1.58f)
                lineToRelative(-3.92f, 4.53f)
                horizontalLineToRelative(4.34f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-6.49f)
                curveToRelative(-0.61f, 0f, -1.16f, -0.37f, -1.4f, -0.93f)
                curveToRelative(-0.23f, -0.57f, -0.11f, -1.21f, 0.33f, -1.65f)
                lineToRelative(4.94f, -5.42f)
                horizontalLineToRelative(-5.38f)
                lineTo(11f, 0f)
                horizontalLineToRelative(6.49f)
                curveToRelative(0.61f, 0f, 1.16f, 0.37f, 1.4f, 0.93f)
                curveToRelative(0.23f, 0.57f, 0.11f, 1.21f, -0.33f, 1.65f)
                lineToRelative(-4.94f, 5.42f)
                horizontalLineToRelative(5.38f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Snooze = it}
