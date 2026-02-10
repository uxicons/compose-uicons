package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockElevenThirty: ImageVector? = null

val Icons.Sr.ClockElevenThirty: ImageVector
    get() = _ClockElevenThirty ?: UXIcon(name = "ClockElevenThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.73f)
                lineToRelative(-1.87f, -3.23f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f)
                lineToRelative(2f, 3.46f)
                curveToRelative(0.09f, 0.15f, 0.13f, 0.32f, 0.13f, 0.5f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClockElevenThirty = it}
