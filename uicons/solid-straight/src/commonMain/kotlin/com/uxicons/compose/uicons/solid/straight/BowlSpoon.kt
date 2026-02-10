package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Ss.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.25f, 12.08f)
                curveToRelative(0.59f, 0.7f, 0.85f, 1.62f, 0.7f, 2.53f)
                curveToRelative(-0.81f, 5.0f, -4.74f, 7.91f, -7.72f, 9.39f)
                horizontalLineTo(7.77f)
                curveTo(4.78f, 22.53f, 0.85f, 19.62f, 0.04f, 14.61f)
                curveToRelative(-0.15f, -0.91f, 0.11f, -1.83f, 0.7f, -2.53f)
                curveToRelative(0.57f, -0.67f, 1.4f, -1.06f, 2.27f, -1.06f)
                horizontalLineToRelative(17.98f)
                curveToRelative(0.87f, 0f, 1.69f, 0.39f, 2.27f, 1.06f)
                close()
                moveTo(10.41f, 3f)
                curveToRelative(-0.47f, -1.72f, -2.14f, -3f, -4.12f, -3f)
                curveTo(4.13f, 0f, 0f, 1.56f, 0f, 4f)
                reflectiveCurveToRelative(4.13f, 4f, 6.29f, 4f)
                curveToRelative(1.98f, 0f, 3.64f, -1.28f, 4.12f, -3f)
                horizontalLineToRelative(13.63f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-13.63f)
                close()
            }
        }.also { _BowlSpoon = it}
