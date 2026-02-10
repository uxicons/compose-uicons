package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chocolate: ImageVector? = null

val Icons.Rs.Chocolate: ImageVector
    get() = _Chocolate ?: UXIcon(name = "Chocolate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 7.24f)
                lineTo(16.76f, 0.88f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(0.88f, 12.52f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(6.36f, 6.36f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(23.12f, 11.48f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                close()
                moveTo(13.93f, 2.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineToRelative(2.44f, 2.44f)
                lineTo(15.46f, 7.06f)
                lineToRelative(-3.15f, -3.15f)
                close()
                moveTo(11.97f, 13.38f)
                lineTo(15.18f, 16.6f)
                lineToRelative(-2.08f, 2.08f)
                lineTo(9.89f, 15.46f)
                close()
                moveTo(8.48f, 14.04f)
                lineTo(5.33f, 10.9f)
                lineTo(7.4f, 8.82f)
                lineToRelative(3.15f, 3.15f)
                close()
                moveTo(13.38f, 11.97f)
                lineTo(15.45f, 9.89f)
                lineTo(18.67f, 13.11f)
                lineTo(16.6f, 15.18f)
                close()
                moveTo(11.96f, 10.55f)
                lineTo(8.82f, 7.4f)
                lineTo(10.9f, 5.33f)
                lineToRelative(3.15f, 3.15f)
                close()
                moveTo(2f, 14.64f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -0.71f)
                lineToRelative(1.62f, -1.62f)
                lineToRelative(3.15f, 3.15f)
                lineTo(4.74f, 17.79f)
                lineTo(2.29f, 15.34f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14.64f)
                close()
                moveTo(10.07f, 21.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineTo(6.15f, 19.2f)
                lineToRelative(2.33f, -2.33f)
                lineToRelative(3.21f, 3.21f)
                close()
                moveTo(21.71f, 10.07f)
                lineToRelative(-1.62f, 1.62f)
                lineTo(16.87f, 8.48f)
                lineTo(19.2f, 6.15f)
                lineToRelative(2.51f, 2.51f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                close()
            }
        }.also { _Chocolate = it}
