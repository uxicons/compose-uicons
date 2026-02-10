package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassEmpty: ImageVector? = null

val Icons.Bs.WineGlassEmpty: ImageVector
    get() = _WineGlassEmpty ?: UXIcon(name = "WineGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 0f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 3.9f, 2.8f, 7.15f, 6.5f, 7.85f)
                verticalLineToRelative(3.15f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.15f)
                curveToRelative(3.7f, -0.7f, 6.5f, -3.96f, 6.5f, -7.85f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                lineTo(7f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _WineGlassEmpty = it}
