package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShare: ImageVector? = null

val Icons.Rs.CloudShare: ImageVector
    get() = _CloudShare ?: UXIcon(name = "CloudShare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 17f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, 0.84f)
                lineToRelative(-2.96f, -1.48f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, -0.36f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -0.36f)
                lineToRelative(2.96f, -1.48f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.92f, -2.16f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 0.36f)
                lineToRelative(-2.96f, 1.48f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.31f)
                lineToRelative(2.96f, 1.48f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, 0.36f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -3f)
                close()
                moveTo(21f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(13f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(21f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 21f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -6.87f)
                lineToRelative(1.44f, -0.37f)
                lineToRelative(-0.88f, -1.19f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.18f, -3.56f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, -0.8f)
                lineToRelative(0.1f, 0.74f)
                lineToRelative(1.75f, -1.75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.79f, 1.81f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(10.5f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, -0.07f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -1.94f)
                curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, 0f)
                close()
            }
        }.also { _CloudShare = it}
