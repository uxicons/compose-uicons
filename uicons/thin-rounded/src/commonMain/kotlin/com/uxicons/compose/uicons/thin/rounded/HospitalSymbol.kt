package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HospitalSymbol: ImageVector? = null

val Icons.Tr.HospitalSymbol: ImageVector
    get() = _HospitalSymbol ?: UXIcon(name = "HospitalSymbol") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 0f)
                horizontalLineToRelative(-1f)
                curveTo(5.16f, 0f, 0f, 5.16f, 0f, 11.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 6.34f, 5.16f, 11.5f, 11.5f, 11.5f)
                horizontalLineToRelative(1f)
                curveToRelative(6.34f, 0f, 11.5f, -5.16f, 11.5f, -11.5f)
                verticalLineToRelative(-1f)
                curveTo(24f, 5.16f, 18.84f, 0f, 12.5f, 0f)
                close()
                moveTo(23f, 12.5f)
                curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-5.79f, 0f, -10.5f, -4.71f, -10.5f, -10.5f)
                verticalLineToRelative(-1f)
                curveTo(1f, 5.71f, 5.71f, 1f, 11.5f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(5.79f, 0f, 10.5f, 4.71f, 10.5f, 10.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(7f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _HospitalSymbol = it}
