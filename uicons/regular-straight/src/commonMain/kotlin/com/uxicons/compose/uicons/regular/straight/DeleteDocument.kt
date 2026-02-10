package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Rs.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
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
                moveTo(15.96f, 12.46f)
                lineTo(13.41f, 15f)
                lineTo(15.96f, 17.54f)
                lineTo(14.54f, 18.96f)
                lineTo(12f, 16.41f)
                lineTo(9.46f, 18.96f)
                lineTo(8.04f, 17.54f)
                lineTo(10.59f, 15f)
                lineTo(8.04f, 12.46f)
                lineTo(9.46f, 11.04f)
                lineTo(12f, 13.59f)
                lineTo(14.54f, 11.04f)
                close()
            }
        }.also { _DeleteDocument = it}
