package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Bs.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 19.47f)
                lineTo(13.5f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 19.85f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.99f, -1.24f)
                lineTo(4.58f, 21.55f)
                lineTo(2.45f, 19.43f)
                lineToRelative(2.93f, -2.93f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.14f, 13.5f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(4.14f, 10.5f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.39f, 7.51f)
                lineTo(2.45f, 4.58f)
                lineTo(4.58f, 2.45f)
                lineTo(7.51f, 5.39f)
                arcTo(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 4.15f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 4.53f)
                arcToRelative(8.53f, 8.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.06f, 2.74f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.45f)
                arcTo(8.53f, 8.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 19.47f)
                close()
                moveTo(24f, 12f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.5f, -6.5f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
            }
        }.also { _Eclipse = it}
