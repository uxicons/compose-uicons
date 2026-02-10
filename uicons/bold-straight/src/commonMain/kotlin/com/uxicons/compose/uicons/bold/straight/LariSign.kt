package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LariSign: ImageVector? = null

val Icons.Bs.LariSign: ImageVector
    get() = _LariSign ?: UXIcon(name = "LariSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.46f)
                curveToRelative(-2.13f, -2.01f, -3.46f, -4.85f, -3.46f, -8f)
                curveTo(1f, 8.35f, 3.91f, 4.36f, 8f, 2.75f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.05f)
                curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1f, -0.05f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.05f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.75f)
                curveToRelative(4.09f, 1.6f, 7f, 5.59f, 7f, 10.25f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.95f, -1.61f, -5.54f, -4f, -6.93f)
                verticalLineToRelative(5.93f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.06f)
                verticalLineToRelative(6.94f)
                horizontalLineToRelative(-3f)
                verticalLineTo(6.07f)
                curveToRelative(-2.39f, 1.39f, -4f, 3.97f, -4f, 6.93f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                close()
            }
        }.also { _LariSign = it}
