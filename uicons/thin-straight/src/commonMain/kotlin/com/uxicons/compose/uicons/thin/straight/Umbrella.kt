package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Ts.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                curveToRelative(0f, -6.45f, -5.11f, -11.73f, -11.5f, -11.99f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.01f)
                curveTo(5.11f, 2.27f, 0f, 7.55f, 0f, 14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(6.25f)
                curveToRelative(0f, 0.96f, -0.79f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.79f, -1.75f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.25f)
                curveToRelative(0f, 1.52f, 1.23f, 2.75f, 2.75f, 2.75f)
                reflectiveCurveToRelative(2.75f, -1.23f, 2.75f, -2.75f)
                verticalLineToRelative(-6.25f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(1f, 14f)
                curveTo(1f, 7.93f, 5.93f, 3f, 12f, 3f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                lineTo(1f, 14f)
                close()
            }
        }.also { _Umbrella = it}
