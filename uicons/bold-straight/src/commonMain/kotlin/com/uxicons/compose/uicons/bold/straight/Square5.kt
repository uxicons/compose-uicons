package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square5: ImageVector? = null

val Icons.Bs.Square5: ImageVector
    get() = _Square5 ?: UXIcon(name = "Square5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 19f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(20.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                close()
            }
        }.also { _Square5 = it}
