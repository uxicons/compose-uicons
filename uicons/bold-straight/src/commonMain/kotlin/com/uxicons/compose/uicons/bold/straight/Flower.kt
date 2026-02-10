package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Bs.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(12f, 12f)
                verticalLineToRelative(0f)
                close()
                moveTo(12f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.73f, -3.39f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.19f, 12f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.27f, 3.39f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.47f, 0f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.81f, 12f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.07f, 8.61f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(10f, 15.69f)
                lineTo(10f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                lineTo(14f, 15.8f)
                lineToRelative(2.58f, 1.59f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.2f, -4.07f)
                lineTo(16.36f, 12f)
                lineToRelative(2.42f, -1.32f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.2f, -4.07f)
                lineTo(14f, 8.2f)
                lineTo(14f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                lineTo(10f, 8.31f)
                lineTo(7.4f, 6.6f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.18f, 4.08f)
                lineTo(7.64f, 12f)
                lineTo(5.22f, 13.32f)
                arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.4f, 17.4f)
                close()
            }
        }.also { _Flower = it}
