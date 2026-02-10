package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Form: ImageVector? = null

val Icons.Bs.Form: ImageVector
    get() = _Form ?: UXIcon(name = "Form") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.68f, 3.56f)
                lineToRelative(-2.24f, -2.24f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.18f, -1.32f)
                horizontalLineToRelative(-9.76f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17.26f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, -3.18f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-17.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _Form = it}
