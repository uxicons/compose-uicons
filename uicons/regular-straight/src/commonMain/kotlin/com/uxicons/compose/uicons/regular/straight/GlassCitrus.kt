package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassCitrus: ImageVector? = null

val Icons.Rs.GlassCitrus: ImageVector
    get() = _GlassCitrus ?: UXIcon(name = "GlassCitrus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-3.07f, 0f, -5.64f, 2.14f, -6.32f, 5f)
                lineTo(-0.01f, 5f)
                lineToRelative(2.24f, 16.41f)
                curveToRelative(0.2f, 1.48f, 1.48f, 2.59f, 2.97f, 2.59f)
                horizontalLineToRelative(10.08f)
                curveToRelative(1.49f, 0f, 2.77f, -1.11f, 2.97f, -2.59f)
                lineToRelative(2.25f, -16.41f)
                horizontalLineToRelative(-7.23f)
                curveToRelative(0.62f, -1.74f, 2.27f, -3f, 4.22f, -3f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.21f, 0.05f, 1.87f, -0.08f, 2.5f)
                lineToRelative(-0.34f, 2.56f)
                curveToRelative(1.48f, -1.19f, 2.42f, -3.02f, 2.42f, -5.06f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                close()
                moveTo(16.27f, 21.14f)
                curveToRelative(-0.07f, 0.49f, -0.49f, 0.86f, -0.99f, 0.86f)
                lineTo(5.2f, 22f)
                curveToRelative(-0.5f, 0f, -0.92f, -0.37f, -0.99f, -0.86f)
                lineToRelative(-1.11f, -8.13f)
                horizontalLineToRelative(8.94f)
                curveToRelative(-0.68f, -0.57f, -1.26f, -1.25f, -1.73f, -2f)
                lineTo(2.83f, 11f)
                lineToRelative(-0.55f, -4f)
                horizontalLineToRelative(8.74f)
                curveToRelative(0.25f, 3.31f, 3.0f, 5.93f, 6.36f, 5.99f)
                lineToRelative(-1.12f, 8.14f)
                close()
                moveTo(17.66f, 11f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(-2.31f, 0f, -4.2f, -1.76f, -4.45f, -4f)
                horizontalLineToRelative(5.16f)
                lineToRelative(-0.55f, 4f)
                close()
            }
        }.also { _GlassCitrus = it}
