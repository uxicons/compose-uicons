package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueSquint: ImageVector? = null

val Icons.Br.GrinTongueSquint: ImageVector
    get() = _GrinTongueSquint ?: UXIcon(name = "GrinTongueSquint") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
            lineTo(14.98f, 16f)
            curveToRelative(-0.48f, 3.97f, -5.48f, 3.97f, -5.95f, 0f)
            lineTo(8f, 16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 14.5f)
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
            moveTo(8.4f, 11.7f)
            lineToRelative(2f, -1.5f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.4f)
            lineToRelative(-2f, -1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.6f, 8.7f)
            lineTo(7f, 9f)
            lineToRelative(-0.4f, 0.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, 2.4f)
            close()
            moveTo(17.7f, 6.6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, -0.3f)
            lineToRelative(-2f, 1.5f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.4f)
            lineToRelative(2f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.8f, -2.4f)
            lineTo(17f, 9f)
            lineToRelative(0.4f, -0.3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.7f, 6.6f)
            close()
        }
    }.also { _GrinTongueSquint = it }
