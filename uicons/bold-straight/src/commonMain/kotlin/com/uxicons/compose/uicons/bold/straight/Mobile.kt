package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mobile: ImageVector? = null

val Icons.Bs.Mobile: ImageVector
    get() = _Mobile ?: UXIcon(name = "Mobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                horizontalLineToRelative(-13f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-17.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(8f, 15f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(14.55f, 5.73f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.08f, -0.06f)
                lineToRelative(-0.67f, 1.49f)
                arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 3.71f)
                verticalLineToRelative(2.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.13f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -3.71f)
                close()
            }
        }.also { _Mobile = it}
