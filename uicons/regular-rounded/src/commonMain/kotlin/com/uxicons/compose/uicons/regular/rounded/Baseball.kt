package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Baseball: ImageVector? = null

val Icons.Rr.Baseball: ImageVector
    get() = _Baseball ?: UXIcon(name = "Baseball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(19.88f, 18.14f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.04f, -2.59f)
                lineToRelative(1.53f, -0.61f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.74f, -1.86f)
                lineToRelative(-1.45f, 0.58f)
                arcToRelative(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.3f)
                lineToRelative(1.45f, 0.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.74f, -1.86f)
                lineToRelative(-1.53f, -0.61f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.04f, -2.59f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.27f)
                close()
                moveTo(4.12f, 5.86f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.04f, 2.59f)
                lineToRelative(-1.53f, 0.61f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 1.86f)
                lineToRelative(1.45f, -0.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, 1.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.18f, 1.65f)
                lineToRelative(-1.45f, -0.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.74f, 1.86f)
                lineToRelative(1.53f, 0.61f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.04f, 2.59f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.27f)
                close()
                moveTo(5.51f, 19.59f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, -3.31f)
                lineToRelative(1.61f, 0.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.74f, -1.86f)
                lineToRelative(-1.67f, -0.67f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -2.4f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -2.4f)
                lineToRelative(1.67f, -0.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.74f, -1.86f)
                lineToRelative(-1.61f, 0.65f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.51f, -3.31f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.99f, 0f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.51f, 3.31f)
                lineToRelative(-1.61f, -0.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.74f, 1.86f)
                lineToRelative(1.67f, 0.67f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.81f)
                lineToRelative(-1.67f, 0.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 1.86f)
                lineToRelative(1.61f, -0.65f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, 3.31f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.99f, 0f)
                close()
            }
        }.also { _Baseball = it}
