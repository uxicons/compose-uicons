package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagsShopping: ImageVector? = null

val Icons.Rs.BagsShopping: ImageVector
    get() = _BagsShopping ?: UXIcon(name = "BagsShopping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                lineTo(19f, 4f)
                horizontalLineToRelative(-5.05f)
                curveToRelative(-0.25f, -2.24f, -2.14f, -4f, -4.45f, -4f)
                reflectiveCurveTo(5.3f, 1.76f, 5.05f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 10f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(9.5f, 2f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                lineTo(7.05f, 4f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                close()
                moveTo(3f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(6f, 10f)
                verticalLineToRelative(7f)
                lineTo(3f, 17f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(9f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(8f, 12f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(9f)
                close()
                moveTo(11f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
            }
        }.also { _BagsShopping = it}
