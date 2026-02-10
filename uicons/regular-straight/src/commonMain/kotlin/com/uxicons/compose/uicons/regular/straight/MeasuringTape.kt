package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeasuringTape: ImageVector? = null

val Icons.Rs.MeasuringTape: ImageVector
    get() = _MeasuringTape ?: UXIcon(name = "MeasuringTape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 7f)
                curveToRelative(0f, -0.55f, 1.12f, -1f, 2.5f, -1f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1f)
                reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
                reflectiveCurveToRelative(-2.5f, -0.45f, -2.5f, -1f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-14.62f)
                curveToRelative(-5.26f, 0f, -9.38f, -2.51f, -9.38f, -5.71f)
                lineTo(0f, 6.81f)
                horizontalLineToRelative(0.01f)
                curveTo(0.17f, 3.54f, 4.28f, 1f, 9.5f, 1f)
                curveToRelative(5.33f, 0f, 9.5f, 2.64f, 9.5f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(2f, 7f)
                curveToRelative(0f, 2.17f, 3.44f, 4f, 7.5f, 4f)
                reflectiveCurveToRelative(7.5f, -1.83f, 7.5f, -4f)
                reflectiveCurveToRelative(-3.44f, -4f, -7.5f, -4f)
                reflectiveCurveToRelative(-7.5f, 1.83f, -7.5f, 4f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(-12.5f)
                curveToRelative(-3.08f, 0f, -5.78f, -0.89f, -7.5f, -2.28f)
                verticalLineToRelative(6.57f)
                curveToRelative(0f, 1.41f, 1.97f, 2.96f, 5f, 3.5f)
                verticalLineToRelative(-4.79f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.99f)
                curveToRelative(0.13f, 0.0f, 0.25f, 0.01f, 0.38f, 0.01f)
                horizontalLineToRelative(2.62f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _MeasuringTape = it}
