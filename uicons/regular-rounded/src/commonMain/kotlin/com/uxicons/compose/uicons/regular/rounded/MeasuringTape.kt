package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeasuringTape: ImageVector? = null

val Icons.Rr.MeasuringTape: ImageVector
    get() = _MeasuringTape ?: UXIcon(name = "MeasuringTape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 7f)
                curveToRelative(0f, -0.55f, 1.12f, -1f, 2.5f, -1f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1f)
                reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
                reflectiveCurveToRelative(-2.5f, -0.45f, -2.5f, -1f)
                close()
                moveTo(24f, 15.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-10.12f)
                curveToRelative(-6.56f, 0f, -9.38f, -2.89f, -9.38f, -5.71f)
                lineTo(0f, 6.81f)
                curveToRelative(0f, -0.04f, 0.02f, -0.08f, 0.02f, -0.12f)
                curveTo(0.27f, 3.48f, 4.34f, 1f, 9.5f, 1f)
                curveToRelative(5.33f, 0f, 9.5f, 2.64f, 9.5f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(2f, 7f)
                curveToRelative(0f, 2.17f, 3.44f, 4f, 7.5f, 4f)
                reflectiveCurveToRelative(7.5f, -1.83f, 7.5f, -4f)
                reflectiveCurveToRelative(-3.44f, -4f, -7.5f, -4f)
                reflectiveCurveToRelative(-7.5f, 1.83f, -7.5f, 4f)
                close()
                moveTo(22f, 15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-3.08f, 0f, -5.78f, -0.89f, -7.5f, -2.28f)
                verticalLineToRelative(6.57f)
                curveToRelative(0f, 1.41f, 1.97f, 2.96f, 5f, 3.5f)
                verticalLineToRelative(-3.79f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.99f)
                curveToRelative(0.13f, 0.0f, 0.25f, 0.01f, 0.38f, 0.01f)
                horizontalLineToRelative(2.62f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _MeasuringTape = it}
