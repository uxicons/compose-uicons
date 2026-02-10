package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Rr.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.33f, 18.42f)
                curveToRelative(0.73f, 1.03f, 1.67f, 2.23f, 1.67f, 3.08f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                curveToRelative(0f, -0.78f, 0.96f, -2.01f, 1.69f, -3.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, -0.01f)
                close()
                moveTo(21.45f, 13.86f)
                lineTo(12.78f, 22.54f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineToRelative(-4.24f, -4.24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.07f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(-2.86f, -2.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, -1.41f)
                lineToRelative(2.85f, 2.88f)
                lineToRelative(1.55f, -1.55f)
                lineToRelative(-0.84f, -0.84f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(13f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                close()
                moveTo(20.04f, 12.45f)
                lineTo(11.55f, 3.96f)
                lineTo(9.99f, 5.52f)
                lineTo(14.71f, 10.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.42f, 1.4f)
                lineToRelative(-4.71f, -4.76f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(4.24f, 4.24f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                close()
            }
        }.also { _Fill = it}
