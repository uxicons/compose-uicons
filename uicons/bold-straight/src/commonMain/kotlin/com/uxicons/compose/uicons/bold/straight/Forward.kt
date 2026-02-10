package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forward: ImageVector? = null

val Icons.Bs.Forward: ImageVector
    get() = _Forward ?: UXIcon(name = "Forward") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 23.8f)
                verticalLineTo(0.2f)
                lineTo(9f, 5.91f)
                verticalLineTo(0.32f)
                lineTo(22.18f, 9.06f)
                arcToRelative(3.28f, 3.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.33f)
                lineTo(9f, 23.8f)
                verticalLineTo(18.09f)
                close()
                moveTo(12f, 12.26f)
                verticalLineToRelative(5.71f)
                lineToRelative(8.44f, -6.02f)
                arcToRelative(0.27f, 0.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, -0.23f)
                arcToRelative(0.27f, 0.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -0.22f)
                lineTo(12f, 5.91f)
                verticalLineTo(11.74f)
                lineTo(4f, 6.03f)
                verticalLineTo(17.97f)
                close()
            }
        }.also { _Forward = it}
