package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CashRegister: ImageVector? = null

val Icons.Bs.CashRegister: ImageVector
    get() = _CashRegister ?: UXIcon(name = "CashRegister") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 9f)
                lineTo(8f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(13f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(3f)
                lineTo(5f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                lineTo(24f, 24f)
                lineTo(24f, 12.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 12f)
                lineTo(20.5f, 12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                lineTo(3f, 19f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(5f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.5f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _CashRegister = it}
