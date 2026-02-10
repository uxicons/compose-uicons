package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Luchador: ImageVector? = null

val Icons.Bs.Luchador: ImageVector
    get() = _Luchador ?: UXIcon(name = "Luchador") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(13f, 15f)
                lineTo(13f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                lineTo(16f, 8f)
                close()
                moveTo(8f, 10f)
                lineTo(8f, 8f)
                lineTo(5f, 8f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(3f)
                lineTo(11f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.78f, 0f)
                horizontalLineToRelative(0f)
                arcTo(12.24f, 12.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.35f)
                lineTo(0f, 24f)
                lineTo(8.93f, 24f)
                lineToRelative(1.56f, -3.11f)
                arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.48f, 0.85f)
                lineTo(15.07f, 24f)
                lineTo(24f, 24f)
                close()
                moveTo(16.14f, 19.46f)
                arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.3f, 0.04f)
                lineTo(7.08f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 12.35f)
                arcTo(9.23f, 9.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.83f, 3f)
                horizontalLineToRelative(0f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.47f, 2.58f)
                arcTo(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                verticalLineToRelative(9f)
                lineTo(16.92f, 21f)
                close()
            }
        }.also { _Luchador = it}
