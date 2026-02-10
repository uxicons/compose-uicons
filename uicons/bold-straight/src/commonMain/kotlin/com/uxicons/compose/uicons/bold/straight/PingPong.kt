package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PingPong: ImageVector? = null

val Icons.Bs.PingPong: ImageVector
    get() = _PingPong ?: UXIcon(name = "PingPong") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.23f, 2.77f)
                arcTo(9.89f, 9.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.73f, 1.7f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.7f, 8.2f)
                arcTo(11.37f, 11.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.08f, 15f)
                arcTo(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15.58f)
                lineTo(1.28f, 18.15f)
                arcTo(3.36f, 3.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 20.57f)
                arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 2.15f)
                lineToRelative(0.45f, 0.42f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.38f, 24f)
                arcToRelative(3.26f, 3.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, -1.08f)
                lineTo(8.4f, 19f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -0.12f)
                arcTo(10.37f, 10.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 20f)
                curveToRelative(0.5f, 0f, 1.81f, -0.18f, 1.84f, -0.19f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.52f, -2.77f)
                arcTo(10.56f, 10.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 9.88f)
                arcTo(9.52f, 9.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.23f, 2.77f)
                close()
                moveTo(5f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                close()
                moveTo(18.74f, 14.92f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 1.84f)
                lineTo(7.75f, 9.17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 5f)
                curveToRelative(0f, -0.16f, -0.03f, -0.32f, -0.05f, -0.48f)
                arcTo(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.1f, 4.9f)
                arcTo(6.54f, 6.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.79f)
                arcTo(7.59f, 7.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.74f, 14.92f)
                close()
            }
        }.also { _PingPong = it}
