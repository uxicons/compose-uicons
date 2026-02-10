package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binoculars: ImageVector? = null

val Icons.Sr.Binoculars: ImageVector
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
                moveTo(19f, 6f)
                lineTo(5f, 6f)
                curveTo(2.24f, 6f, 0f, 8.24f, 0f, 11f)
                verticalLineToRelative(2.42f)
                curveToRelative(1.37f, -1.48f, 3.33f, -2.42f, 5.5f, -2.42f)
                reflectiveCurveToRelative(4.13f, 0.94f, 5.5f, 2.42f)
                verticalLineToRelative(-3.42f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.42f)
                curveToRelative(1.37f, -1.48f, 3.33f, -2.42f, 5.5f, -2.42f)
                reflectiveCurveToRelative(4.13f, 0.94f, 5.5f, 2.42f)
                verticalLineToRelative(-2.42f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(9f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.38f, 0f, -2.51f, 1.13f, -2.52f, 2.51f)
                lineToRelative(-0.0f, 1.49f)
                horizontalLineToRelative(5.03f)
                close()
            }
        }.also { _Binoculars = it}
