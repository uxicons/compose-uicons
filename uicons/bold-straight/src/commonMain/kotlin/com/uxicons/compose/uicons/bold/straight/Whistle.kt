package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Bs.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(6.48f)
                lineToRelative(-7.59f, 1.28f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, 0.4f)
                arcToRelative(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, 2.88f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.28f, 23.9f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 0.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.99f, -8.53f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.24f, 8f)
                close()
                moveTo(21f, 11f)
                lineTo(8.24f, 11f)
                arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.23f, 4.67f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.6f, 2.22f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.1f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.91f, -3.29f)
                lineTo(21f, 11.95f)
                close()
                moveTo(11f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16.81f, 2.23f)
                lineTo(14.19f, 0.78f)
                lineTo(11.77f, 5.15f)
                lineTo(14.4f, 6.6f)
                close()
                moveTo(7.23f, 5.15f)
                lineTo(4.81f, 0.78f)
                lineTo(2.19f, 2.23f)
                lineTo(4.6f, 6.6f)
                close()
            }
        }.also { _Whistle = it}
