package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShare: ImageVector? = null

val Icons.Bs.CloudShare: ImageVector
    get() = _CloudShare ?: UXIcon(name = "CloudShare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.35f, 19f)
                horizontalLineToRelative(-2.55f)
                arcToRelative(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.8f, -2.77f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.22f, -2.79f)
                lineToRelative(2.17f, -0.56f)
                lineToRelative(-1.33f, -1.79f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.02f, -3.05f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.06f, -5.03f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.13f, 4.46f)
                lineToRelative(0.15f, 1.14f)
                lineToRelative(2.61f, -2.6f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.88f, -6f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.06f, 8.03f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 3.27f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.72f, 4.92f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.8f, 5.78f)
                horizontalLineToRelative(4.9f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.35f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0.42f)
                lineToRelative(-2.48f, -1.42f)
                lineToRelative(2.48f, -1.42f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, -3.01f)
                lineToRelative(-2.5f, 1.43f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -0.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -0.42f)
                lineToRelative(2.5f, 1.43f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -3.01f)
                close()
            }
        }.also { _CloudShare = it}
