package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Ss.MoonStars: ImageVector
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
                moveTo(23f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17f)
                close()
                moveTo(17f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                close()
                moveTo(18.76f, 21.89f)
                lineTo(20.23f, 20.89f)
                lineTo(18.61f, 20.16f)
                curveToRelative(-7.01f, -3.04f, -7.5f, -13.22f, -0.8f, -16.91f)
                lineToRelative(1.54f, -0.88f)
                lineToRelative(-1.55f, -0.86f)
                curveTo(10.03f, -2.98f, -0.15f, 3.04f, 0f, 12f)
                arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.76f, 21.89f)
                close()
            }
        }.also { _MoonStars = it}
