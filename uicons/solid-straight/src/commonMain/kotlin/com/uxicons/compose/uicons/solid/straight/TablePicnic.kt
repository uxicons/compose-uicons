package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePicnic: ImageVector? = null

val Icons.Ss.TablePicnic: ImageVector
    get() = _TablePicnic ?: UXIcon(name = "TablePicnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(-2.96f, -7f)
                horizontalLineToRelative(3.77f)
                lineTo(21f, 3f)
                lineTo(3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.77f)
                lineToRelative(-2.96f, 7f)
                lineTo(0f, 12f)
                verticalLineToRelative(2f)
                lineTo(2.96f, 14f)
                lineTo(0f, 21f)
                lineTo(2.17f, 21f)
                lineToRelative(2.96f, -7f)
                horizontalLineToRelative(13.73f)
                lineToRelative(2.96f, 7f)
                horizontalLineToRelative(2.17f)
                lineToRelative(-2.96f, -7f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5.98f, 12f)
                lineToRelative(2.96f, -7f)
                horizontalLineToRelative(6.12f)
                lineToRelative(2.96f, 7f)
                lineTo(5.98f, 12f)
                close()
            }
        }.also { _TablePicnic = it}
