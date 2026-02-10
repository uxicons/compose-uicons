package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unlock: ImageVector? = null

val Icons.Sr.Unlock: ImageVector
    get() = _Unlock ?: UXIcon(name = "Unlock", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(362.7f, 170.74f)
                horizontalLineTo(149.37f)
                verticalLineToRelative(-21.33f)
                curveToRelative(-0.02f, -58.91f, 47.73f, -106.68f, 106.64f, -106.7f)
                curveToRelative(38.81f, -0.01f, 74.57f, 21.06f, 93.36f, 55.03f)
                curveToRelative(5.72f, 10.3f, 18.71f, 14.02f, 29.01f, 8.3f)
                curveToRelative(10.3f, -5.72f, 14.02f, -18.71f, 8.3f, -29.01f)
                curveToRelative(-39.95f, -72.15f, -130.83f, -98.26f, -202.98f, -58.31f)
                curveToRelative(-47.53f, 26.32f, -77.02f, 76.37f, -77f, 130.7f)
                verticalLineToRelative(30.38f)
                curveToRelative(-38.83f, 16.94f, -63.94f, 55.26f, -64f, 97.62f)
                verticalLineToRelative(128f)
                curveToRelative(0.07f, 58.88f, 47.79f, 106.6f, 106.67f, 106.67f)
                horizontalLineToRelative(213.33f)
                curveToRelative(58.88f, -0.07f, 106.6f, -47.79f, 106.67f, -106.67f)
                verticalLineToRelative(-128f)
                curveTo(469.3f, 218.53f, 421.59f, 170.81f, 362.7f, 170.74f)
                close()
                moveTo(277.37f, 362.74f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                reflectiveCurveToRelative(-21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineToRelative(-42.67f)
                curveToRelative(0f, -11.78f, 9.55f, -21.33f, 21.33f, -21.33f)
                reflectiveCurveToRelative(21.33f, 9.55f, 21.33f, 21.33f)
                verticalLineTo(362.74f)
                close()
            }
        }.also { _Unlock = it}
