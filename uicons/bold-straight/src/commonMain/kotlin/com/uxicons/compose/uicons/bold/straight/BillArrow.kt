package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BillArrow: ImageVector? = null

val Icons.Bs.BillArrow: ImageVector
    get() = _BillArrow ?: UXIcon(name = "BillArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                verticalLineToRelative(14.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 6.05f)
                curveToRelative(1.69f, 0.24f, 3f, 1.69f, 3f, 3.45f)
                close()
                moveTo(18.5f, 17f)
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
                moveTo(5.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9f, 15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
                moveTo(5.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16f, 9.0f)
                lineToRelative(3f, 0.01f)
                lineToRelative(0.01f, -4.98f)
                horizontalLineToRelative(2.49f)
                lineToRelative(-3.16f, -3.65f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(2.51f)
                lineToRelative(-0.01f, 4.98f)
                close()
            }
        }.also { _BillArrow = it}
