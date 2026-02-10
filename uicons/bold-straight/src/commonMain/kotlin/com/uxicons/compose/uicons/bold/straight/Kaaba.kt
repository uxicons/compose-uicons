package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kaaba: ImageVector? = null

val Icons.Bs.Kaaba: ImageVector
    get() = _Kaaba ?: UXIcon(name = "Kaaba") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0.13f)
                lineTo(1f, 5.96f)
                verticalLineToRelative(12.07f)
                lineToRelative(11f, 5.83f)
                lineToRelative(11f, -5.83f)
                lineTo(23f, 5.96f)
                lineTo(12f, 0.13f)
                close()
                moveTo(18.3f, 6.87f)
                lineToRelative(-6.3f, 3.34f)
                lineToRelative(-6.3f, -3.34f)
                lineToRelative(6.3f, -3.34f)
                lineToRelative(6.3f, 3.34f)
                close()
                moveTo(12f, 20.47f)
                lineToRelative(-8f, -4.24f)
                verticalLineToRelative(-2.81f)
                lineToRelative(3f, 1.6f)
                verticalLineToRelative(-2.26f)
                lineToRelative(-3f, -1.6f)
                verticalLineToRelative(-1.79f)
                lineToRelative(8f, 4.24f)
                lineToRelative(8f, -4.24f)
                verticalLineToRelative(1.82f)
                lineToRelative(-3f, 1.58f)
                verticalLineToRelative(2.26f)
                lineToRelative(3f, -1.58f)
                verticalLineToRelative(2.79f)
                lineToRelative(-8f, 4.24f)
                close()
                moveTo(12f, 15.4f)
                lineToRelative(3f, -1.59f)
                verticalLineToRelative(2.26f)
                lineToRelative(-3f, 1.59f)
                lineToRelative(-3f, -1.59f)
                verticalLineToRelative(-2.26f)
                lineToRelative(3f, 1.59f)
                close()
            }
        }.also { _Kaaba = it}
