package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeasuringTape: ImageVector? = null

val Icons.Sr.MeasuringTape: ImageVector
    get() = _MeasuringTape ?: UXIcon(name = "MeasuringTape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 10f)
                curveToRelative(5.25f, 0f, 9.5f, -2.02f, 9.5f, -4.5f)
                reflectiveCurveTo(14.75f, 1f, 9.5f, 1f)
                reflectiveCurveTo(0f, 3.02f, 0f, 5.5f)
                reflectiveCurveToRelative(4.25f, 4.5f, 9.5f, 4.5f)
                close()
                moveTo(9.5f, 4.5f)
                curveToRelative(1.38f, 0f, 2.5f, 0.45f, 2.5f, 1f)
                reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
                reflectiveCurveToRelative(-2.5f, -0.45f, -2.5f, -1f)
                reflectiveCurveToRelative(1.12f, -1f, 2.5f, -1f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.99f)
                curveToRelative(-5.08f, -0.12f, -9f, -2.58f, -9f, -5.7f)
                verticalLineToRelative(-7.98f)
                curveToRelative(2.02f, 1.67f, 5.41f, 2.7f, 9.5f, 2.7f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _MeasuringTape = it}
