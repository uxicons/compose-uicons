package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SushiRoll: ImageVector? = null

val Icons.Rr.SushiRoll: ImageVector
    get() = _SushiRoll ?: UXIcon(name = "SushiRoll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                curveToRelative(0f, -3.65f, -5.27f, -6.5f, -12f, -6.5f)
                reflectiveCurveTo(0f, 2.85f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 3.77f, 5.05f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.73f, 12f, -6.5f)
                lineTo(24f, 6.5f)
                close()
                moveTo(12f, 2f)
                curveToRelative(5.89f, 0f, 10f, 2.37f, 10f, 4.5f)
                reflectiveCurveToRelative(-4.11f, 4.5f, -10f, 4.5f)
                reflectiveCurveTo(2f, 8.63f, 2f, 6.5f)
                reflectiveCurveTo(6.11f, 2f, 12f, 2f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -2.02f, -10f, -4.5f)
                verticalLineToRelative(-7.36f)
                curveToRelative(2.13f, 1.74f, 5.78f, 2.86f, 10f, 2.86f)
                reflectiveCurveToRelative(7.87f, -1.12f, 10f, -2.86f)
                verticalLineToRelative(7.36f)
                curveToRelative(0f, 2.48f, -4.49f, 4.5f, -10f, 4.5f)
                close()
                moveTo(5.29f, 7.14f)
                curveToRelative(-0.39f, -0.29f, -0.39f, -0.98f, 0f, -1.27f)
                curveToRelative(1.14f, -0.85f, 3.44f, -1.86f, 6.71f, -1.86f)
                reflectiveCurveToRelative(5.57f, 1.01f, 6.71f, 1.86f)
                curveToRelative(0.39f, 0.29f, 0.39f, 0.98f, 0f, 1.27f)
                curveToRelative(-1.14f, 0.85f, -3.44f, 1.86f, -6.71f, 1.86f)
                reflectiveCurveToRelative(-5.57f, -1.01f, -6.71f, -1.86f)
                close()
            }
        }.also { _SushiRoll = it}
