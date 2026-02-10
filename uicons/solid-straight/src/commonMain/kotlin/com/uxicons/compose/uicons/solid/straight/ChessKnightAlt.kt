package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Ss.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                lineTo(4f, 18f)
                lineTo(4f, 16.65f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, -2.87f)
                arcToRelative(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.09f, -4.75f)
                lineTo(4f, 9.02f)
                lineTo(4f, 8.05f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.91f, 5.26f)
                curveTo(7.76f, 4.5f, 8.9f, 3.57f, 9.59f, 0.78f)
                lineTo(9.78f, 0.02f)
                horizontalLineToRelative(0.78f)
                curveTo(19.89f, 0.02f, 20f, 8.44f, 20f, 8.52f)
                close()
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                lineTo(19f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _ChessKnightAlt = it}
