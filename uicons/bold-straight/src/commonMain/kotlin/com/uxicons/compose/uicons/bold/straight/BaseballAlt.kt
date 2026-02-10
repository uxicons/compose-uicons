package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballAlt: ImageVector? = null

val Icons.Bs.BaseballAlt: ImageVector
    get() = _BaseballAlt ?: UXIcon(name = "BaseballAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.62f, 8.07f)
                arcToRelative(4.73f, 4.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.68f, -6.68f)
                lineTo(12.89f, 4.43f)
                arcToRelative(32.69f, 32.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.7f, 5.94f)
                arcTo(18.97f, 18.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.03f, 12.7f)
                arcToRelative(10.3f, 10.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 1.42f)
                lineToRelative(-3.3f, 3.3f)
                lineTo(2.12f, 16.5f)
                lineTo(0f, 18.62f)
                lineTo(5.38f, 24f)
                lineTo(7.5f, 21.88f)
                lineToRelative(-0.92f, -0.92f)
                lineTo(9.74f, 17.8f)
                arcToRelative(11.43f, 11.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, -0.8f)
                arcToRelative(20.31f, 20.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, -1.26f)
                arcToRelative(32.64f, 32.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, -4.49f)
                close()
                moveTo(12.23f, 13.21f)
                arcToRelative(10.53f, 10.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.05f, 0.57f)
                lineToRelative(-0.93f, -0.93f)
                arcToRelative(9.77f, 9.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, -0.9f)
                arcToRelative(29.7f, 29.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.27f, -5.39f)
                lineToRelative(3.04f, -3.04f)
                arcTo(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 5.95f)
                lineToRelative(-3.18f, 3.18f)
                arcTo(29.58f, 29.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.23f, 13.21f)
                close()
                moveTo(24f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21f)
                close()
            }
        }.also { _BaseballAlt = it}
