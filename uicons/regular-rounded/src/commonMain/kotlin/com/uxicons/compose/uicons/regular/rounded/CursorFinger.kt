package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Rr.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.98f, 9.38f)
                lineTo(12f, 8.18f)
                verticalLineTo(3.11f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 0.04f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3f)
                verticalLineTo(9.66f)
                lineTo(3.21f, 13.3f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 6.79f)
                lineToRelative(2.4f, 2.42f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.41f, 24f)
                horizontalLineTo(17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(14.28f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.98f, 9.38f)
                close()
                moveTo(20f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(9.41f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.13f, -0.89f)
                lineToRelative(-2.4f, -2.43f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, -4.12f)
                lineTo(6f, 12.95f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, -0.98f)
                arcTo(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 3.11f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 0.98f)
                lineToRelative(6.78f, 1.36f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14.28f)
                close()
            }
        }.also { _CursorFinger = it}
