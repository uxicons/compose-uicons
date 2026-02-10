package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Br.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 20f)
            lineTo(19f, 20f)
            curveToRelative(-0.97f, 0f, -2.74f, -3.43f, -2.97f, -10f)
            lineTo(16.5f, 10f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, -3f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.42f, 7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 10f)
            horizontalLineToRelative(0.47f)
            curveToRelative(-0.24f, 6.57f, -2f, 10f, -2.97f, 10f)
            lineTo(4f, 20f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            lineTo(20f, 24f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            close()
            moveTo(12f, 3f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(10.97f, 10f)
            horizontalLineToRelative(2.05f)
            curveToRelative(0.13f, 3.66f, 0.74f, 7.46f, 2.04f, 10f)
            lineTo(8.94f, 20f)
            curveTo(10.23f, 17.46f, 10.85f, 13.66f, 10.97f, 10f)
            close()
        }
    }.also { _ChessPawnAlt = it }
