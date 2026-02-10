package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UkCountryCode: ImageVector? = null

val Icons.Bs.UkCountryCode: ImageVector
    get() = _UkCountryCode ?: UXIcon(name = "UkCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 3f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(9.5f, 8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 1.27f, -1.03f, 2.3f, -2.3f, 2.3f)
                reflectiveCurveToRelative(-2.3f, -1.03f, -2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 0.39f, 0.31f, 0.7f, 0.7f, 0.7f)
                reflectiveCurveToRelative(0.7f, -0.31f, 0.7f, -0.7f)
                close()
                moveTo(17.5f, 8f)
                lineTo(16f, 12f)
                lineTo(17.5f, 16f)
                horizontalLineToRelative(-1.74f)
                lineToRelative(-1.17f, -3f)
                horizontalLineToRelative(-0.48f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.48f)
                lineToRelative(1.17f, -3f)
                close()
            }
        }.also { _UkCountryCode = it}
