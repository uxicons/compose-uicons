package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocation: ImageVector? = null

val Icons.Sr.HomeLocation: ImageVector
    get() = _HomeLocation ?: UXIcon(name = "HomeLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 6.83f)
                lineToRelative(2.29f, 2.24f)
                arcToRelative(0.78f, 0.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, 0f)
                lineToRelative(2.3f, -2.24f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
                moveTo(12f, 13.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.99f)
                close()
                moveTo(21.8f, 5.58f)
                lineTo(14.8f, 0.85f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 0.85f)
                lineToRelative(-7f, 4.72f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.72f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9.72f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.8f, 5.58f)
                close()
                moveTo(16.24f, 17.24f)
                lineTo(13.94f, 19.5f)
                arcToRelative(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.88f, 0f)
                lineToRelative(-2.3f, -2.25f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.48f, -8.49f)
                horizontalLineToRelative(0f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.24f, 17.24f)
                close()
            }
        }.also { _HomeLocation = it}
