package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Ts.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(3f, 24f)
                lineTo(21f, 24f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.06f, 2.11f)
                lineToRelative(7.32f, 9.9f)
                lineToRelative(-7.38f, 9.97f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.14f, 0.02f, -0.26f, 0.06f, -0.39f)
                close()
                moveTo(12f, 12.85f)
                lineToRelative(7.51f, 10.15f)
                lineTo(4.49f, 23f)
                lineToRelative(7.51f, -10.15f)
                close()
                moveTo(12.62f, 12.01f)
                lineTo(19.94f, 2.11f)
                curveToRelative(0.03f, 0.12f, 0.06f, 0.25f, 0.06f, 0.39f)
                lineTo(20f, 21.98f)
                lineToRelative(-7.38f, -9.97f)
                close()
                moveTo(18.5f, 1f)
                curveToRelative(0.31f, 0f, 0.59f, 0.09f, 0.83f, 0.25f)
                lineToRelative(-7.33f, 9.91f)
                lineTo(4.67f, 1.25f)
                curveToRelative(0.24f, -0.16f, 0.52f, -0.25f, 0.83f, -0.25f)
                horizontalLineToRelative(13f)
                close()
            }
        }.also { _Notdef = it}
