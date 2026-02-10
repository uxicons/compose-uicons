package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Rs.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.97f, 14.62f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.93f, -7.93f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 0f)
                close()
                moveTo(15f, 16f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.63f, -1.76f)
                lineToRelative(-0.61f, -0.61f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.93f, -6f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                close()
            }
        }.also { _CandyAlt = it}
