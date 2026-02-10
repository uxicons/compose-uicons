package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocation: ImageVector? = null

val Icons.Rr.HomeLocation: ImageVector
    get() = _HomeLocation ?: UXIcon(name = "HomeLocation") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(5f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 9.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, 7.24f)
                lineToRelative(7f, -4.72f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.36f, 0f)
                lineToRelative(7f, 4.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9.72f)
                close()
                moveTo(12f, 7.01f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 17.26f)
                lineToRelative(1.82f, 1.78f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, 0f)
                lineToRelative(1.83f, -1.79f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.01f)
                close()
                moveTo(14.84f, 15.83f)
                lineTo(13.01f, 17.61f)
                arcToRelative(1.45f, 1.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.02f, 0f)
                lineTo(9.17f, 15.84f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.67f, -0.01f)
                close()
                moveTo(13f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 13f)
                close()
            }
        }.also { _HomeLocation = it}
