package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassCitrus: ImageVector? = null

val Icons.Ss.GlassCitrus: ImageVector
    get() = _GlassCitrus ?: UXIcon(name = "GlassCitrus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 5.0f)
                lineToRelative(0.92f, 6.0f)
                horizontalLineToRelative(9.38f)
                curveToRelative(0.47f, 0.75f, 1.05f, 1.43f, 1.73f, 2f)
                lineTo(1.19f, 13f)
                lineToRelative(1.12f, 8.4f)
                curveToRelative(0.2f, 1.49f, 1.47f, 2.6f, 2.97f, 2.6f)
                horizontalLineToRelative(8.98f)
                curveToRelative(1.5f, 0f, 2.77f, -1.11f, 2.97f, -2.6f)
                lineToRelative(2.19f, -16.4f)
                lineToRelative(-19.43f, 0.0f)
                close()
                moveTo(11.02f, 6.98f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.21f, 1.97f, 1.69f, 3.56f, 3.6f, 3.94f)
                lineToRelative(-0.26f, 1.97f)
                curveToRelative(-2.89f, -0.51f, -5.13f, -2.93f, -5.34f, -5.91f)
                close()
                moveTo(24f, 6.5f)
                curveToRelative(0f, 2.51f, -1.43f, 4.69f, -3.52f, 5.77f)
                lineToRelative(1.24f, -9.27f)
                horizontalLineToRelative(-9.69f)
                curveTo(13.19f, 1.2f, 15.2f, 0.0f, 17.5f, 0.0f)
                curveTo(21.09f, 0.0f, 24f, 2.91f, 24f, 6.5f)
                close()
            }
        }.also { _GlassCitrus = it}
