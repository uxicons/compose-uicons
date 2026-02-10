package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ss2: ImageVector? = null

val Icons.Ss.Ss2: ImageVector
    get() = _Ss2 ?: UXIcon(name = "Ss2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.67f, 3.45f, -5.45f, 6.79f, -7.17f)
                curveToRelative(3.71f, -1.91f, 7.21f, -3.72f, 7.21f, -7.83f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                horizontalLineToRelative(-2f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 5.33f, -4.41f, 7.6f, -8.29f, 9.6f)
                curveToRelative(-2.62f, 1.35f, -4.93f, 2.54f, -5.55f, 4.4f)
                horizontalLineToRelative(13.84f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Ss2 = it}
