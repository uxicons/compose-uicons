package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeDelete: ImageVector? = null

val Icons.Br.TimeDelete: ImageVector
    get() = _TimeDelete ?: UXIcon(name = "TimeDelete") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.62f, 19.5f)
            lineToRelative(1.94f, -1.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineToRelative(-1.94f, 1.94f)
            lineToRelative(-1.94f, -1.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(1.94f, 1.94f)
            lineToRelative(-1.94f, 1.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(1.94f, -1.94f)
            lineToRelative(1.94f, 1.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.57f, 20.99f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.42f, -9.42f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -0.14f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12.56f, 12.56f)
            horizontalLineToRelative(0.07f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(3.56f)
            lineToRelative(-2.4f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, 2.07f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 0.47f)
            lineToRelative(2.87f, -1.8f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.94f, -1.7f)
            verticalLineToRelative(-4.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
    }.also { _TimeDelete = it }
