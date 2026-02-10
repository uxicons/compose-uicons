package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grimace: ImageVector? = null

val Icons.Sr.Grimace: ImageVector
    get() = _Grimace ?: UXIcon(name = "Grimace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(15.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 8f)
                close()
                moveTo(8.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8f)
                close()
                moveTo(6f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                lineTo(9f, 14f)
                verticalLineToRelative(4f)
                lineTo(8f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16f)
                close()
                moveTo(11f, 18f)
                lineTo(11f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(16f, 18f)
                lineTo(15f, 18f)
                lineTo(15f, 14f)
                horizontalLineToRelative(1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                close()
            }
        }.also { _Grimace = it}
