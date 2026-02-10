package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Rr.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(12f, 7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4.9f)
                lineTo(8f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(6f, 11.9f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 7f)
                lineTo(2f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 1f)
                lineTo(4f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9.82f)
                lineTo(6f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 1f)
                lineTo(8f, 9.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7f)
                lineTo(10f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                close()
                moveTo(22f, 10f)
                arcToRelative(12.64f, 12.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 9.78f)
                lineTo(17f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(15f, 2f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.13f, 0.22f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.36f, 0.46f)
                arcTo(13.47f, 13.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                close()
                moveTo(20f, 10f)
                arcToRelative(11.7f, 11.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -7.94f)
                lineTo(17f, 17.07f)
                arcTo(10.3f, 10.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10f)
                close()
            }
        }.also { _Utensils = it}
