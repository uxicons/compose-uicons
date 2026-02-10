package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHorizontal: ImageVector? = null

val Icons.Rr.RectangleHorizontal: ImageVector
    get() = _RectangleHorizontal ?: UXIcon(name = "RectangleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                lineTo(5f, 3f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 21f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                close()
                moveTo(22f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(5f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                lineTo(19f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _RectangleHorizontal = it}
