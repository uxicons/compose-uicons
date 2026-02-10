package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Games: ImageVector? = null

val Icons.Ss.Games: ImageVector
    get() = _Games ?: UXIcon(name = "Games") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                close()
                moveTo(7.93f, 8.52f)
                lineTo(18.23f, 18.82f)
                arcToRelative(10.82f, 10.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.64f, -1.94f)
                arcToRelative(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, -7.12f)
                arcToRelative(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.73f, -7.02f)
                arcToRelative(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.87f, -1.35f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.47f, 7.13f)
                close()
                moveTo(6.17f, 9.59f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.14f, 0.41f)
                arcToRelative(10.62f, 10.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, 5f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 0.58f)
                lineToRelative(-3.72f, 2.58f)
                arcToRelative(3.36f, 3.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.28f, 2.41f)
                arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 2.15f)
                lineToRelative(0.45f, 0.42f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, 0.86f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, -1.08f)
                lineToRelative(2.74f, -3.92f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -0.12f)
                arcToRelative(10.44f, 10.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 0.74f)
                close()
            }
        }.also { _Games = it}
