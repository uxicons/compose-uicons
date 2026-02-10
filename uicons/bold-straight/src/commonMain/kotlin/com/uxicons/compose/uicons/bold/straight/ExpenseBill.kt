package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpenseBill: ImageVector? = null

val Icons.Bs.ExpenseBill: ImageVector
    get() = _ExpenseBill ?: UXIcon(name = "ExpenseBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveTo(18.5f, 17.06f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 17.06f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 9.44f)
                verticalLineToRelative(14.62f)
                lineTo(0f, 24.06f)
                verticalLineToRelative(-14.56f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineToRelative(7.0f, -0.03f)
                verticalLineToRelative(-1.95f)
                horizontalLineToRelative(-2.5f)
                lineTo(11.18f, 0.37f)
                curveToRelative(0.44f, -0.49f, 1.22f, -0.49f, 1.66f, 0f)
                lineToRelative(3.16f, 3.65f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1.94f)
                lineToRelative(6.99f, -0.03f)
                curveToRelative(1.94f, 0f, 3.51f, 1.57f, 3.51f, 3.5f)
                close()
                moveTo(21f, 9.44f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineToRelative(-17f, 0.06f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(11.56f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-11.62f)
                close()
            }
        }.also { _ExpenseBill = it}
