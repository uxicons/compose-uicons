package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _V: ImageVector? = null

val Icons.Tr.V: ImageVector
    get() = _V ?: UXIcon(name = "V") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24.01f)
                curveToRelative(-1.66f, 0f, -3.07f, -0.96f, -3.68f, -2.51f)
                lineTo(0.04f, 0.69f)
                curveTo(-0.07f, 0.43f, 0.06f, 0.14f, 0.32f, 0.04f)
                curveToRelative(0.26f, -0.1f, 0.55f, 0.02f, 0.65f, 0.28f)
                lineTo(9.25f, 21.14f)
                curveToRelative(1.11f, 2.54f, 4.38f, 2.54f, 5.5f, 0.0f)
                lineTo(23.04f, 0.32f)
                curveToRelative(0.1f, -0.26f, 0.39f, -0.38f, 0.65f, -0.28f)
                curveToRelative(0.26f, 0.1f, 0.38f, 0.39f, 0.28f, 0.65f)
                lineTo(15.68f, 21.5f)
                curveToRelative(-0.61f, 1.54f, -2.02f, 2.51f, -3.68f, 2.51f)
                close()
            }
        }.also { _V = it}
