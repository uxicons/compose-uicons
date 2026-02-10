package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Rs.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6f)
                close()
                moveTo(18f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16f)
                close()
                moveTo(13.43f, 18.56f)
                arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18.92f)
                lineTo(12f, 23f)
                lineTo(10f, 23f)
                lineTo(10f, 18.92f)
                arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -0.43f)
                lineTo(6.33f, 22.01f)
                lineTo(4.6f, 21f)
                lineToRelative(2.05f, -3.52f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, -1.13f)
                lineTo(2.01f, 18.39f)
                lineTo(1f, 16.66f)
                lineToRelative(3.51f, -2.04f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.08f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 11f)
                lineTo(4.08f, 11f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -1.63f)
                lineTo(1f, 7.33f)
                lineTo(2f, 5.6f)
                lineTo(5.53f, 7.65f)
                arcTo(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.67f, 6.51f)
                lineTo(4.63f, 2.99f)
                lineTo(6.36f, 1.99f)
                lineTo(8.4f, 5.5f)
                arcTo(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5.08f)
                lineTo(10f, 1f)
                horizontalLineToRelative(2f)
                lineTo(12f, 5.08f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, 0.36f)
                arcToRelative(8.09f, 8.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, 1.62f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 9.9f)
                arcTo(8.09f, 8.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.43f, 18.56f)
                close()
            }
        }.also { _Eclipse = it}
