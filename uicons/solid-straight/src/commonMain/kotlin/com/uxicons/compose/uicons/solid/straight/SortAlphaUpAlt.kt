package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaUpAlt: ImageVector? = null

val Icons.Ss.SortAlphaUpAlt: ImageVector
    get() = _SortAlphaUpAlt ?: UXIcon(name = "SortAlphaUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 6.5f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(7f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 3f)
                lineTo(1.5f, 6.5f)
                lineTo(0.09f, 5.09f)
                lineTo(4.59f, 0.59f)
                curveTo(4.98f, 0.2f, 5.49f, 0f, 6f, 0f)
                reflectiveCurveToRelative(1.02f, 0.2f, 1.41f, 0.58f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                horizontalLineToRelative(4.7f)
                lineToRelative(-4.7f, 5.64f)
                verticalLineToRelative(2.36f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.7f)
                lineToRelative(4.7f, -5.64f)
                lineTo(22f, 0f)
                close()
                moveTo(22f, 17.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 19f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _SortAlphaUpAlt = it}
