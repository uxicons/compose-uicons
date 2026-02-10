package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaUpAlt: ImageVector? = null

val Icons.Bs.SortAlphaUpAlt: ImageVector
    get() = _SortAlphaUpAlt ?: UXIcon(name = "SortAlphaUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 3f)
                horizontalLineToRelative(4.13f)
                lineToRelative(-4.13f, 4.96f)
                verticalLineToRelative(3.04f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(4.13f, -4.96f)
                lineTo(23f, 0f)
                close()
                moveTo(23f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(20.33f, 16.83f)
                curveToRelative(0f, -0.74f, -0.6f, -1.33f, -1.33f, -1.33f)
                reflectiveCurveToRelative(-1.33f, 0.6f, -1.33f, 1.33f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(2.67f)
                verticalLineToRelative(-2.67f)
                close()
                moveTo(10.9f, 7.6f)
                lineToRelative(-2.9f, -2.9f)
                lineTo(8f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 4.71f)
                lineToRelative(-2.9f, 2.9f)
                lineTo(-0.02f, 5.48f)
                lineTo(4.73f, 0.73f)
                curveTo(5.22f, 0.24f, 5.86f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(1.28f, 0.24f, 1.77f, 0.73f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
        }.also { _SortAlphaUpAlt = it}
