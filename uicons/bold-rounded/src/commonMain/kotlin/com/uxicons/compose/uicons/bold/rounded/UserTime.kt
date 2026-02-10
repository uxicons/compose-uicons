package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTime: ImageVector? = null

val Icons.Br.UserTime: ImageVector
    get() = _UserTime ?: UXIcon(name = "UserTime") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.47f, 0f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.5f, 5.5f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, -5.5f)
            close()
            moveTo(8.47f, 8f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.97f, 14.35f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, 1.76f)
            arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.79f, 5.82f)
            verticalLineToRelative(0.57f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-0.57f)
            arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.21f, -8.76f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.76f, 1.19f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 10f)
            arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 7f)
            arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
            close()
            moveTo(20.24f, 20.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.37f, 0.32f)
            lineToRelative(-2.44f, -2.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, -1.06f)
            verticalLineToRelative(-3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(2.88f)
            lineToRelative(1.94f, 1.94f)
            arcToRelative(1.56f, 1.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.31f, 1.87f)
            close()
        }
    }.also { _UserTime = it }
