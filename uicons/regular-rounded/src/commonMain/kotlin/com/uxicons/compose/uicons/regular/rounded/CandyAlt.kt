package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Rr.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.71f, 0.04f)
                curveTo(7.97f, -0.71f, 3.05f, 8.68f, 7.97f, 14.61f)
                lineTo(0.29f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(7.68f, -7.68f)
                curveTo(15.07f, 20.74f, 24.11f, 16.45f, 24f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.71f, 0.04f)
                close()
                moveTo(15f, 16f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 9f)
                curveTo(7.79f, 1.74f, 19.23f, -1.31f, 20f, 7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                curveToRelative(0.61f, 7.79f, 11.2f, 5.63f, 11.92f, -1f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                close()
            }
        }.also { _CandyAlt = it}
