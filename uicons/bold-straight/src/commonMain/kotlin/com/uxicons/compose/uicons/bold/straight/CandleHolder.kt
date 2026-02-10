package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Bs.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 4f)
                curveToRelative(0f, -1.1f, 2f, -4f, 2f, -4f)
                curveToRelative(0f, 0f, 2f, 2.9f, 2f, 4f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(24f, 19.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.37f, 0f, -0.72f, 0.14f, -1f, 0.38f)
                lineToRelative(-2.0f, -2.23f)
                curveToRelative(0.83f, -0.74f, 1.89f, -1.15f, 3f, -1.15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(5f, 21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                close()
            }
        }.also { _CandleHolder = it}
