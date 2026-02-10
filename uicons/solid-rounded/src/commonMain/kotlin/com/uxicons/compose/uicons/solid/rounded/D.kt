package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _D: ImageVector? = null

val Icons.Sr.D: ImageVector
    get() = _D ?: UXIcon(name = "D") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24f)
                horizontalLineTo(7f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                close()
                moveTo(7f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                horizontalLineTo(7f)
                close()
            }
        }.also { _D = it}
