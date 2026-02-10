package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorPlus: ImageVector? = null

val Icons.Bs.CursorPlus: ImageVector
    get() = _CursorPlus ?: UXIcon(name = "CursorPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 7f)
                arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.5f, 8.5f)
                arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.5f, -8.5f)
                close()
                moveTo(15.5f, 21f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, -5.5f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7.18f, 7.18f)
                lineTo(4.45f, 13f)
                lineTo(0f, 0f)
                lineTo(13f, 4.45f)
                close()
            }
        }.also { _CursorPlus = it}
