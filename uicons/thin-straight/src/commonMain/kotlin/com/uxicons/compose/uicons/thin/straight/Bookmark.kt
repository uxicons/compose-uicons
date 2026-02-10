package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Ts.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(2.12f, 0f, 1f, 1.12f, 1f, 2.5f)
                lineTo(1f, 24.0f)
                lineTo(12f, 13.05f)
                lineToRelative(11f, 10.94f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(22f, 21.59f)
                lineTo(12f, 11.64f)
                lineTo(2f, 21.59f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(20.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(22f, 21.59f)
                close()
            }
        }.also { _Bookmark = it}
