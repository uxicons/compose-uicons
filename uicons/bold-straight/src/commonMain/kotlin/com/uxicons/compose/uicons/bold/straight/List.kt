package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _List: ImageVector? = null

val Icons.Bs.List: ImageVector
    get() = _List ?: UXIcon(name = "List") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 4f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 18f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 5.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 12f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 19f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
        }.also { _List = it}
