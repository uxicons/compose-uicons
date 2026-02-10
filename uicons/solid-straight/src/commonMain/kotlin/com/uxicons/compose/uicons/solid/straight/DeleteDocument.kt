package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Ss.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
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
                moveTo(13.41f, 15f)
                lineTo(15.96f, 12.46f)
                lineTo(14.54f, 11.04f)
                lineTo(12f, 13.59f)
                lineTo(9.46f, 11.04f)
                lineTo(8.04f, 12.46f)
                lineTo(10.59f, 15f)
                lineTo(8.04f, 17.54f)
                lineTo(9.46f, 18.96f)
                lineTo(12f, 16.41f)
                lineTo(14.54f, 18.96f)
                lineTo(15.96f, 17.54f)
                close()
            }
        }.also { _DeleteDocument = it}
