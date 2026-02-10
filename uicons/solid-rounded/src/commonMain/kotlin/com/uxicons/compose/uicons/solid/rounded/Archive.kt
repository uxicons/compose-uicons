package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archive: ImageVector? = null

val Icons.Sr.Archive: ImageVector
    get() = _Archive ?: UXIcon(name = "Archive", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(362.67f, 0f)
                horizontalLineTo(149.33f)
                curveTo(90.42f, 0f, 42.67f, 47.76f, 42.67f, 106.67f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(426.67f)
                verticalLineToRelative(-128f)
                curveTo(469.33f, 47.76f, 421.58f, 0f, 362.67f, 0f)
                close()
                moveTo(277.33f, 149.33f)
                horizontalLineToRelative(-42.67f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                reflectiveCurveToRelative(9.55f, -21.33f, 21.33f, -21.33f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                reflectiveCurveTo(289.11f, 149.33f, 277.33f, 149.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(42.67f, 405.33f)
                curveTo(42.67f, 464.24f, 90.42f, 512f, 149.33f, 512f)
                horizontalLineToRelative(213.33f)
                curveToRelative(58.91f, 0f, 106.67f, -47.76f, 106.67f, -106.67f)
                verticalLineToRelative(-128f)
                horizontalLineTo(42.67f)
                verticalLineTo(405.33f)
                close()
                moveTo(234.67f, 362.67f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                horizontalLineToRelative(-42.67f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                curveTo(213.33f, 372.22f, 222.88f, 362.67f, 234.67f, 362.67f)
                close()
            }
        }.also { _Archive = it}
