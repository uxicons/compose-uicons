package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Br.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 20f)
            verticalLineTo(8.46f)
            curveTo(20f, 5.72f, 18.23f, 0.43f, 11.54f, 0f)
            arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.05f, 1.69f)
            curveToRelative(-0.62f, 2f, -1.58f, 3.24f, -2.92f, 3.78f)
            arcTo(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.6f)
            arcTo(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 11f)
            horizontalLineTo(9.44f)
            arcTo(4.81f, 4.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 12.79f)
            arcTo(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17.57f)
            verticalLineTo(20f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            horizontalLineTo(20f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            close()
            moveTo(7f, 17.57f)
            arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.39f, 15.53f)
            arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.62f, -5.78f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.54f, 8f)
            horizontalLineTo(7.81f)
            arcToRelative(8.33f, 8.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, -4.97f)
            arcTo(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8.46f)
            verticalLineTo(20f)
            horizontalLineTo(7f)
            close()
        }
    }.also { _ChessKnightAlt = it }
