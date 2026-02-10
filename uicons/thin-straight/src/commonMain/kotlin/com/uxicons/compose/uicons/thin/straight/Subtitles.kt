package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subtitles: ImageVector? = null

val Icons.Ts.Subtitles: ImageVector
    get() = _Subtitles ?: UXIcon(name = "Subtitles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 1.99f)
                lineTo(2.5f, 1.99f)
                curveTo(1.12f, 1.99f, 0f, 3.11f, 0f, 4.49f)
                lineTo(0f, 21.99f)
                lineTo(24f, 21.99f)
                lineTo(24f, 4.49f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 20.99f)
                lineTo(1f, 20.99f)
                lineTo(1f, 4.49f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 2.99f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 20.99f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                lineTo(9f, 13f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                close()
                moveTo(4f, 16f)
                lineTo(15f, 16f)
                verticalLineToRelative(1f)
                lineTo(4f, 17f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Subtitles = it}
