package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HospitalSymbol: ImageVector? = null

val Icons.Rs.HospitalSymbol: ImageVector
    get() = _HospitalSymbol ?: UXIcon(name = "HospitalSymbol") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
            }
        }.also { _HospitalSymbol = it}
