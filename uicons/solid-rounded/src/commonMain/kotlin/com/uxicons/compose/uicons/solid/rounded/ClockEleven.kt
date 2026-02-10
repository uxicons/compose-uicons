package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEleven: ImageVector? = null

val Icons.Sr.ClockEleven: ImageVector
    get() = _ClockEleven ?: UXIcon(name = "ClockEleven") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.43f, -0.27f, 0.81f, -0.68f, 0.95f)
                curveToRelative(-0.1f, 0.04f, -0.21f, 0.05f, -0.32f, 0.05f)
                curveToRelative(-0.3f, 0f, -0.6f, -0.14f, -0.79f, -0.39f)
                lineToRelative(-2.44f, -3.17f)
                curveToRelative(-0.34f, -0.44f, -0.25f, -1.07f, 0.18f, -1.4f)
                curveToRelative(0.44f, -0.34f, 1.07f, -0.25f, 1.4f, 0.18f)
                lineToRelative(0.64f, 0.84f)
                verticalLineToRelative(-3.06f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClockEleven = it}
