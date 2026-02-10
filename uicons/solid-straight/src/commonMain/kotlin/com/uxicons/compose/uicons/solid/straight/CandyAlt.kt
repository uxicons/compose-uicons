package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyAlt: ImageVector? = null

val Icons.Ss.CandyAlt: ImageVector
    get() = _CandyAlt ?: UXIcon(name = "CandyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.28f, 1.72f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.57f, 6.85f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9.05f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.15f, -4.97f)
                arcToRelative(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.83f, 2.59f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 10f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.98f, 3.36f)
                arcToRelative(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 2.6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7f)
                quadToRelative(0f, -0.33f, -0.03f, -0.66f)
                curveTo(19.45f, 0.75f, 12.37f, -1.27f, 8.49f, 2.8f)
                arcTo(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14.59f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(9.42f, 16f)
                arcToRelative(8.88f, 8.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.31f, 2f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.28f, 1.72f)
                close()
            }
        }.also { _CandyAlt = it}
