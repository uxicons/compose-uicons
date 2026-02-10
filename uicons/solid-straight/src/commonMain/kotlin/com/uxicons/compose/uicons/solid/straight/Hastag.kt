package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hastag: ImageVector? = null

val Icons.Ss.Hastag: ImageVector
    get() = _Hastag ?: UXIcon(name = "Hastag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.77f, 9f)
                lineTo(24f, 7f)
                lineTo(18.05f, 7f)
                lineTo(18.9f, 0f)
                lineTo(16.88f, 0f)
                lineToRelative(-0.84f, 7f)
                lineTo(9.16f, 7f)
                lineTo(10f, 0f)
                lineTo(7.99f, 0f)
                lineTo(7.15f, 7f)
                lineTo(0.94f, 7f)
                lineTo(0.71f, 9f)
                horizontalLineToRelative(6.2f)
                lineToRelative(-0.72f, 6f)
                lineTo(0.23f, 15f)
                lineTo(0f, 17f)
                lineTo(5.95f, 17f)
                lineToRelative(-0.84f, 7f)
                lineTo(7.12f, 24f)
                lineToRelative(0.84f, -7f)
                horizontalLineToRelative(6.88f)
                lineTo(14f, 24f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.84f, -7f)
                horizontalLineToRelative(6.21f)
                lineToRelative(0.23f, -2f)
                horizontalLineToRelative(-6.2f)
                lineToRelative(0.72f, -6f)
                close()
                moveTo(15.08f, 15f)
                lineTo(8.2f, 15f)
                lineToRelative(0.72f, -6f)
                lineTo(15.8f, 9f)
                close()
            }
        }.also { _Hastag = it}
