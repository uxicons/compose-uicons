package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Rr.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.45f, 9.63f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.87f, -0.59f)
                curveToRelative(-0.21f, 0.04f, -0.42f, 0.1f, -0.63f, 0.16f)
                arcToRelative(10.83f, 10.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.1f, -5.03f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.7f, 0f)
                arcTo(10.83f, 10.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.05f, 9.2f)
                curveToRelative(-0.21f, -0.06f, -0.41f, -0.11f, -0.63f, -0.16f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.87f, 0.59f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, 1.89f)
                lineToRelative(2.9f, 10.49f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 24f)
                lineTo(21f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, -1.99f)
                lineToRelative(2.91f, -10.52f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.45f, 9.63f)
                close()
                moveTo(12f, 6f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.09f, 4.0f)
                arcToRelative(6.85f, 6.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 1.81f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.16f, 0f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -1.81f)
                arcTo(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(18.96f, 22f)
                lineTo(5.04f, 22f)
                lineTo(2.03f, 11f)
                curveTo(4f, 11.4f, 6f, 12.9f, 6f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                curveToRelative(0f, -2.1f, 2f, -3.6f, 4f, -4.02f)
                close()
            }
        }.also { _ChessQueen = it}
