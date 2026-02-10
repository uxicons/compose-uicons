package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lock: ImageVector? = null

val Icons.Sr.Lock: ImageVector
    get() = _Lock ?: UXIcon(name = "Lock", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(405.33f, 179.71f)
                verticalLineToRelative(-30.38f)
                curveTo(405.33f, 66.86f, 338.48f, 0f, 256f, 0f)
                reflectiveCurveTo(106.67f, 66.86f, 106.67f, 149.33f)
                verticalLineToRelative(30.38f)
                curveToRelative(-38.83f, 16.94f, -63.94f, 55.26f, -64f, 97.62f)
                verticalLineToRelative(128f)
                curveTo(42.74f, 464.21f, 90.45f, 511.93f, 149.33f, 512f)
                horizontalLineToRelative(213.33f)
                curveToRelative(58.88f, -0.07f, 106.6f, -47.79f, 106.67f, -106.67f)
                verticalLineToRelative(-128f)
                curveTo(469.28f, 234.97f, 444.16f, 196.66f, 405.33f, 179.71f)
                close()
                moveTo(277.33f, 362.67f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineTo(320f)
                curveToRelative(0f, -11.78f, 9.55f, -21.33f, 21.33f, -21.33f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                verticalLineTo(362.67f)
                close()
                moveTo(362.67f, 170.67f)
                horizontalLineTo(149.33f)
                verticalLineToRelative(-21.33f)
                curveToRelative(0f, -58.91f, 47.76f, -106.67f, 106.67f, -106.67f)
                reflectiveCurveToRelative(106.67f, 47.76f, 106.67f, 106.67f)
                verticalLineTo(170.67f)
                close()
            }
        }.also { _Lock = it}
