package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Password: ImageVector? = null

val Icons.Bs.Password: ImageVector
    get() = _Password ?: UXIcon(name = "Password") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(13.44f, 5.94f)
                lineTo(12f, 7.38f)
                lineTo(10.56f, 5.94f)
                lineTo(8.44f, 8.06f)
                lineTo(9.88f, 9.5f)
                lineTo(8.44f, 10.94f)
                lineTo(10.56f, 13.06f)
                lineTo(12f, 11.62f)
                lineTo(13.44f, 13.06f)
                lineTo(15.56f, 10.94f)
                lineTo(14.12f, 9.5f)
                lineTo(15.56f, 8.06f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(23.56f, 8.06f)
                lineTo(21.44f, 5.94f)
                lineTo(20f, 7.38f)
                lineTo(18.56f, 5.94f)
                lineTo(16.44f, 8.06f)
                lineTo(17.88f, 9.5f)
                lineTo(16.44f, 10.94f)
                lineTo(18.56f, 13.06f)
                lineTo(20f, 11.62f)
                lineTo(21.44f, 13.06f)
                lineTo(23.56f, 10.94f)
                lineTo(22.12f, 9.5f)
                close()
                moveTo(1f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(5.44f, 5.94f)
                lineTo(4f, 7.38f)
                lineTo(2.56f, 5.94f)
                lineTo(0.44f, 8.06f)
                lineTo(1.88f, 9.5f)
                lineTo(0.44f, 10.94f)
                lineTo(2.56f, 13.06f)
                lineTo(4f, 11.62f)
                lineTo(5.44f, 13.06f)
                lineTo(7.56f, 10.94f)
                lineTo(6.12f, 9.5f)
                lineTo(7.56f, 8.06f)
                close()
            }
        }.also { _Password = it}
