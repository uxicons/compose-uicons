package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transporter5: ImageVector? = null

val Icons.Rs.Transporter5: ImageVector
    get() = _Transporter5 ?: UXIcon(name = "Transporter5") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16.52f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                close()
                moveTo(6.5f, 3.5f)
                lineToRelative(-2f, -1f)
                lineTo(3.5f, 0.5f)
                lineToRelative(-1f, 2f)
                lineTo(0.5f, 3.5f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                close()
                moveTo(4f, 24.02f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                lineTo(4f, 22.02f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 14.02f)
                verticalLineToRelative(-2f)
                lineTo(7f, 12.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(18f, 7.02f)
                lineTo(6f, 7.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 2.02f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Transporter5 = it}
