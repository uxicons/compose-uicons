package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grimace: ImageVector? = null

val Icons.Br.Grimace: ImageVector
    get() = _Grimace ?: UXIcon(name = "Grimace") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 9f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(-3.89f, 0.6f, -3.9f, 23.4f, 12f, 24f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveTo(0.08f, 20.55f, 0.08f, 3.45f, 12f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 12f)
            lineTo(8f, 12f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
            horizontalLineToRelative(8f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
            close()
            moveTo(9f, 16f)
            lineTo(8f, 16f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
            lineTo(9f, 14f)
            close()
            moveTo(13f, 16f)
            lineTo(11f, 16f)
            lineTo(11f, 14f)
            horizontalLineToRelative(2f)
            close()
            moveTo(16f, 16f)
            lineTo(15f, 16f)
            lineTo(15f, 14f)
            horizontalLineToRelative(1f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
            close()
        }
    }.also { _Grimace = it }
