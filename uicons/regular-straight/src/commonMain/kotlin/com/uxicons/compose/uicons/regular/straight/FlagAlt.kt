package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Rs.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 15f)
                lineTo(23.9f, 15f)
                lineToRelative(-5.65f, -7.5f)
                lineTo(23.9f, 0f)
                close()
                moveTo(19.89f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(19.89f, 2f)
                lineToRelative(-4.14f, 5.5f)
                lineToRelative(4.14f, 5.5f)
                close()
            }
        }.also { _FlagAlt = it}
