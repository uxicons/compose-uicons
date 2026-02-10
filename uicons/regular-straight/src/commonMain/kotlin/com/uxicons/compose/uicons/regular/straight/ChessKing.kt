package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Rs.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.65f, 9.84f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.77f, -1.45f)
                arcTo(38.51f, 38.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7.02f)
                lineTo(13f, 5f)
                horizontalLineToRelative(3f)
                lineTo(16f, 3f)
                lineTo(13f, 3f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 3f)
                lineTo(8f, 3f)
                lineTo(8f, 5f)
                horizontalLineToRelative(3f)
                lineTo(11f, 7.02f)
                arcTo(38.51f, 38.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 8.39f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 12.14f)
                lineTo(3.17f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                lineTo(22f, 24f)
                lineTo(22f, 22f)
                lineTo(20.83f, 22f)
                lineToRelative(3.04f, -9.86f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.65f, 9.84f)
                close()
                moveTo(21.95f, 11.55f)
                lineTo(18.74f, 22f)
                lineTo(5.26f, 22f)
                lineTo(2.04f, 11.55f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -0.77f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, 10.3f)
                arcTo(36.7f, 36.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcToRelative(36.7f, 36.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.3f, 1.3f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, 0.48f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.95f, 11.55f)
                close()
            }
        }.also { _ChessKing = it}
