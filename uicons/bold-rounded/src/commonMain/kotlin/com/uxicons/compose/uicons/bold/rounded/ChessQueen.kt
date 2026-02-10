package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Br.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.31f, 9.78f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.2f, -0.74f)
            arcToRelative(11.14f, 11.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.25f, -4.88f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.72f, 0f)
            arcTo(11.14f, 11.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.89f, 9.04f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.2f, 0.74f)
            arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, 2.3f)
            lineToRelative(2.06f, 8.97f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 24f)
            horizontalLineToRelative(19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, -2.95f)
            lineToRelative(2.05f, -8.94f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.31f, 9.78f)
            close()
            moveTo(5.2f, 21f)
            lineTo(3.18f, 12.2f)
            arcTo(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            curveToRelative(0f, -0.11f, -0.01f, -0.22f, -0.02f, -0.34f)
            arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
            arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, -3.3f)
            lineTo(18.81f, 21f)
            close()
            moveTo(12f, 7f)
            arcToRelative(7.82f, 7.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.21f, 3.15f)
            arcToRelative(7.41f, 7.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, 1.16f)
            arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.46f, 0.01f)
            arcToRelative(7.34f, 7.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, -1.18f)
            arcTo(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
            close()
        }
    }.also { _ChessQueen = it }
