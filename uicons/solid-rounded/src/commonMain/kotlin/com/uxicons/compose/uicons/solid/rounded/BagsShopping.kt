package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagsShopping: ImageVector? = null

val Icons.Sr.BagsShopping: ImageVector
    get() = _BagsShopping ?: UXIcon(name = "BagsShopping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                lineTo(10f, 11f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(19f, 16f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(19f, 9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(5f, 2.02f, 5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                curveTo(1.79f, 5f, 0f, 6.79f, 0f, 9f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(-3.9f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(9f)
                close()
                moveTo(7f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(7f, 5f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.also { _BagsShopping = it}
