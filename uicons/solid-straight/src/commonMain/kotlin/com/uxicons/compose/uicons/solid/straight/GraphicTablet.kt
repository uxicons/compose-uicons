package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicTablet: ImageVector? = null

val Icons.Ss.GraphicTablet: ImageVector
    get() = _GraphicTablet ?: UXIcon(name = "GraphicTablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 20f)
                lineToRelative(0f, -16f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 7f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 7f)
                lineToRelative(5f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                close()
            }
        }.also { _GraphicTablet = it}
