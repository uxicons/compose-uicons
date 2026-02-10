package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SushiRoll: ImageVector? = null

val Icons.Bs.SushiRoll: ImageVector
    get() = _SushiRoll ?: UXIcon(name = "SushiRoll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.16f, 0f, 0f, 3.01f, 0f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 3.99f, 5.16f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.01f, 12f, -7f)
                lineTo(24f, 7f)
                curveToRelative(0f, -3.99f, -5.16f, -7f, -12f, -7f)
                close()
                moveTo(12f, 3f)
                curveToRelative(5.15f, 0f, 9f, 2.11f, 9f, 4f)
                reflectiveCurveToRelative(-3.85f, 4f, -9f, 4f)
                reflectiveCurveTo(3f, 8.89f, 3f, 7f)
                reflectiveCurveTo(6.85f, 3f, 12f, 3f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.15f, 0f, -9f, -2.11f, -9f, -4f)
                verticalLineToRelative(-5.27f)
                curveToRelative(2.17f, 1.41f, 5.34f, 2.27f, 9f, 2.27f)
                reflectiveCurveToRelative(6.83f, -0.86f, 9f, -2.27f)
                verticalLineToRelative(5.27f)
                curveToRelative(0f, 1.89f, -3.85f, 4f, -9f, 4f)
                close()
                moveTo(5.71f, 6.49f)
                curveToRelative(1.07f, -0.68f, 3.23f, -1.49f, 6.29f, -1.49f)
                reflectiveCurveToRelative(5.22f, 0.81f, 6.29f, 1.49f)
                curveToRelative(0.36f, 0.23f, 0.36f, 0.79f, 0f, 1.02f)
                curveToRelative(-1.07f, 0.68f, -3.23f, 1.49f, -6.29f, 1.49f)
                reflectiveCurveToRelative(-5.22f, -0.81f, -6.29f, -1.49f)
                curveToRelative(-0.36f, -0.23f, -0.36f, -0.79f, 0f, -1.02f)
                close()
            }
        }.also { _SushiRoll = it}
