package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Rs.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
                moveTo(12f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.83f, -3.7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, -8.35f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 3.6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.75f, 8.35f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.83f, 20.3f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(9.06f, 17.11f)
                lineToRelative(-0.06f, 1.97f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 19f)
                curveToRelative(0f, 0.04f, -0.06f, -1.89f, -0.06f, -1.89f)
                lineToRelative(1.55f, 0.91f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.93f, -5.2f)
                lineToRelative(-1.61f, -0.88f)
                lineToRelative(1.61f, -0.88f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.92f, -5.2f)
                lineTo(15f, 6.74f)
                lineTo(15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                lineTo(9f, 6.74f)
                lineTo(7.5f, 5.87f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.92f, 5.2f)
                lineToRelative(1.61f, 0.88f)
                lineToRelative(-1.61f, 0.88f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.93f, 5.2f)
                close()
            }
        }.also { _Flower = it}
