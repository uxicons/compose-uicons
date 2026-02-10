package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOneThirty: ImageVector? = null

val Icons.Rr.ClockOneThirty: ImageVector
    get() = _ClockOneThirty ?: UXIcon(name = "ClockOneThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(13f, 18f)
                verticalLineToRelative(-5.73f)
                lineToRelative(1.87f, -3.23f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.37f, -1.37f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.37f, 0.37f)
                lineToRelative(-2f, 3.46f)
                curveToRelative(-0.09f, 0.15f, -0.13f, 0.32f, -0.13f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ClockOneThirty = it}
