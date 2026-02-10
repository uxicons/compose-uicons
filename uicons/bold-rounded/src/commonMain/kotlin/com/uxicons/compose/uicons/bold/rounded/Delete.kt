package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Br.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.56f, 10.56f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            close()
            moveTo(24f, 7f)
            verticalLineToRelative(10f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
            horizontalLineToRelative(-9.02f)
            arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.37f, -2.16f)
            lineToRelative(-5.3f, -6.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.82f)
            lineToRelative(5.3f, -6.93f)
            arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.37f, -2.16f)
            horizontalLineToRelative(9.02f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
            close()
            moveTo(21f, 7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
            horizontalLineToRelative(-9.02f)
            arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, 0.98f)
            lineToRelative(-4.6f, 6.02f)
            lineToRelative(4.6f, 6.02f)
            arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, 0.98f)
            horizontalLineToRelative(9.02f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
            close()
        }
    }.also { _Delete = it }
