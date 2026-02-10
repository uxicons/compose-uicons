package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _D: ImageVector? = null

val Icons.Bs.D: ImageVector
    get() = _D ?: UXIcon(name = "D") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 24f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 1.57f, 3.57f, 0f, 5.5f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(5.79f, 0f, 10.5f, 4.71f, 10.5f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                close()
                moveTo(5.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(20.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                horizontalLineTo(5.5f)
                close()
            }
        }.also { _D = it}
