package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Br.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.58f, 9.05f)
            lineToRelative(-3.58f, -0.72f)
            verticalLineToRelative(-4.34f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
            verticalLineToRelative(4.45f)
            lineToRelative(-3.72f, 4.52f)
            arcToRelative(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 7.17f)
            lineToRelative(2.2f, 2.22f)
            arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.91f, 1.63f)
            horizontalLineToRelative(7.85f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, -5.5f)
            verticalLineToRelative(-4.05f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.42f, -5.39f)
            close()
            moveTo(19f, 18.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            horizontalLineToRelative(-7.85f)
            arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.78f, -0.74f)
            lineToRelative(-2.2f, -2.23f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -3.12f)
            lineToRelative(1.42f, -1.73f)
            verticalLineToRelative(3.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-12.5f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            verticalLineToRelative(5.57f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, 1.47f)
            lineToRelative(4.78f, 0.96f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.01f, 2.45f)
            close()
        }
    }.also { _CursorFinger = it }
