package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Sr.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.78f, 12.17f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, 1.54f)
                lineToRelative(-9.1f, 9.1f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.54f, 0.95f)
                arcToRelative(10.3f, 10.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, -2.85f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.83f, -8.83f)
                arcToRelative(10.26f, 10.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.86f, 0.09f)
                close()
                moveTo(10.1f, 20.7f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.6f, -10.6f)
                arcToRelative(12.36f, 12.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.23f, 0.08f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.75f, 13.74f)
                arcToRelative(12.31f, 12.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, -3.22f)
                close()
            }
        }.also { _Sticker = it}
