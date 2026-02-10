package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassEmpty: ImageVector? = null

val Icons.Tr.GlassEmpty: ImageVector
    get() = _GlassEmpty ?: UXIcon(name = "GlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.34f, 0.81f)
                curveToRelative(-0.47f, -0.52f, -1.14f, -0.81f, -1.84f, -0.81f)
                lineTo(3.5f, 0f)
                curveToRelative(-0.7f, 0f, -1.37f, 0.29f, -1.84f, 0.81f)
                curveToRelative(-0.47f, 0.51f, -0.71f, 1.21f, -0.65f, 1.9f)
                lineToRelative(1.41f, 17.16f)
                curveToRelative(0.19f, 2.32f, 2.16f, 4.13f, 4.49f, 4.13f)
                horizontalLineToRelative(10.1f)
                curveToRelative(2.35f, 0f, 4.28f, -1.76f, 4.48f, -4.11f)
                lineToRelative(1.51f, -17.18f)
                curveToRelative(0.06f, -0.7f, -0.17f, -1.39f, -0.65f, -1.91f)
                close()
                moveTo(20.49f, 19.81f)
                curveToRelative(-0.16f, 1.82f, -1.66f, 3.19f, -3.49f, 3.19f)
                lineTo(6.91f, 23f)
                curveToRelative(-1.81f, 0f, -3.34f, -1.41f, -3.49f, -3.21f)
                lineTo(2.0f, 2.62f)
                curveToRelative(-0.04f, -0.42f, 0.1f, -0.83f, 0.39f, -1.14f)
                curveToRelative(0.29f, -0.31f, 0.68f, -0.48f, 1.1f, -0.48f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.43f, 0f, 0.82f, 0.17f, 1.1f, 0.49f)
                curveToRelative(0.29f, 0.31f, 0.43f, 0.72f, 0.39f, 1.15f)
                lineToRelative(-1.51f, 17.18f)
                close()
            }
        }.also { _GlassEmpty = it}
