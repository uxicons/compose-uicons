package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skiing: ImageVector? = null

val Icons.Bs.Skiing: ImageVector
    get() = _Skiing ?: UXIcon(name = "Skiing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 2.5f)
                close()
                moveTo(21.28f, 20.21f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.01f, 0.7f)
                lineToRelative(-6.44f, -3.06f)
                lineToRelative(1.88f, -3.5f)
                lineToRelative(-2.25f, -1.62f)
                lineTo(15f, 9.32f)
                verticalLineToRelative(3.62f)
                lineToRelative(4.79f, 2.2f)
                lineToRelative(1.25f, -2.73f)
                lineTo(18f, 11.01f)
                lineTo(18f, 6.99f)
                lineTo(16.48f, 5.83f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.37f, 5f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.7f, 1.14f)
                lineTo(10.66f, 7.28f)
                lineTo(6.64f, 5.34f)
                lineToRelative(0.8f, -1.69f)
                lineTo(4.73f, 2.36f)
                lineToRelative(-0.79f, 1.67f)
                lineTo(2.17f, 3.17f)
                lineTo(0.89f, 5.88f)
                lineToRelative(1.77f, 0.85f)
                lineTo(1.81f, 8.52f)
                lineTo(4.52f, 9.8f)
                lineToRelative(0.83f, -1.75f)
                lineTo(8.62f, 9.63f)
                arcToRelative(3.21f, 3.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.39f, 4.28f)
                lineToRelative(1.82f, 1.33f)
                lineToRelative(-0.71f, 1.32f)
                lineToRelative(-8.84f, -4.2f)
                lineTo(0f, 15.07f)
                lineToRelative(17.99f, 8.55f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -2.11f)
                close()
            }
        }.also { _Skiing = it}
