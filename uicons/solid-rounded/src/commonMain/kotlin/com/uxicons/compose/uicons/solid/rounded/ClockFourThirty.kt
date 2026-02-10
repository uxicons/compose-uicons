package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFourThirty: ImageVector? = null

val Icons.Sr.ClockFourThirty: ImageVector
    get() = _ClockFourThirty ?: UXIcon(name = "ClockFourThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.33f, 14.5f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f)
                lineToRelative(-1.96f, -1.13f)
                verticalLineToRelative(4.27f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.36f, 0.19f, -0.69f, 0.5f, -0.87f)
                reflectiveCurveToRelative(0.69f, -0.18f, 1f, 0f)
                lineToRelative(3.46f, 2f)
                curveToRelative(0.48f, 0.28f, 0.64f, 0.89f, 0.37f, 1.37f)
                close()
            }
        }.also { _ClockFourThirty = it}
