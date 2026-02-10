package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassEmpty: ImageVector? = null

val Icons.Ts.WineGlassEmpty: ImageVector
    get() = _WineGlassEmpty ?: UXIcon(name = "WineGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 0f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 4.24f, 3.32f, 7.71f, 7.5f, 7.97f)
                verticalLineToRelative(5.03f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-5.03f)
                curveToRelative(4.18f, -0.26f, 7.5f, -3.73f, 7.5f, -7.97f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                lineTo(5f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _WineGlassEmpty = it}
