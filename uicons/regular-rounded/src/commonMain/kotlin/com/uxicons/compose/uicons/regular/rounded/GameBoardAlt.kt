package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameBoardAlt: ImageVector? = null

val Icons.Rr.GameBoardAlt: ImageVector
    get() = _GameBoardAlt ?: UXIcon(name = "GameBoardAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0f)
                close()
                moveTo(13f, 22f)
                lineTo(13f, 20.41f)
                lineTo(20.41f, 13f)
                lineTo(22f, 13f)
                verticalLineToRelative(1.59f)
                lineTo(14.59f, 22f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(4.59f)
                lineTo(13f, 17.59f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(6f)
                lineTo(13f, 11f)
                lineTo(13f, 2f)
                horizontalLineToRelative(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                close()
                moveTo(2f, 11f)
                lineTo(2f, 9.41f)
                lineTo(9.41f, 2f)
                lineTo(11f, 2f)
                lineTo(11f, 3.59f)
                lineTo(3.59f, 11f)
                close()
                moveTo(11f, 6.41f)
                lineTo(11f, 11f)
                lineTo(6.41f, 11f)
                close()
                moveTo(5f, 2f)
                lineTo(6.59f, 2f)
                lineTo(2f, 6.59f)
                lineTo(2f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                close()
                moveTo(2f, 19f)
                lineTo(2f, 13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                lineTo(5f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                close()
                moveTo(19f, 22f)
                lineTo(17.41f, 22f)
                lineTo(22f, 17.41f)
                lineTo(22f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                close()
            }
        }.also { _GameBoardAlt = it}
