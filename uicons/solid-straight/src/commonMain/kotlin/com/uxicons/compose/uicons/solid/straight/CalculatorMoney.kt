package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalculatorMoney: ImageVector? = null

val Icons.Ss.CalculatorMoney: ImageVector
    get() = _CalculatorMoney ?: UXIcon(name = "CalculatorMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(7f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(5.14f)
                curveToRelative(0.63f, -0.09f, 1.3f, -0.14f, 2f, -0.14f)
                reflectiveCurveToRelative(1.37f, 0.05f, 2f, 0.14f)
                verticalLineToRelative(-4.14f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7.47f)
                curveToRelative(0.94f, 0.82f, 1.47f, 1.85f, 1.47f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.36f, -0.62f, 2.57f, -1.69f, 3.5f)
                horizontalLineToRelative(11.69f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0f, 1.66f, -2.69f, 3f, -6f, 3f)
                reflectiveCurveTo(0f, 14.66f, 0f, 13f)
                reflectiveCurveToRelative(2.69f, -3f, 6f, -3f)
                reflectiveCurveToRelative(6f, 1.34f, 6f, 3f)
                close()
                moveTo(12f, 18.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.0f, -2.58f, 3.5f, -6f, 3.5f)
                reflectiveCurveToRelative(-6f, -1.5f, -6f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 1.97f, 2.5f, 3.5f, 6f, 3.5f)
                reflectiveCurveToRelative(6f, -1.53f, 6f, -3.5f)
                close()
                moveTo(12f, 14.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.0f, -2.58f, 3.5f, -6f, 3.5f)
                reflectiveCurveToRelative(-6f, -1.5f, -6f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 1.97f, 2.5f, 3.5f, 6f, 3.5f)
                reflectiveCurveToRelative(6f, -1.53f, 6f, -3.5f)
                close()
            }
        }.also { _CalculatorMoney = it}
