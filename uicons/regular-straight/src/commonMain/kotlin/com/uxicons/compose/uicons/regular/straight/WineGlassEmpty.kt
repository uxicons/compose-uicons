package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassEmpty: ImageVector? = null

val Icons.Rs.WineGlassEmpty: ImageVector
    get() = _WineGlassEmpty ?: UXIcon(name = "WineGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 0f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 4.07f, 3.06f, 7.44f, 7f, 7.93f)
                verticalLineToRelative(4.07f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4.07f)
                curveToRelative(3.94f, -0.49f, 7f, -3.86f, 7f, -7.93f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                lineTo(6f, 2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _WineGlassEmpty = it}
