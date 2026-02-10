package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagsShopping: ImageVector? = null

val Icons.Bs.BagsShopping: ImageVector
    get() = _BagsShopping ?: UXIcon(name = "BagsShopping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                lineTo(19f, 5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(5f, 2.02f, 5f, 4.5f)
                verticalLineToRelative(0.5f)
                lineTo(0f, 5f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(8f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(3.5f, 17f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(3f, 8f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                lineTo(5f, 10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(8.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _BagsShopping = it}
