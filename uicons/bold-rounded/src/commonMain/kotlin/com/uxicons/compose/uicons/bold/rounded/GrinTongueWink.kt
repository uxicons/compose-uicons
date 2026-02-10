package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueWink: ImageVector? = null

val Icons.Br.GrinTongueWink: ImageVector
    get() = _GrinTongueWink ?: UXIcon(name = "GrinTongueWink") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 9.67f)
            curveTo(18f, 11f, 16.88f, 11f, 15.5f, 11f)
            reflectiveCurveTo(13f, 11f, 13f, 9.67f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 7f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9.67f)
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
            moveTo(9.5f, 11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
            moveTo(16f, 13f)
            lineTo(8f, 13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(9.02f, 16f)
            curveToRelative(0.48f, 3.97f, 5.48f, 3.97f, 5.95f, 0f)
            lineTo(16f, 16f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13f)
            close()
        }
    }.also { _GrinTongueWink = it }
