package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thumbtack: ImageVector? = null

val Icons.Sr.Thumbtack: ImageVector
    get() = _Thumbtack ?: UXIcon(name = "Thumbtack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 6.74f)
                lineTo(17.33f, 0.8f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.04f, 0.45f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.32f, 3.81f)
                lineToRelative(0.59f, 0.59f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.14f)
                lineToRelative(-2.1f, 2.1f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, 0.39f)
                lineToRelative(-0.82f, -0.21f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, -0.22f)
                arcToRelative(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.84f, 2.26f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, 3.68f)
                lineTo(6.78f, 15.8f)
                lineTo(0.29f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(8.17f, 17.24f)
                lineToRelative(1.25f, 1.29f)
                arcTo(4.67f, 4.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.68f, 20f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, -0.2f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, -2.7f)
                arcToRelative(8.09f, 8.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -2.87f)
                lineTo(15.53f, 13.2f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, -1.41f)
                lineTo(18.02f, 9.7f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.59f, -0.24f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.52f, 0.22f)
                lineToRelative(0.51f, 0.51f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.32f, 0.37f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -3.81f)
                close()
            }
        }.also { _Thumbtack = it}
