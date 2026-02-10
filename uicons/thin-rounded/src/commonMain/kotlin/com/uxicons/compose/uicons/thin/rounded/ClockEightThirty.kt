package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEightThirty: ImageVector? = null

val Icons.Tr.ClockEightThirty: ImageVector
    get() = _ClockEightThirty ?: UXIcon(name = "ClockEightThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(13f, 11.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6.1f)
                lineToRelative(-3.23f, 2.02f)
                curveToRelative(-0.23f, 0.15f, -0.54f, 0.08f, -0.69f, -0.16f)
                curveToRelative(-0.15f, -0.23f, -0.07f, -0.54f, 0.16f, -0.69f)
                lineToRelative(4f, -2.5f)
                curveToRelative(0.15f, -0.1f, 0.35f, -0.1f, 0.51f, -0.01f)
                curveToRelative(0.16f, 0.09f, 0.26f, 0.26f, 0.26f, 0.44f)
                close()
            }
        }.also { _ClockEightThirty = it}
