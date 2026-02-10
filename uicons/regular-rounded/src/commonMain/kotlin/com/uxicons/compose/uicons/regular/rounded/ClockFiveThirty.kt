package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFiveThirty: ImageVector? = null

val Icons.Rr.ClockFiveThirty: ImageVector
    get() = _ClockFiveThirty ?: UXIcon(name = "ClockFiveThirty") {
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
                verticalLineToRelative(-3.06f)
                lineToRelative(0.64f, 0.84f)
                curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.18f)
                curveToRelative(0.44f, -0.34f, 0.52f, -0.96f, 0.18f, -1.4f)
                lineToRelative(-2.44f, -3.17f)
                curveToRelative(-0.26f, -0.34f, -0.71f, -0.48f, -1.11f, -0.34f)
                curveToRelative(-0.41f, 0.14f, -0.68f, 0.52f, -0.68f, 0.95f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ClockFiveThirty = it}
