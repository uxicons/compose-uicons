package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Luchador: ImageVector? = null

val Icons.Rs.Luchador: ImageVector
    get() = _Luchador ?: UXIcon(name = "Luchador") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                lineTo(13f, 16f)
                lineTo(13f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(2f)
                lineTo(18f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16f)
                close()
                moveTo(15f, 14f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(18f, 12f)
                lineTo(16f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                close()
                moveTo(11f, 16f)
                lineTo(7f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(4f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(2f)
                lineTo(8f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(6f, 12f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(9f, 14f)
                lineTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
                moveTo(24f, 24f)
                lineTo(15.59f, 24f)
                lineTo(14.08f, 21.23f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.16f, 0f)
                lineTo(8.41f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 12.37f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.78f, 0f)
                horizontalLineToRelative(0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(16.77f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.81f, 2f)
                horizontalLineToRelative(0f)
                arcTo(10.24f, 10.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12.37f)
                lineTo(2f, 22f)
                lineTo(7.22f, 22f)
                lineToRelative(0.94f, -1.72f)
                arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.67f, 0f)
                close()
            }
        }.also { _Luchador = it}
