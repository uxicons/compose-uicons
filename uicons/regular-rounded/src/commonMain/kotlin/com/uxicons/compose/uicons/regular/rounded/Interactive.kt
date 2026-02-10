package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interactive: ImageVector? = null

val Icons.Rr.Interactive: ImageVector
    get() = _Interactive ?: UXIcon(name = "Interactive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineTo(22.63f, 21.22f)
                lineTo(20.9f, 19.49f)
                lineTo(23.69f, 16.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, -1.65f)
                lineTo(14.36f, 11.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.56f, 2.56f)
                lineToRelative(3.26f, 8.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, 0.64f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -0.29f)
                lineTo(19.49f, 20.9f)
                lineToRelative(1.73f, 1.73f)
                lineToRelative(1.08f, 1.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
                moveTo(16.4f, 21.16f)
                lineToRelative(-2.72f, -7.49f)
                lineToRelative(7.49f, 2.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.08f, 15.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, -0.08f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.55f, 7.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.85f, 0.76f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.47f, 13.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, 1.92f)
                close()
            }
        }.also { _Interactive = it}
