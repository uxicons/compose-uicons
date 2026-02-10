package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _F: ImageVector? = null

val Icons.Tr.F: ImageVector
    get() = _F ?: UXIcon(name = "F") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineTo(6.5f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineTo(23.5f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                horizontalLineTo(3f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                close()
            }
        }.also { _F = it}
