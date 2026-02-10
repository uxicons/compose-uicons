package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trash: ImageVector? = null

val Icons.Sr.Trash: ImageVector
    get() = _Trash ?: UXIcon(name = "Trash", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(448f, 85.33f)
                horizontalLineToRelative(-66.13f)
                curveTo(371.66f, 35.7f, 328f, 0.06f, 277.33f, 0f)
                horizontalLineToRelative(-42.67f)
                curveToRelative(-50.67f, 0.06f, -94.33f, 35.7f, -104.53f, 85.33f)
                horizontalLineTo(64f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                reflectiveCurveTo(52.22f, 128f, 64f, 128f)
                horizontalLineToRelative(21.33f)
                verticalLineToRelative(277.33f)
                curveTo(85.4f, 464.21f, 133.12f, 511.93f, 192f, 512f)
                horizontalLineToRelative(128f)
                curveToRelative(58.88f, -0.07f, 106.6f, -47.79f, 106.67f, -106.67f)
                verticalLineTo(128f)
                horizontalLineTo(448f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                reflectiveCurveTo(459.78f, 85.33f, 448f, 85.33f)
                close()
                moveTo(234.67f, 362.67f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                curveTo(201.55f, 384f, 192f, 374.45f, 192f, 362.67f)
                verticalLineToRelative(-128f)
                curveToRelative(0f, -11.78f, 9.55f, -21.33f, 21.33f, -21.33f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                verticalLineTo(362.67f)
                close()
                moveTo(320f, 362.67f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineToRelative(-128f)
                curveToRelative(0f, -11.78f, 9.55f, -21.33f, 21.33f, -21.33f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                verticalLineTo(362.67f)
                close()
                moveTo(174.32f, 85.33f)
                curveToRelative(9.07f, -25.55f, 33.24f, -42.63f, 60.35f, -42.67f)
                horizontalLineToRelative(42.67f)
                curveToRelative(27.11f, 0.03f, 51.28f, 17.12f, 60.35f, 42.67f)
                horizontalLineTo(174.32f)
                close()
            }
        }.also { _Trash = it}
