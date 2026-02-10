package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burrito: ImageVector? = null

val Icons.Bs.Burrito: ImageVector
    get() = _Burrito ?: UXIcon(name = "Burrito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 15f)
                close()
                moveTo(11f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17.5f)
                close()
                moveTo(20f, 5.09f)
                lineTo(20f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                horizontalLineToRelative(-9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20.5f)
                lineTo(4f, 5.09f)
                arcTo(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3.38f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.81f, -1.62f)
                arcTo(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0.88f)
                arcToRelative(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.19f, 0.88f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.38f)
                arcTo(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.09f)
                close()
                moveTo(9.87f, 5.24f)
                arcTo(17.56f, 17.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.35f, 6.8f)
                arcToRelative(11.6f, 11.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, -0.83f)
                arcTo(5.56f, 5.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.38f)
                lineTo(12.37f, 2.87f)
                arcTo(10.88f, 10.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.87f, 5.24f)
                close()
                moveTo(17f, 20.5f)
                curveToRelative(0f, -6.39f, -5.99f, -12f, -10f, -13.24f)
                lineTo(7f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20.5f)
                close()
                moveTo(17f, 7.24f)
                arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.62f, 8.77f)
                arcTo(20.9f, 20.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11.63f)
                close()
            }
        }.also { _Burrito = it}
