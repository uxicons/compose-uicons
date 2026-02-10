package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Sr.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                curveToRelative(-0.99f, 0f, -1.93f, 0.36f, -2.67f, 1.02f)
                curveToRelative(-0.41f, 0.37f, -0.45f, 1f, -0.08f, 1.41f)
                curveToRelative(0.37f, 0.41f, 1f, 0.45f, 1.41f, 0.08f)
                curveToRelative(0.37f, -0.33f, 0.84f, -0.51f, 1.33f, -0.51f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(19f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(5.71f, 3.71f)
                curveToRelative(0f, -0.73f, 0.77f, -2.15f, 1.41f, -3.21f)
                curveToRelative(0.4f, -0.66f, 1.36f, -0.66f, 1.76f, 0f)
                curveToRelative(0.65f, 1.06f, 1.41f, 2.48f, 1.41f, 3.21f)
                curveToRelative(0f, 1.26f, -1.03f, 2.29f, -2.29f, 2.29f)
                reflectiveCurveToRelative(-2.29f, -1.03f, -2.29f, -2.29f)
                close()
            }
        }.also { _CandleHolder = it}
