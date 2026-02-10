package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Rr.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(2f, 5.83f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.86f, 5.35f)
                lineTo(21.59f, 8.7f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11.64f)
                verticalLineToRelative(1.72f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.59f, 16.3f)
                lineTo(4f, 19.82f)
                lineTo(4f, 23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 24f)
                close()
                moveTo(4f, 7.22f)
                lineTo(4f, 17.78f)
                lineToRelative(2f, -0.4f)
                lineTo(6f, 7.62f)
                close()
                moveTo(8f, 8.02f)
                verticalLineToRelative(8.96f)
                lineToRelative(2f, -0.4f)
                lineTo(10f, 8.42f)
                close()
                moveTo(12f, 8.82f)
                verticalLineToRelative(7.36f)
                lineToRelative(2f, -0.4f)
                lineTo(14f, 9.22f)
                close()
                moveTo(16f, 9.62f)
                verticalLineToRelative(5.76f)
                lineToRelative(2f, -0.4f)
                lineTo(18f, 10.02f)
                close()
                moveTo(20f, 10.42f)
                verticalLineToRelative(4.16f)
                lineToRelative(1.2f, -0.24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.98f)
                lineTo(22f, 11.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.98f)
                close()
                moveTo(3f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 2f)
                close()
            }
        }.also { _Windsock = it}
