package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GermanyCountryCode: ImageVector? = null

val Icons.Bs.GermanyCountryCode: ImageVector
    get() = _GermanyCountryCode ?: UXIcon(name = "GermanyCountryCode") {
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
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(13f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(1.55f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(9.7f, 8f)
                horizontalLineToRelative(-2.7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.7f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(10.4f, 13.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-1.1f, 0f, -1.1f, 0f)
                verticalLineToRelative(-4.8f)
                reflectiveCurveToRelative(0.71f, 0f, 1.1f, 0f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
            }
        }.also { _GermanyCountryCode = it}
