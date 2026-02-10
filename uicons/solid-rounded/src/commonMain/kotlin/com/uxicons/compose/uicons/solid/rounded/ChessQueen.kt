package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Sr.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.01f, 7.88f)
                arcToRelative(10.36f, 10.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.15f, -3.7f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.68f, 0f)
                arcToRelative(10.36f, 10.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.15f, 3.7f)
                arcTo(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.94f, 11.6f)
                arcToRelative(6.0f, 6.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.88f, 0f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.01f, 7.88f)
                close()
                moveTo(21.03f, 22f)
                lineTo(2.97f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 24f)
                lineTo(21f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, -2f)
                close()
                moveTo(21.59f, 20f)
                reflectiveCurveTo(24f, 11.25f, 24f, 10.5f)
                arcTo(1.45f, 1.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 9f)
                curveToRelative(-2f, 0f, -4.5f, 3.85f, -4.5f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveToRelative(0f, -2.15f, -2.5f, -6f, -4.5f, -6f)
                arcTo(1.45f, 1.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.5f)
                curveTo(0f, 11.25f, 2.42f, 20f, 2.42f, 20f)
                close()
            }
        }.also { _ChessQueen = it}
