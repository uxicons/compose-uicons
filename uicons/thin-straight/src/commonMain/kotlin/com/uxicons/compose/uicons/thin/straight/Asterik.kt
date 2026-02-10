package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Asterik: ImageVector? = null

val Icons.Ts.Asterik: ImageVector
    get() = _Asterik ?: UXIcon(name = "Asterik") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6.62f)
                lineToRelative(-5.64f, 3.48f)
                lineTo(0.21f, 15.75f)
                lineToRelative(6.08f, -3.75f)
                lineTo(0.21f, 8.25f)
                lineTo(3.36f, 3.15f)
                lineToRelative(5.64f, 3.48f)
                lineTo(9f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6.62f)
                lineToRelative(5.64f, -3.48f)
                lineToRelative(3.15f, 5.11f)
                lineToRelative(-6.08f, 3.75f)
                lineToRelative(6.08f, 3.75f)
                lineToRelative(-3.15f, 5.11f)
                lineToRelative(-5.64f, -3.48f)
                verticalLineToRelative(6.62f)
                close()
                moveTo(10f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7.42f)
                lineToRelative(6.31f, 3.9f)
                lineToRelative(2.1f, -3.4f)
                lineToRelative(-6.6f, -4.08f)
                lineToRelative(6.6f, -4.08f)
                lineToRelative(-2.1f, -3.4f)
                lineToRelative(-6.31f, 3.9f)
                lineTo(14f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(7.42f)
                lineToRelative(-6.31f, -3.9f)
                lineToRelative(-2.1f, 3.4f)
                lineToRelative(6.6f, 4.08f)
                lineToRelative(-6.6f, 4.08f)
                lineToRelative(2.1f, 3.4f)
                lineToRelative(6.31f, -3.9f)
                verticalLineToRelative(7.42f)
                close()
            }
        }.also { _Asterik = it}
