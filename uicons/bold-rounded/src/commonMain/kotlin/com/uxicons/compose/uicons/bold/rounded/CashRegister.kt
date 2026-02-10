package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CashRegister: ImageVector? = null

val Icons.Br.CashRegister: ImageVector
    get() = _CashRegister ?: UXIcon(name = "CashRegister") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 9f)
            lineTo(8f, 9f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            lineTo(3f, 0f)
            curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.02f)
            curveToRelative(-2.8f, 0.25f, -5f, 2.61f, -5f, 5.48f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(3f, 14.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.17f, -0.02f, 0.34f, -0.05f, 0.5f)
            lineTo(3.05f, 19f)
            curveToRelative(-0.03f, -0.16f, -0.05f, -0.33f, -0.05f, -0.5f)
            verticalLineToRelative(-4f)
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
    }.also { _CashRegister = it }
