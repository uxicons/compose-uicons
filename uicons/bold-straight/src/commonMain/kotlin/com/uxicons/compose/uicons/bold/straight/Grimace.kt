package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grimace: ImageVector? = null

val Icons.Bs.Grimace: ImageVector
    get() = _Grimace ?: UXIcon(name = "Grimace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
                close()
                moveTo(16f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                curveTo(0.08f, 3.45f, 0.08f, 20.55f, 12f, 21f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(16f, 12f)
                lineTo(8f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                horizontalLineToRelative(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                close()
                moveTo(13f, 14f)
                verticalLineToRelative(2f)
                lineTo(11f, 16f)
                lineTo(11f, 14f)
                close()
                moveTo(7f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(9f, 14f)
                verticalLineToRelative(2f)
                lineTo(8f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15f)
                close()
                moveTo(16f, 16f)
                lineTo(15f, 16f)
                lineTo(15f, 14f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                close()
            }
        }.also { _Grimace = it}
