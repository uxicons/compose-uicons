package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AsseptDocument: ImageVector? = null

val Icons.Rs.AsseptDocument: ImageVector
    get() = _AsseptDocument ?: UXIcon(name = "AsseptDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.41f, 0f)
                horizontalLineToRelative(-9.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-16.41f)
                close()
                moveTo(15f, 3.41f)
                lineTo(18.59f, 7f)
                horizontalLineToRelative(-3.59f)
                close()
                moveTo(4f, 22f)
                verticalLineToRelative(-19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                close()
                moveTo(15.29f, 13.12f)
                lineTo(16.71f, 14.54f)
                lineTo(13.12f, 18.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.59f, 1.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                close()
            }
        }.also { _AsseptDocument = it}
