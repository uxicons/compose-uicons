package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompressAlt: ImageVector? = null

val Icons.Ts.CompressAlt: ImageVector
    get() = _CompressAlt ?: UXIcon(name = "CompressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12.0f)
                lineToRelative(-8.66f, 0.38f)
                lineToRelative(4.75f, 4.75f)
                lineTo(0.02f, 23.27f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(6.07f, -6.13f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(0.38f, -8.65f)
                curveToRelative(0.03f, -0.52f, -0.17f, -1.03f, -0.54f, -1.4f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.57f, -1.4f, -0.54f)
                close()
                moveTo(10.93f, 13.88f)
                lineToRelative(-0.28f, 6.39f)
                lineTo(3.66f, 13.29f)
                lineToRelative(6.39f, -0.28f)
                curveToRelative(0.24f, -0.01f, 0.47f, 0.07f, 0.64f, 0.24f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.4f, 0.24f, 0.64f)
                close()
                moveTo(23.98f, 0.73f)
                lineTo(23.27f, 0.02f)
                lineToRelative(-6.13f, 6.13f)
                lineTo(12.39f, 1.41f)
                lineToRelative(-0.38f, 8.65f)
                curveToRelative(-0.03f, 0.52f, 0.17f, 1.03f, 0.54f, 1.4f)
                curveToRelative(0.34f, 0.34f, 0.81f, 0.54f, 1.3f, 0.54f)
                curveToRelative(0.03f, 0f, 0.06f, 0f, 0.1f, -0.0f)
                lineToRelative(8.65f, -0.38f)
                lineToRelative(-4.75f, -4.75f)
                lineTo(23.98f, 0.73f)
                close()
                moveTo(13.89f, 11.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.24f, 0.0f, -0.47f, -0.07f, -0.64f, -0.24f)
                curveToRelative(-0.17f, -0.17f, -0.26f, -0.4f, -0.24f, -0.64f)
                lineToRelative(0.28f, -6.39f)
                lineToRelative(6.99f, 6.99f)
                lineToRelative(-6.39f, 0.28f)
                close()
            }
        }.also { _CompressAlt = it}
