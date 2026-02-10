package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePicnic: ImageVector? = null

val Icons.Ts.TablePicnic: ImageVector
    get() = _TablePicnic ?: UXIcon(name = "TablePicnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(-3.39f, -8f)
                horizontalLineToRelative(4.19f)
                verticalLineToRelative(-1f)
                lineTo(3f, 3f)
                verticalLineToRelative(1f)
                lineTo(7.19f, 4f)
                lineTo(3.81f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(1f)
                lineTo(3.39f, 13f)
                lineTo(0f, 21f)
                lineTo(1.09f, 21f)
                lineToRelative(3.39f, -8f)
                horizontalLineToRelative(15.06f)
                lineToRelative(3.39f, 8f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-3.39f, -8f)
                horizontalLineToRelative(3.39f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4.89f, 12f)
                lineToRelative(3.39f, -8f)
                horizontalLineToRelative(7.44f)
                lineToRelative(3.39f, 8f)
                lineTo(4.89f, 12f)
                close()
            }
        }.also { _TablePicnic = it}
