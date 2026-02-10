package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Anchor: ImageVector? = null

val Icons.Ss.Anchor: ImageVector
    get() = _Anchor ?: UXIcon(name = "Anchor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.94f)
                curveToRelative(-0.52f, 4.67f, -4.66f, 7.56f, -8.95f, 7.95f)
                verticalLineToRelative(-7.95f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.13f)
                curveToRelative(1.72f, -0.45f, 3f, -2.01f, 3f, -3.87f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.43f, 3f, 3.87f)
                verticalLineToRelative(4.13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.95f)
                curveToRelative(-4.28f, -0.39f, -8.42f, -3.29f, -8.95f, -7.95f)
                horizontalLineToRelative(2.94f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 6.88f, 6.1f, 11f, 12f, 11f)
                reflectiveCurveToRelative(12f, -4.12f, 12f, -11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(10f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _Anchor = it}
