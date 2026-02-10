package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _List: ImageVector? = null

val Icons.Ss.List: ImageVector
    get() = _List ?: UXIcon(name = "List") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 4f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 18f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 19f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _List = it}
