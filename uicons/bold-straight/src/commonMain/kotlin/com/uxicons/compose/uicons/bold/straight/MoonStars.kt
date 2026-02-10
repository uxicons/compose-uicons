package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Bs.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.97f, 8.53f)
                lineTo(19.3f, 7.37f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                lineTo(21.64f, 9.7f)
                lineToRelative(-1.17f, 2.33f)
                lineTo(19.3f, 9.7f)
                close()
                moveTo(22.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 16f)
                close()
                moveTo(17.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 12f)
                close()
                moveTo(18.76f, 21.89f)
                lineTo(20.96f, 20.39f)
                lineTo(18.53f, 19.29f)
                curveTo(15.78f, 18.05f, 13f, 15.16f, 13f, 11.5f)
                curveToRelative(0f, -3.42f, 2.59f, -6.11f, 4.81f, -7.38f)
                lineTo(20.12f, 2.8f)
                lineToRelative(-2.33f, -1.29f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.97f, 20.39f)
                close()
                moveTo(13.97f, 3.22f)
                arcTo(11.2f, 11.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11.5f)
                arcToRelative(11.52f, 11.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, 9.04f)
                arcTo(8.86f, 8.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(8.83f, 8.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.97f, 3.22f)
                close()
            }
        }.also { _MoonStars = it}
