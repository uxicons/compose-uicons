package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Ts.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.05f, 0f)
                lineTo(2.55f, 0f)
                curveTo(1.17f, 0f, 0.05f, 1.12f, 0.05f, 2.5f)
                lineTo(0.05f, 24f)
                lineTo(1.05f, 24f)
                lineTo(1.05f, 15f)
                lineTo(24.05f, 15f)
                lineToRelative(-5.65f, -7.5f)
                lineTo(24.05f, 0f)
                close()
                moveTo(22.05f, 14f)
                lineTo(1.05f, 14f)
                lineTo(1.05f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(22.05f, 1f)
                lineToRelative(-4.9f, 6.5f)
                lineToRelative(4.9f, 6.5f)
                close()
            }
        }.also { _FlagAlt = it}
