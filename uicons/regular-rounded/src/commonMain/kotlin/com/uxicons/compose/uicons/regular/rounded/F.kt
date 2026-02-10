package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _F: ImageVector? = null

val Icons.Rr.F: ImageVector
    get() = _F ?: UXIcon(name = "F") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(7f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineTo(23f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(13f)
                curveToRelative(1.31f, -0.01f, 1.31f, -1.99f, 0f, -2f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.31f, -0.01f, 1.31f, -1.99f, 0f, -2f)
                close()
            }
        }.also { _F = it}
