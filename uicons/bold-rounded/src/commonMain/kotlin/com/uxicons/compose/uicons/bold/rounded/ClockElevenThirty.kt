package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockElevenThirty: ImageVector? = null

val Icons.Br.ClockElevenThirty: ImageVector
    get() = _ClockElevenThirty ?: UXIcon(name = "ClockElevenThirty") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            reflectiveCurveTo(16.96f, 3f, 12f, 3f)
            close()
            moveTo(14f, 17.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.3f, -0.09f, -0.58f, -0.25f, -0.83f)
            lineToRelative(-2f, -3f)
            curveToRelative(-0.46f, -0.69f, -1.39f, -0.88f, -2.08f, -0.42f)
            curveToRelative(-0.69f, 0.46f, -0.88f, 1.39f, -0.42f, 2.08f)
            lineToRelative(1.75f, 2.62f)
            verticalLineToRelative(5.55f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _ClockElevenThirty = it }
