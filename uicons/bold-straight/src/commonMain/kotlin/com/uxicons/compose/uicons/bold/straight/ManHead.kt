package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManHead: ImageVector? = null

val Icons.Bs.ManHead: ImageVector
    get() = _ManHead ?: UXIcon(name = "ManHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.62f, 3.98f)
                arcTo(9.44f, 9.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19.33f)
                lineTo(17f, 24f)
                lineTo(14f, 24f)
                lineTo(14f, 20.74f)
                arcToRelative(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -0.01f)
                lineTo(10f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 19.33f)
                arcTo(9.3f, 9.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.33f, 14f)
                lineTo(3.5f, 14f)
                arcToRelative(12.84f, 12.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.84f, -0.42f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcToRelative(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.78f, -4.81f)
                lineTo(18.04f, 12f)
                lineTo(20f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, -2f)
                lineToRelative(-1.25f, -0.04f)
                lineTo(18.6f, 8.71f)
                arcTo(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 8.76f)
                arcTo(12.63f, 12.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.35f, 5f)
                lineTo(12f, 5f)
                arcToRelative(4.63f, 4.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.59f, 0.81f)
                arcToRelative(16.79f, 16.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.78f, 4.22f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.67f, 0.85f)
                arcTo(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 12f)
                lineTo(2f, 12f)
                lineTo(2f, 10f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                arcToRelative(9.73f, 9.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.36f, 7.23f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11f)
                close()
                moveTo(16f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11.5f)
                close()
            }
        }.also { _ManHead = it}
