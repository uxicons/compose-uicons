package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Sr.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.28f, 1.72f)
                curveToRelative(3.28f, 4.18f, 1.7f, 11.04f, -3.85f, 12.13f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9.05f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.15f, -4.97f)
                curveTo(18.66f, 3.35f, 19.49f, 9.7f, 15f, 10f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.64f, 5.96f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.33f, -5.62f)
                curveTo(19.45f, 0.75f, 12.37f, -1.27f, 8.49f, 2.8f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14.59f)
                lineToRelative(-7.7f, 7.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(9.42f, 16f)
                curveTo(19.21f, 23.33f, 29.86f, 9.16f, 20.28f, 1.72f)
                close()
            }
        }.also { _CandyAlt = it}
