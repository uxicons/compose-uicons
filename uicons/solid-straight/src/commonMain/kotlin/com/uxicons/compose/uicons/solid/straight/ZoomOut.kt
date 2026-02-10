package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomOut: ImageVector? = null

val Icons.Ss.ZoomOut: ImageVector
    get() = _ZoomOut ?: UXIcon(name = "ZoomOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.74f, 16.33f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.42f, 1.42f)
                lineTo(22.59f, 24f)
                lineTo(24f, 22.59f)
                close()
                moveTo(14f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _ZoomOut = it}
