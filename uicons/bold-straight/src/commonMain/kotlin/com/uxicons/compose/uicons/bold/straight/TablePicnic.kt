package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePicnic: ImageVector? = null

val Icons.Bs.TablePicnic: ImageVector
    get() = _TablePicnic ?: UXIcon(name = "TablePicnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(-2.54f, -6f)
                horizontalLineToRelative(3.35f)
                lineTo(21f, 3f)
                lineTo(3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.35f)
                lineToRelative(-2.54f, 6f)
                lineTo(0f, 12f)
                verticalLineToRelative(3f)
                lineTo(2.54f, 15f)
                lineTo(0f, 21f)
                lineTo(3f, 21f)
                lineToRelative(2.54f, -6f)
                horizontalLineToRelative(12.92f)
                lineToRelative(2.54f, 6f)
                horizontalLineToRelative(3f)
                lineToRelative(-2.54f, -6f)
                horizontalLineToRelative(2.54f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6.81f, 12f)
                lineToRelative(2.54f, -6f)
                horizontalLineToRelative(5.31f)
                lineToRelative(2.54f, 6f)
                lineTo(6.81f, 12f)
                close()
            }
        }.also { _TablePicnic = it}
