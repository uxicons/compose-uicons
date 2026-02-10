package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Bs.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.77f, 1.15f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineTo(0f, 11.38f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(11.38f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(17.82f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 14f)
                horizontalLineToRelative(-0.36f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17.82f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(12.62f)
                lineToRelative(9f, -9f)
                lineToRelative(9f, 9f)
                close()
            }
        }.also { _Home = it}
