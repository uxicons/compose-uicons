package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Users: ImageVector? = null

val Icons.Br.Users: ImageVector
    get() = _Users ?: UXIcon(name = "Users") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.5f, 13f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
            close()
            moveTo(7.5f, 7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(15f, 22.5f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(24f, 18f)
            arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.46f, -5.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.91f, 2.31f)
            arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.54f, -0.91f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(17.5f, 9f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
            close()
            moveTo(17.5f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
    }.also { _Users = it }
