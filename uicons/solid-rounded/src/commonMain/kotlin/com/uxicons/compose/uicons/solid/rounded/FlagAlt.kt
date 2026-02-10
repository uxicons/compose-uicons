package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Sr.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineTo(22.0f)
                curveToRelative(1.6f, -0.06f, 2.6f, 1.96f, 1.6f, 3.2f)
                lineToRelative(-3.24f, 4.3f)
                lineToRelative(3.24f, 4.3f)
                curveToRelative(1.01f, 1.25f, 0.0f, 3.26f, -1.6f, 3.2f)
                horizontalLineTo(2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FlagAlt = it}
