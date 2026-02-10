package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwoThirty: ImageVector? = null

val Icons.Br.ClockTwoThirty: ImageVector
    get() = _ClockTwoThirty ?: UXIcon(name = "ClockTwoThirty") {
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
            verticalLineToRelative(-4.63f)
            lineToRelative(2.71f, -1.57f)
            curveToRelative(0.72f, -0.41f, 0.96f, -1.33f, 0.55f, -2.05f)
            reflectiveCurveToRelative(-1.33f, -0.96f, -2.05f, -0.55f)
            lineToRelative(-3.46f, 2f)
            curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _ClockTwoThirty = it }
