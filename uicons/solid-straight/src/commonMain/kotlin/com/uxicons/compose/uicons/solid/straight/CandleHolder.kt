package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Ss.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 4f)
                curveToRelative(0f, -1.1f, 2f, -4f, 2f, -4f)
                curveToRelative(0f, 0f, 2f, 2.9f, 2f, 4f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(24f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.18f, -1.33f, 0.51f)
                lineToRelative(-1.33f, -1.49f)
                curveToRelative(0.73f, -0.66f, 1.68f, -1.02f, 2.67f, -1.02f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _CandleHolder = it}
