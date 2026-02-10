package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Baseball: ImageVector? = null

val Icons.Rs.Baseball: ImageVector
    get() = _Baseball ?: UXIcon(name = "Baseball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(17.81f, 15.48f)
                lineTo(19.58f, 14.96f)
                lineTo(19.01f, 13.04f)
                lineTo(17.17f, 13.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.17f, -1.59f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -1.59f)
                lineToRelative(1.83f, 0.55f)
                lineToRelative(0.57f, -1.92f)
                lineToRelative(-1.77f, -0.53f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, -2.65f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.27f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, -2.65f)
                close()
                moveTo(4.12f, 5.86f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, 2.65f)
                lineToRelative(-1.77f, 0.53f)
                lineToRelative(0.57f, 1.92f)
                lineToRelative(1.83f, -0.55f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 1.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.17f, 1.59f)
                lineToRelative(-1.83f, -0.55f)
                lineToRelative(-0.57f, 1.92f)
                lineToRelative(1.77f, 0.53f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 2.65f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.27f)
                close()
                moveTo(5.51f, 19.59f)
                arcToRelative(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.61f, -3.53f)
                lineToRelative(2.05f, 0.61f)
                lineToRelative(0.57f, -1.92f)
                lineToRelative(-1.99f, -0.6f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -2.16f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -2.16f)
                lineToRelative(1.99f, -0.6f)
                lineToRelative(-0.57f, -1.92f)
                lineToRelative(-2.05f, 0.61f)
                arcToRelative(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -3.52f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.99f, 0f)
                arcToRelative(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, 3.53f)
                lineToRelative(-2.05f, -0.61f)
                lineToRelative(-0.57f, 1.92f)
                lineToRelative(1.99f, 0.6f)
                arcToRelative(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.32f)
                lineToRelative(-1.99f, 0.6f)
                lineToRelative(0.57f, 1.92f)
                lineToRelative(2.05f, -0.61f)
                arcToRelative(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.61f, 3.53f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.99f, 0f)
                close()
            }
        }.also { _Baseball = it}
