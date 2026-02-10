package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _V: ImageVector? = null

val Icons.Rs.V: ImageVector
    get() = _V ?: UXIcon(name = "V") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.16f, 0f)
                lineTo(11.11f, 21.45f)
                curveToRelative(0.17f, 0.35f, 0.51f, 0.55f, 0.89f, 0.55f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, 0f, 0.72f, -0.21f, 0.86f, -0.48f)
                lineTo(21.84f, 0f)
                horizontalLineToRelative(2.16f)
                lineTo(14.69f, 22.34f)
                curveToRelative(-0.51f, 1.02f, -1.54f, 1.66f, -2.68f, 1.66f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.15f, 0f, -2.17f, -0.64f, -2.71f, -1.72f)
                lineTo(-0.01f, 0f)
                horizontalLineTo(2.16f)
                close()
            }
        }.also { _V = it}
