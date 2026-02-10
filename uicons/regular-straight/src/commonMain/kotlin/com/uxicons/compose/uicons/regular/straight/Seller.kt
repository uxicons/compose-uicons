package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seller: ImageVector? = null

val Icons.Rs.Seller: ImageVector
    get() = _Seller ?: UXIcon(name = "Seller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(4.69f)
                lineToRelative(-0.92f, 2f)
                horizontalLineToRelative(-3.77f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(24f, 16f)
                curveToRelative(0f, 1.1f, -0.83f, 2f, -1.86f, 2f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-1.03f, 0f, -1.86f, -0.9f, -1.86f, -2f)
                curveToRelative(0f, 1.1f, -0.83f, 2f, -1.86f, 2f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-1.03f, 0f, -1.86f, -0.9f, -1.86f, -2f)
                curveToRelative(0f, 1.1f, -0.83f, 2f, -1.86f, 2f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-1.03f, 0f, -1.86f, -0.9f, -1.86f, -2f)
                lineToRelative(1.24f, -3f)
                horizontalLineToRelative(10.52f)
                lineToRelative(1.24f, 3f)
                close()
            }
        }.also { _Seller = it}
