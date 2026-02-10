package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassEmpty: ImageVector? = null

val Icons.Tr.WineGlassEmpty: ImageVector
    get() = _WineGlassEmpty ?: UXIcon(name = "WineGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.19f)
                curveToRelative(0f, 4.37f, 3.34f, 8.02f, 7.5f, 8.29f)
                verticalLineToRelative(5.03f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5.02f)
                curveToRelative(1.91f, -0.12f, 3.69f, -0.89f, 5.07f, -2.23f)
                curveToRelative(1.57f, -1.52f, 2.43f, -3.56f, 2.43f, -5.74f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0f, 1.91f, -0.76f, 3.69f, -2.12f, 5.02f)
                curveToRelative(-1.37f, 1.33f, -3.19f, 2.02f, -5.09f, 1.97f)
                curveToRelative(-3.74f, -0.11f, -6.78f, -3.39f, -6.78f, -7.31f)
                lineTo(5.0f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _WineGlassEmpty = it}
