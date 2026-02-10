package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binoculars: ImageVector? = null

val Icons.Ss.Binoculars: ImageVector
    get() = _Binoculars ?: UXIcon(name = "Binoculars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18.5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(5.5f, 13f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(9f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(21f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(4.42f)
                curveToRelative(1.37f, -1.48f, 3.33f, -2.42f, 5.5f, -2.42f)
                reflectiveCurveToRelative(4.13f, 0.94f, 5.5f, 2.42f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.42f)
                curveToRelative(1.37f, -1.48f, 3.33f, -2.42f, 5.5f, -2.42f)
                reflectiveCurveToRelative(4.13f, 0.94f, 5.5f, 2.42f)
                verticalLineToRelative(-4.42f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _Binoculars = it}
