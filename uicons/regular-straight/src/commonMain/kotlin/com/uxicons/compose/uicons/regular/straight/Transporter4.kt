package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transporter4: ImageVector? = null

val Icons.Rs.Transporter4: ImageVector
    get() = _Transporter4 ?: UXIcon(name = "Transporter4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.67f, 17.69f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(-2.33f, 1.17f)
                close()
                moveTo(21.5f, 2.5f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                close()
                moveTo(4f, 24f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(17f, 12f)
                lineTo(7f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Transporter4 = it}
