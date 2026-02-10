package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notebook: ImageVector? = null

val Icons.Bs.Notebook: ImageVector
    get() = _Notebook ?: UXIcon(name = "Notebook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(18.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, -3.5f)
                verticalLineToRelative(-18.5f)
                close()
                moveTo(19f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(14f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Notebook = it}
