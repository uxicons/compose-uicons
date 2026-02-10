package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PuzzlePiece: ImageVector? = null

val Icons.Br.PuzzlePiece: ImageVector
    get() = _PuzzlePiece ?: UXIcon(name = "PuzzlePiece") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.84f, 12f)
            curveToRelative(-0.21f, 0f, -1.87f, 0.3f, -2.84f, 0.48f)
            verticalLineTo(11.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 6f)
            horizontalLineToRelative(-0.98f)
            curveTo(11.7f, 5.03f, 12f, 3.37f, 12f, 3.16f)
            arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 0f)
            arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.16f)
            curveTo(6f, 3.37f, 6.3f, 5.03f, 6.48f, 6f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.5f)
            verticalLineToRelative(7f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(7f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18.5f)
            verticalLineToRelative(-0.98f)
            curveToRelative(0.97f, 0.17f, 2.63f, 0.48f, 2.84f, 0.48f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
            close()
            moveTo(15f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 21f)
            horizontalLineToRelative(-0.98f)
            curveToRelative(0.17f, -0.97f, 0.48f, -2.63f, 0.48f, -2.84f)
            arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15f)
            arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3.16f)
            curveToRelative(0f, 0.21f, 0.3f, 1.87f, 0.48f, 2.84f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineToRelative(-7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 9f)
            horizontalLineToRelative(7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11.5f)
            close()
        }
    }.also { _PuzzlePiece = it }
