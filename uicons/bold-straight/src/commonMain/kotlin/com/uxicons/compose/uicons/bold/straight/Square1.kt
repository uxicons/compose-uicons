package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square1: ImageVector? = null

val Icons.Bs.Square1: ImageVector
    get() = _Square1 ?: UXIcon(name = "Square1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineTo(20.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineTo(24f)
                close()
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(21f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-3.85f, 3.95f)
                lineToRelative(2.15f, 2.1f)
                lineToRelative(0.93f, -0.95f)
                verticalLineToRelative(8.9f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                close()
            }
        }.also { _Square1 = it}
