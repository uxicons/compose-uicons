package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PingPong: ImageVector? = null

val Icons.Rr.PingPong: ImageVector
    get() = _PingPong ?: UXIcon(name = "PingPong") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.26f, 2.74f)
                arcTo(9.84f, 9.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.3f, 2.11f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.13f, 8.96f)
                arcToRelative(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.84f, 5.67f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.07f, 0.56f)
                lineTo(2f, 16.95f)
                arcTo(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.73f, 24f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, -0.03f)
                arcToRelative(3.71f, 3.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, -1.74f)
                lineToRelative(2.07f, -3.13f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.57f, -0.09f)
                arcToRelative(9.66f, 9.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, -2.15f)
                arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 9.76f)
                arcTo(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.26f, 2.74f)
                close()
                moveTo(2f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 4.5f)
                close()
                moveTo(10.44f, 17.23f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.02f, 0.63f)
                curveToRelative(-0.02f, 0.03f, -0.05f, 0.06f, -0.07f, 0.09f)
                lineTo(5.23f, 21.17f)
                arcTo(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.02f, 20f)
                arcToRelative(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, -1.31f)
                lineToRelative(3.04f, -1.83f)
                arcToRelative(0.96f, 0.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, -0.09f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, -3.02f)
                arcToRelative(7.33f, 7.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, -4.26f)
                lineToRelative(8.43f, 8.43f)
                arcTo(7.31f, 7.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.44f, 17.23f)
                close()
                moveTo(19.46f, 15.46f)
                arcToRelative(8.87f, 8.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.73f, 1.86f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.02f, -0.02f, -0.03f)
                lineTo(7.36f, 7.95f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4.5f)
                curveToRelative(0f, -0.12f, -0.03f, -0.23f, -0.04f, -0.35f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.88f, 0f)
                arcTo(7.42f, 7.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9.7f)
                arcTo(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.46f, 15.46f)
                close()
            }
        }.also { _PingPong = it}
