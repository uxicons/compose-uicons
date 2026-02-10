package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Sc.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                reflectiveCurveToRelative(2.69f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.69f, 9f, -9f)
                reflectiveCurveToRelative(-2.69f, -9f, -9f, -9f)
                close()
                moveTo(13f, 10f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(20.49f, 18.03f)
                curveToRelative(-0.2f, 1.77f, -0.38f, 3.01f, -0.39f, 3.12f)
                curveToRelative(-0.06f, 0.39f, -0.34f, 0.71f, -0.72f, 0.82f)
                curveToRelative(-0.15f, 0.04f, -3.73f, 1.04f, -7.38f, 1.04f)
                reflectiveCurveToRelative(-7.23f, -0.99f, -7.38f, -1.04f)
                curveToRelative(-0.38f, -0.11f, -0.66f, -0.43f, -0.72f, -0.82f)
                curveToRelative(-0.02f, -0.11f, -0.2f, -1.34f, -0.39f, -3.12f)
                curveToRelative(1.82f, 1.98f, 4.63f, 2.97f, 8.49f, 2.97f)
                reflectiveCurveToRelative(6.67f, -0.99f, 8.49f, -2.97f)
                close()
            }
        }.also { _ClockDesk = it}
