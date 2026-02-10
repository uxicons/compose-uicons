package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Box: ImageVector? = null

val Icons.Ss.Box: ImageVector
    get() = _Box ?: UXIcon(name = "Box") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 10f)
                lineTo(1f, 24f)
                lineTo(23f, 24f)
                lineTo(23f, 10f)
                close()
                moveTo(16f, 15f)
                lineTo(8f, 15f)
                lineTo(8f, 13f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Box = it}
