package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Tr.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 23.32f)
                lineTo(15.68f, 2.5f)
                curveToRelative(-1.14f, -3.3f, -6.21f, -3.3f, -7.36f, -0.0f)
                lineTo(0.04f, 23.32f)
                curveToRelative(-0.1f, 0.26f, 0.02f, 0.55f, 0.28f, 0.65f)
                curveToRelative(0.26f, 0.1f, 0.55f, -0.02f, 0.65f, -0.28f)
                lineToRelative(3.06f, -7.68f)
                horizontalLineToRelative(15.95f)
                lineToRelative(3.06f, 7.68f)
                curveToRelative(0.1f, 0.26f, 0.4f, 0.38f, 0.65f, 0.28f)
                curveToRelative(0.26f, -0.1f, 0.38f, -0.39f, 0.28f, -0.65f)
                close()
                moveTo(4.42f, 15f)
                lineTo(9.25f, 2.86f)
                curveToRelative(1.11f, -2.53f, 4.38f, -2.53f, 5.5f, 0.0f)
                lineToRelative(4.83f, 12.13f)
                horizontalLineTo(4.42f)
                close()
            }
        }.also { _A = it}
