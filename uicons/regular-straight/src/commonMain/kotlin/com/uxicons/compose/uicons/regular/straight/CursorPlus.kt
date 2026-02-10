package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorPlus: ImageVector? = null

val Icons.Rs.CursorPlus: ImageVector
    get() = _CursorPlus ?: UXIcon(name = "CursorPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 8f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                close()
                moveTo(16f, 22f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(0.14f, 0.14f)
                lineTo(4.85f, 13.91f)
                lineTo(7.75f, 7.75f)
                lineTo(13.91f, 4.85f)
                close()
                moveTo(6.24f, 6.24f)
                lineTo(5.15f, 8.59f)
                lineTo(3.36f, 3.36f)
                lineTo(8.59f, 5.15f)
                close()
            }
        }.also { _CursorPlus = it}
