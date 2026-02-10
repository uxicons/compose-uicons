package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShare: ImageVector? = null

val Icons.Ss.CloudShare: ImageVector
    get() = _CloudShare ?: UXIcon(name = "CloudShare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, -10.33f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, -3.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.79f, -1.79f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.52f, 1.82f)
                curveToRelative(-0.1f, -0.01f, -0.2f, -0.03f, -0.31f, -0.03f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.92f, 4.11f)
                lineToRelative(-0.85f, 0.42f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.23f, -0.53f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                close()
                moveTo(21f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, -3f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 0.36f)
                lineToRelative(-2.96f, 1.48f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.31f)
                lineToRelative(2.96f, 1.48f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, 0.36f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.92f, -2.16f)
                lineToRelative(-2.96f, -1.48f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, -0.36f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -0.36f)
                lineToRelative(2.96f, -1.48f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, 0.84f)
                close()
            }
        }.also { _CloudShare = it}
