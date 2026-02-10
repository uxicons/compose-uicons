package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Form: ImageVector? = null

val Icons.Rs.Form: ImageVector
    get() = _Form ?: UXIcon(name = "Form") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.83f, 3.41f)
                lineToRelative(-2.24f, -2.24f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, -1.17f)
                horizontalLineToRelative(-8.76f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-17.76f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, -2.83f)
                close()
                moveTo(18.41f, 4.83f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, 0.17f)
                horizontalLineToRelative(-2.56f)
                verticalLineToRelative(-2.56f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 0.14f)
                close()
                moveTo(5f, 22f)
                verticalLineToRelative(-19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _Form = it}
