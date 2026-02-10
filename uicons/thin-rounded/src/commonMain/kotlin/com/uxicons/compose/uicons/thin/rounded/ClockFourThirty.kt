package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFourThirty: ImageVector? = null

val Icons.Tr.ClockFourThirty: ImageVector
    get() = _ClockFourThirty ?: UXIcon(name = "ClockFourThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(12f, 18.5f)
                verticalLineToRelative(-6.1f)
                lineToRelative(3.23f, 2.02f)
                curveToRelative(0.23f, 0.15f, 0.54f, 0.08f, 0.69f, -0.16f)
                reflectiveCurveToRelative(0.07f, -0.54f, -0.16f, -0.69f)
                lineToRelative(-4f, -2.5f)
                curveToRelative(-0.15f, -0.1f, -0.35f, -0.1f, -0.51f, -0.01f)
                curveToRelative(-0.16f, 0.09f, -0.26f, 0.26f, -0.26f, 0.44f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _ClockFourThirty = it}
