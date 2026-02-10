package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Br.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 20f)
            horizontalLineToRelative(-0.79f)
            arcToRelative(40.24f, 40.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, -9.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -2.92f)
            reflectiveCurveToRelative(0.66f, -1.03f, 0.69f, -1.09f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 2f)
            horizontalLineToRelative(-1f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(2f)
            horizontalLineToRelative(-1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.33f, 6.99f)
            curveToRelative(0.03f, 0.06f, 0.69f, 1.09f, 0.69f, 1.09f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, 2.92f)
            arcTo(40.24f, 40.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.79f, 20f)
            horizontalLineTo(4f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            horizontalLineTo(20f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            close()
            moveTo(9.08f, 5.23f)
            arcTo(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 5f)
            horizontalLineToRelative(5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 0.65f)
            lineTo(13.45f, 8f)
            horizontalLineToRelative(-2.9f)
            lineTo(9.02f, 5.65f)
            arcTo(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.08f, 5.23f)
            close()
            moveTo(10.39f, 11f)
            horizontalLineToRelative(3.22f)
            arcToRelative(39.5f, 39.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.37f, 9f)
            horizontalLineTo(8.02f)
            arcTo(39.5f, 39.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.39f, 11f)
            close()
        }
    }.also { _ChessKingAlt = it }
