package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOneThirty: ImageVector? = null

val Icons.Br.ClockOneThirty: ImageVector
    get() = _ClockOneThirty ?: UXIcon(name = "ClockOneThirty") {
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
            moveTo(13f, 17.5f)
            verticalLineToRelative(-5.55f)
            lineToRelative(1.75f, -2.62f)
            curveToRelative(0.46f, -0.69f, 0.27f, -1.62f, -0.42f, -2.08f)
            curveToRelative(-0.69f, -0.46f, -1.62f, -0.27f, -2.08f, 0.42f)
            lineToRelative(-2f, 3f)
            curveToRelative(-0.16f, 0.25f, -0.25f, 0.54f, -0.25f, 0.83f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _ClockOneThirty = it }
