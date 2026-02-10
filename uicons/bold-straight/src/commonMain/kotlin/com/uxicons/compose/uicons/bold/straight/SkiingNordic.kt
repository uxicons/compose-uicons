package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiingNordic: ImageVector? = null

val Icons.Bs.SkiingNordic: ImageVector
    get() = _SkiingNordic ?: UXIcon(name = "SkiingNordic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.5f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(0.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 21f)
                lineTo(0.01f, 21f)
                lineToRelative(1.84f, -8f)
                lineTo(4.93f, 13f)
                lineTo(3.09f, 21f)
                lineTo(4.61f, 21f)
                lineTo(6.3f, 16.89f)
                lineToRelative(0.53f, 0.57f)
                arcToRelative(4.41f, 4.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 0.76f)
                lineToRelative(1.02f, 0.64f)
                lineTo(7.85f, 21f)
                lineTo(12f, 21f)
                lineTo(12f, 19.28f)
                lineToRelative(-3.46f, -2.45f)
                arcToRelative(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.3f, -4.24f)
                lineTo(8.71f, 9f)
                lineTo(6.42f, 9f)
                lineTo(5.26f, 11f)
                horizontalLineToRelative(-3.1f)
                lineTo(4.99f, 6f)
                lineTo(12.5f, 6f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1.7f)
                lineTo(17.49f, 11f)
                horizontalLineToRelative(1.27f)
                lineToRelative(0.42f, -1.84f)
                lineToRelative(2.92f, 0.67f)
                lineTo(19.53f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19.5f)
                lineTo(21f, 19f)
                close()
                moveTo(15f, 17.72f)
                lineTo(15f, 21f)
                horizontalLineToRelative(1.45f)
                lineToRelative(1.61f, -7f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-2.13f, -3.54f)
                lineTo(11.88f, 15.52f)
                close()
            }
        }.also { _SkiingNordic = it}
