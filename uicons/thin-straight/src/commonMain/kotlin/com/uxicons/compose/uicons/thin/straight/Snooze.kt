package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snooze: ImageVector? = null

val Icons.Ts.Snooze: ImageVector
    get() = _Snooze ?: UXIcon(name = "Snooze") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.27f, 23f)
                horizontalLineToRelative(8.73f)
                verticalLineToRelative(1f)
                lineTo(1.27f, 24f)
                curveToRelative(-0.51f, 0f, -0.97f, -0.31f, -1.17f, -0.78f)
                curveToRelative(-0.2f, -0.47f, -0.09f, -1.02f, 0.27f, -1.38f)
                lineToRelative(8.53f, -9.37f)
                curveToRelative(0.13f, -0.13f, 0.09f, -0.26f, 0.07f, -0.31f)
                curveToRelative(-0.02f, -0.05f, -0.09f, -0.16f, -0.24f, -0.16f)
                lineTo(0f, 12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.73f)
                curveToRelative(0.51f, 0f, 0.97f, 0.31f, 1.17f, 0.78f)
                curveToRelative(0.2f, 0.47f, 0.09f, 1.02f, -0.27f, 1.38f)
                lineTo(1.09f, 22.53f)
                curveToRelative(-0.13f, 0.13f, -0.09f, 0.26f, -0.07f, 0.31f)
                curveToRelative(0.02f, 0.05f, 0.09f, 0.16f, 0.24f, 0.16f)
                close()
                moveTo(23.71f, 14.72f)
                curveToRelative(0.29f, -0.29f, 0.38f, -0.72f, 0.22f, -1.1f)
                curveToRelative(-0.16f, -0.38f, -0.52f, -0.62f, -0.93f, -0.62f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                lineToRelative(5.99f, 0.03f)
                lineToRelative(-5.71f, 6.24f)
                curveToRelative(-0.29f, 0.29f, -0.38f, 0.72f, -0.22f, 1.1f)
                curveToRelative(0.16f, 0.38f, 0.52f, 0.62f, 0.93f, 0.62f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                lineToRelative(-5.99f, -0.03f)
                lineToRelative(5.71f, -6.24f)
                close()
                moveTo(19.0f, 9f)
                horizontalLineToRelative(-6.92f)
                lineToRelative(-0.04f, -0.14f)
                lineToRelative(6.65f, -7.03f)
                curveToRelative(0.31f, -0.31f, 0.4f, -0.77f, 0.23f, -1.17f)
                reflectiveCurveToRelative(-0.56f, -0.66f, -0.99f, -0.66f)
                horizontalLineToRelative(-6.92f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.92f)
                lineToRelative(0.04f, 0.14f)
                lineToRelative(-6.65f, 7.03f)
                curveToRelative(-0.31f, 0.31f, -0.4f, 0.77f, -0.23f, 1.17f)
                reflectiveCurveToRelative(0.56f, 0.66f, 0.99f, 0.66f)
                horizontalLineToRelative(6.92f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Snooze = it}
