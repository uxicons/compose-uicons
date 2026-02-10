package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snooze: ImageVector? = null

val Icons.Rs.Snooze: ImageVector
    get() = _Snooze ?: UXIcon(name = "Snooze") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.37f, 22f)
                horizontalLineToRelative(7.63f)
                verticalLineToRelative(2f)
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
                close()
                moveTo(19.66f, 20f)
                lineToRelative(3.92f, -4.53f)
                curveToRelative(0.41f, -0.41f, 0.54f, -1.03f, 0.31f, -1.58f)
                reflectiveCurveToRelative(-0.75f, -0.89f, -1.34f, -0.89f)
                horizontalLineToRelative(-5.55f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.34f)
                lineToRelative(-3.92f, 4.53f)
                curveToRelative(-0.41f, 0.41f, -0.54f, 1.03f, -0.31f, 1.58f)
                reflectiveCurveToRelative(0.75f, 0.89f, 1.34f, 0.89f)
                horizontalLineToRelative(5.55f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.34f)
                close()
                moveTo(19f, 8f)
                horizontalLineToRelative(-5.38f)
                lineToRelative(4.94f, -5.42f)
                curveToRelative(0.43f, -0.43f, 0.56f, -1.08f, 0.33f, -1.65f)
                curveToRelative(-0.23f, -0.57f, -0.78f, -0.93f, -1.4f, -0.93f)
                horizontalLineToRelative(-6.49f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.38f)
                lineToRelative(-4.94f, 5.42f)
                curveToRelative(-0.43f, 0.43f, -0.56f, 1.08f, -0.33f, 1.65f)
                curveToRelative(0.23f, 0.57f, 0.78f, 0.93f, 1.4f, 0.93f)
                horizontalLineToRelative(6.49f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Snooze = it}
