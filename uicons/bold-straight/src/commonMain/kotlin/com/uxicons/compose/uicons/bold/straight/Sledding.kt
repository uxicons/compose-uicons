package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sledding: ImageVector? = null

val Icons.Bs.Sledding: ImageVector
    get() = _Sledding ?: UXIcon(name = "Sledding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.92f, 21.45f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 2.11f)
                lineTo(0.01f, 14.85f)
                lineToRelative(1.31f, -2.7f)
                lineToRelative(17.9f, 8.7f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, -0.71f)
                close()
                moveTo(18.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
                close()
                moveTo(8.83f, 9.24f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 15f)
                horizontalLineTo(16.29f)
                lineToRelative(0.45f, 2.08f)
                lineToRelative(3.42f, 1.62f)
                lineTo(18.71f, 12f)
                horizontalLineTo(14.3f)
                lineToRelative(1.83f, -2.06f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -4.88f)
                lineTo(14.39f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(5.81f)
                close()
            }
        }.also { _Sledding = it}
