package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicFile: ImageVector? = null

val Icons.Sr.MusicFile: ImageVector
    get() = _MusicFile ?: UXIcon(name = "MusicFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 7f)
                verticalLineToRelative(-6.54f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(21.98f, 10f)
                horizontalLineToRelative(-6.98f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-6.98f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineToRelative(-8.52f)
                curveToRelative(0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.48f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.5f, -2.5f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.05f)
                verticalLineToRelative(-2.05f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _MusicFile = it}
