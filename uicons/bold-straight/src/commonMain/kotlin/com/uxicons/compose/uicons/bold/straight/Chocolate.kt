package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chocolate: ImageVector? = null

val Icons.Bs.Chocolate: ImageVector
    get() = _Chocolate ?: UXIcon(name = "Chocolate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7.07f)
                lineTo(16.93f, 1f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.82f, 0f)
                lineTo(1f, 12.11f)
                arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.82f)
                lineTo(7.07f, 23f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, 0f)
                lineTo(23f, 11.9f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 7.07f)
                close()
                moveTo(14.23f, 3.12f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, 0f)
                lineToRelative(1.95f, 1.95f)
                lineTo(14.22f, 7.6f)
                lineTo(11.98f, 5.36f)
                close()
                moveTo(9.72f, 12.1f)
                lineTo(7.48f, 9.86f)
                lineToRelative(2.38f, -2.38f)
                lineTo(12.1f, 9.72f)
                close()
                moveTo(14.22f, 11.84f)
                lineTo(16.52f, 14.14f)
                lineTo(14.14f, 16.52f)
                lineTo(11.84f, 14.22f)
                close()
                moveTo(3.12f, 14.23f)
                lineTo(5.36f, 11.98f)
                lineTo(7.6f, 14.22f)
                lineTo(5.07f, 16.75f)
                lineTo(3.12f, 14.81f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.12f, 14.23f)
                close()
                moveTo(9.77f, 20.88f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, 0f)
                lineTo(7.19f, 18.87f)
                lineToRelative(2.53f, -2.53f)
                lineToRelative(2.3f, 2.3f)
                close()
                moveTo(20.88f, 9.77f)
                lineToRelative(-2.24f, 2.24f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(2.53f, -2.53f)
                lineToRelative(2.01f, 2.01f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.88f, 9.77f)
                close()
            }
        }.also { _Chocolate = it}
