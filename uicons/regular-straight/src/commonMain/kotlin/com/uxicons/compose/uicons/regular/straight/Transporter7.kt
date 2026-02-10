package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transporter7: ImageVector? = null

val Icons.Rs.Transporter7: ImageVector
    get() = _Transporter7 ?: UXIcon(name = "Transporter7") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 22f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 3.5f)
                lineToRelative(-2.33f, -1.17f)
                lineTo(3.5f, 0f)
                lineToRelative(-1.17f, 2.33f)
                lineTo(0f, 3.5f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                close()
                moveTo(21.5f, 14.5f)
                lineToRelative(-1f, -2.5f)
                lineToRelative(-1f, 2.5f)
                lineToRelative(-2.5f, 1f)
                lineToRelative(2.5f, 1f)
                lineToRelative(1f, 2.5f)
                lineToRelative(1f, -2.5f)
                lineToRelative(2.5f, -1f)
                lineToRelative(-2.5f, -1f)
                close()
            }
        }.also { _Transporter7 = it}
