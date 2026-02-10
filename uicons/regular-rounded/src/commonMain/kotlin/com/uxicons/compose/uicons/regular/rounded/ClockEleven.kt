package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEleven: ImageVector? = null

val Icons.Rr.ClockEleven: ImageVector
    get() = _ClockEleven ?: UXIcon(name = "ClockEleven") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(12.32f, 12.95f)
                curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f)
                lineTo(13f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.06f)
                lineToRelative(-0.64f, -0.84f)
                curveToRelative(-0.34f, -0.44f, -0.96f, -0.52f, -1.4f, -0.18f)
                curveToRelative(-0.44f, 0.34f, -0.52f, 0.96f, -0.18f, 1.4f)
                lineToRelative(2.44f, 3.17f)
                curveToRelative(0.19f, 0.25f, 0.49f, 0.39f, 0.79f, 0.39f)
                curveToRelative(0.11f, 0f, 0.22f, -0.02f, 0.32f, -0.05f)
                close()
            }
        }.also { _ClockEleven = it}
