package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOne: ImageVector? = null

val Icons.Rr.ClockOne: ImageVector
    get() = _ClockOne ?: UXIcon(name = "ClockOne") {
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
                moveTo(12.79f, 12.61f)
                lineToRelative(2.44f, -3.17f)
                curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.18f, -1.4f)
                curveToRelative(-0.44f, -0.34f, -1.06f, -0.25f, -1.4f, 0.18f)
                lineToRelative(-0.64f, 0.84f)
                verticalLineToRelative(-3.06f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.43f, 0.27f, 0.81f, 0.68f, 0.95f)
                curveToRelative(0.1f, 0.04f, 0.21f, 0.05f, 0.32f, 0.05f)
                curveToRelative(0.3f, 0f, 0.6f, -0.14f, 0.79f, -0.39f)
                close()
            }
        }.also { _ClockOne = it}
