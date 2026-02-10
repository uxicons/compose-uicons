package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camera: ImageVector? = null

val Icons.Ss.Camera: ImageVector
    get() = _Camera ?: UXIcon(name = "Camera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 5f)
                close()
                moveTo(12f, 21f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.72f, 3f)
                lineToRelative(-2.31f, -3f)
                lineToRelative(-6.81f, 0f)
                lineToRelative(-2.31f, 3f)
                lineToRelative(11.44f, 0f)
                close()
            }
        }.also { _Camera = it}
