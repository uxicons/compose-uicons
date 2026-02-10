package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Anchor: ImageVector? = null

val Icons.Bs.Anchor: ImageVector
    get() = _Anchor ?: UXIcon(name = "Anchor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.84f)
                curveToRelative(-0.75f, 3.3f, -3.93f, 5.41f, -7.34f, 5.89f)
                verticalLineToRelative(-5.89f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.26f)
                curveToRelative(1.75f, -0.62f, 3f, -2.29f, 3f, -4.24f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 1.96f, 1.25f, 3.62f, 3f, 4.24f)
                verticalLineToRelative(3.26f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5.89f)
                curveToRelative(-3.41f, -0.48f, -6.59f, -2.59f, -7.33f, -5.89f)
                horizontalLineToRelative(1.83f)
                verticalLineToRelative(-3f)
                horizontalLineTo(0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 6.57f, 6.1f, 10.5f, 12f, 10.5f)
                reflectiveCurveToRelative(12f, -3.93f, 12f, -10.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _Anchor = it}
