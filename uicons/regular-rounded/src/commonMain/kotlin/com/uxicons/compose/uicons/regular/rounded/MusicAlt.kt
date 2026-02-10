package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAlt: ImageVector? = null

val Icons.Rr.MusicAlt: ImageVector
    get() = _MusicAlt ?: UXIcon(name = "MusicAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.55f, 0.92f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.26f, 0.07f)
                lineTo(10.08f, 1.79f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6.71f)
                verticalLineToRelative(9.85f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineTo(10.88f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.63f, 8.91f)
                lineToRelative(11.18f, -2.1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7.8f)
                verticalLineToRelative(5.76f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineTo(4f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.55f, 0.92f)
                close()
                moveTo(4f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 22f)
                close()
                moveTo(20.45f, 4.85f)
                lineTo(9.26f, 6.94f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7.42f)
                verticalLineToRelative(-0.71f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, -2.95f)
                lineToRelative(9.19f, -1.72f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineToRelative(0.98f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.45f, 4.85f)
                close()
                moveTo(20f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                close()
            }
        }.also { _MusicAlt = it}
