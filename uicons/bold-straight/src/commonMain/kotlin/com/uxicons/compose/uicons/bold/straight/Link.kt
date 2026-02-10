package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Bs.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.25f, 24f)
                arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 11.62f)
                lineTo(6.19f, 7.55f)
                lineTo(8.31f, 9.67f)
                lineTo(4.25f, 13.74f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.02f, 6.01f)
                lineToRelative(4.07f, -4.07f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-4.07f, 4.07f)
                arcTo(7.23f, 7.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.81f, 16.45f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(4.07f, -4.07f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.74f, 4.25f)
                lineTo(9.67f, 8.31f)
                lineTo(7.55f, 6.19f)
                lineToRelative(4.07f, -4.07f)
                arcToRelative(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.26f, 10.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.55f, 14.33f)
                lineToRelative(6.78f, -6.78f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-6.78f, 6.78f)
                close()
            }
        }.also { _Link = it}
