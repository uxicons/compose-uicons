package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Game: ImageVector? = null

val Icons.Ss.Game: ImageVector
    get() = _Game ?: UXIcon(name = "Game") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(8f, 18f)
                reflectiveCurveToRelative(-4f, -2.67f, -4f, -5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                curveToRelative(0f, 2.33f, -4f, 5f, -4f, 5f)
                close()
                moveTo(23.88f, 6.69f)
                lineTo(19.1f, 23.11f)
                lineTo(18f, 22.7f)
                verticalLineToRelative(-15.7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-4.24f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.66f, -1.88f)
                lineToRelative(9.44f, 2.86f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, 3.72f)
                close()
            }
        }.also { _Game = it}
