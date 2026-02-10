package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAlt: ImageVector? = null

val Icons.Rs.MusicAlt: ImageVector
    get() = _MusicAlt ?: UXIcon(name = "MusicAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.92f, 0.69f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.45f, 0.05f)
                lineTo(8.45f, 2.3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.25f)
                verticalLineTo(16.56f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineTo(9.42f)
                lineTo(22f, 6.8f)
                verticalLineToRelative(6.76f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.92f, 0.69f)
                close()
                moveTo(4f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 22f)
                close()
                moveTo(8f, 7.39f)
                verticalLineTo(5.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, -0.98f)
                lineToRelative(12f, -2.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 3f)
                verticalLineToRelative(1.76f)
                close()
                moveTo(20f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                close()
            }
        }.also { _MusicAlt = it}
