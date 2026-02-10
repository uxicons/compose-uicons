package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Baseball: ImageVector? = null

val Icons.Bs.Baseball: ImageVector
    get() = _Baseball ?: UXIcon(name = "Baseball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(3f, 12f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.69f, -5.23f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.28f, 1.57f)
                lineToRelative(-1.03f, 0.31f)
                lineToRelative(0.86f, 2.88f)
                lineToRelative(1.15f, -0.34f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, 0.81f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.05f, 0.81f)
                lineToRelative(-1.15f, -0.34f)
                lineToRelative(-0.86f, 2.88f)
                lineToRelative(1.03f, 0.31f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 1.57f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.69f, -5.23f)
                close()
                moveTo(6.81f, 19.34f)
                arcToRelative(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -2.81f)
                lineToRelative(1.52f, 0.45f)
                lineToRelative(0.86f, -2.88f)
                lineToRelative(-1.45f, -0.43f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, -1.68f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -1.68f)
                lineToRelative(1.45f, -0.43f)
                lineToRelative(-0.86f, -2.88f)
                lineToRelative(-1.52f, 0.45f)
                arcToRelative(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, -2.81f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.38f, 0f)
                arcToRelative(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, 2.81f)
                lineToRelative(-1.52f, -0.45f)
                lineToRelative(-0.86f, 2.88f)
                lineToRelative(1.45f, 0.43f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, 1.68f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, 1.68f)
                lineToRelative(-1.45f, 0.43f)
                lineToRelative(0.86f, 2.88f)
                lineToRelative(1.52f, -0.45f)
                arcToRelative(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, 2.81f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.38f, 0f)
                close()
                moveTo(19.31f, 17.23f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, -1.57f)
                lineToRelative(1.03f, -0.31f)
                lineToRelative(-0.86f, -2.88f)
                lineToRelative(-1.15f, 0.34f)
                arcToRelative(6.65f, 6.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.63f)
                lineToRelative(1.15f, 0.34f)
                lineToRelative(0.86f, -2.88f)
                lineToRelative(-1.03f, -0.31f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.28f, -1.57f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 10.45f)
                close()
            }
        }.also { _Baseball = it}
