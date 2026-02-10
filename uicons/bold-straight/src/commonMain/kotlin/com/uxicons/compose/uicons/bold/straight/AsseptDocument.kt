package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AsseptDocument: ImageVector? = null

val Icons.Bs.AsseptDocument: ImageVector
    get() = _AsseptDocument ?: UXIcon(name = "AsseptDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.94f, 11.27f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.59f, 3.59f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.95f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0f)
                close()
                moveTo(22f, 5.88f)
                verticalLineToRelative(18.12f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(11.12f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(18f)
                close()
            }
        }.also { _AsseptDocument = it}
