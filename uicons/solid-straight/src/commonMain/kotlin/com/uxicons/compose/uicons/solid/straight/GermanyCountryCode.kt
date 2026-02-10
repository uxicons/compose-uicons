package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GermanyCountryCode: ImageVector? = null

val Icons.Ss.GermanyCountryCode: ImageVector
    get() = _GermanyCountryCode ?: UXIcon(name = "GermanyCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.4f, 10.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-1.1f, 0f, -1.1f, 0f)
                verticalLineToRelative(-4.8f)
                reflectiveCurveToRelative(0.71f, 0f, 1.1f, 0f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(12f, 10.3f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.7f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.55f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.6f)
                close()
            }
        }.also { _GermanyCountryCode = it}
