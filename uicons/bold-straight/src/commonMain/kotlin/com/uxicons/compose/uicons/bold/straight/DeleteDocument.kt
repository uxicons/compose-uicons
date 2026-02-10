package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Bs.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.06f, 12.06f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(1.94f, -1.94f)
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
        }.also { _DeleteDocument = it}
