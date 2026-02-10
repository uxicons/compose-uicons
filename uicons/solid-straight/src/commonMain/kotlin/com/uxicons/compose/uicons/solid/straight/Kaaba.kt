package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kaaba: ImageVector? = null

val Icons.Ss.Kaaba: ImageVector
    get() = _Kaaba ?: UXIcon(name = "Kaaba") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.0f, 5.46f)
                lineTo(12f, 0.16f)
                lineToRelative(10.0f, 5.3f)
                lineToRelative(-10.0f, 5.3f)
                lineTo(2.0f, 5.46f)
                close()
                moveTo(23f, 11.86f)
                verticalLineToRelative(6.15f)
                lineToRelative(-11f, 5.83f)
                lineTo(1f, 18.0f)
                verticalLineToRelative(-6.17f)
                lineToRelative(4f, 2.13f)
                verticalLineToRelative(-2.26f)
                lineToRelative(-4f, -2.13f)
                verticalLineToRelative(-2.37f)
                lineToRelative(11f, 5.83f)
                lineToRelative(11f, -5.83f)
                verticalLineToRelative(2.4f)
                lineToRelative(-4f, 2.19f)
                verticalLineToRelative(2.26f)
                lineToRelative(4f, -2.2f)
                close()
                moveTo(11f, 14.87f)
                lineToRelative(-4f, -2.12f)
                verticalLineToRelative(2.26f)
                lineToRelative(4f, 2.12f)
                verticalLineToRelative(-2.26f)
                close()
                moveTo(17f, 12.85f)
                lineToRelative(-4f, 2.04f)
                verticalLineToRelative(2.26f)
                lineToRelative(4f, -2.04f)
                verticalLineToRelative(-2.26f)
                close()
            }
        }.also { _Kaaba = it}
