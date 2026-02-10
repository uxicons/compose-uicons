package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Luchador: ImageVector? = null

val Icons.Ss.Luchador: ImageVector
    get() = _Luchador ?: UXIcon(name = "Luchador") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                verticalLineToRelative(1f)
                lineTo(7f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(6f, 12f)
                lineTo(8f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13f)
                close()
                moveTo(24f, 12f)
                lineTo(24f, 24f)
                lineTo(16.73f, 24f)
                lineToRelative(-1.77f, -3.25f)
                arcToRelative(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.92f, 0f)
                lineTo(7.27f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 12.37f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.78f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(11f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(6f, 10f)
                lineTo(6f, 8f)
                lineTo(4f, 8f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(20f, 8f)
                lineTo(18f, 8f)
                verticalLineToRelative(2f)
                lineTo(16f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
                moveTo(15f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(18f, 12f)
                lineTo(16f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13f)
                close()
            }
        }.also { _Luchador = it}
