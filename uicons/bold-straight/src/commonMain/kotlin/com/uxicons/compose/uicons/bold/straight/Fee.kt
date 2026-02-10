package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fee: ImageVector? = null

val Icons.Bs.Fee: ImageVector
    get() = _Fee ?: UXIcon(name = "Fee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20f, 7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(5.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(11f)
                reflectiveCurveToRelative(3.56f, 0f, 3.56f, 0f)
                lineToRelative(0.08f, -0.12f)
                curveToRelative(-1.35f, -0.35f, -2.38f, -1.47f, -2.58f, -2.88f)
                horizontalLineToRelative(-2.05f)
                reflectiveCurveToRelative(-7f, 0f, -7f, 0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(22.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 18f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.18f, 15f)
                lineToRelative(-5.83f, 9f)
                horizontalLineToRelative(3.47f)
                lineToRelative(5.83f, -9f)
                horizontalLineToRelative(-3.47f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _Fee = it}
