package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Ss.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.58f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.09f, -2.55f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.91f, 2.47f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.39f)
                lineToRelative(-3.12f, 3.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, 2.68f)
                arcToRelative(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 1.64f)
                lineToRelative(5.05f, 5.04f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-13.81f)
                lineToRelative(-9f, -2.01f)
                close()
            }
        }.also { _CursorFinger = it}
