package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeasuringTape: ImageVector? = null

val Icons.Br.MeasuringTape: ImageVector
    get() = _MeasuringTape ?: UXIcon(name = "MeasuringTape") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7f, 7f)
            curveToRelative(0f, -0.55f, 1.12f, -1f, 2.5f, -1f)
            reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1f)
            reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
            reflectiveCurveToRelative(-2.5f, -0.45f, -2.5f, -1f)
            close()
            moveTo(24f, 14.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-5.33f, 0f, -9.5f, -2.64f, -9.5f, -6f)
            lineTo(0f, 7f)
            curveTo(0f, 3.64f, 4.17f, 1f, 9.5f, 1f)
            reflectiveCurveToRelative(9.5f, 2.64f, 9.5f, 6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(3f, 7f)
            curveToRelative(0f, 1.42f, 2.78f, 3f, 6.5f, 3f)
            reflectiveCurveToRelative(6.5f, -1.58f, 6.5f, -3f)
            reflectiveCurveToRelative(-2.78f, -3f, -6.5f, -3f)
            reflectiveCurveToRelative(-6.5f, 1.58f, -6.5f, 3f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-2.54f, 0f, -4.81f, -0.6f, -6.5f, -1.6f)
            verticalLineToRelative(5.6f)
            curveToRelative(0f, 0.92f, 1.17f, 1.9f, 3f, 2.48f)
            verticalLineToRelative(-1.98f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.49f)
            curveToRelative(0.17f, 0.01f, 0.33f, 0.01f, 0.5f, 0.01f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.also { _MeasuringTape = it }
