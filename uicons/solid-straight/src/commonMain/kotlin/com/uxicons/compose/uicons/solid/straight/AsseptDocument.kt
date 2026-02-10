package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AsseptDocument: ImageVector? = null

val Icons.Ss.AsseptDocument: ImageVector
    get() = _AsseptDocument ?: UXIcon(name = "AsseptDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(16.61f, 13.54f)
                lineTo(15.2f, 12.12f)
                lineTo(11.61f, 15.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                close()
            }
        }.also { _AsseptDocument = it}
