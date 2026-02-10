package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassCitrus: ImageVector? = null

val Icons.Bs.GlassCitrus: ImageVector
    get() = _GlassCitrus ?: UXIcon(name = "GlassCitrus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.75f)
                curveToRelative(0f, -3.72f, -3.03f, -6.75f, -6.75f, -6.75f)
                curveToRelative(-3.12f, 0f, -5.74f, 2.12f, -6.51f, 5f)
                lineTo(0f, 5f)
                lineToRelative(1.88f, 15.91f)
                curveToRelative(0.21f, 1.76f, 1.7f, 3.09f, 3.48f, 3.09f)
                horizontalLineToRelative(8.43f)
                curveToRelative(1.77f, 0f, 3.27f, -1.33f, 3.48f, -3.09f)
                lineToRelative(1.88f, -15.91f)
                horizontalLineToRelative(-5.19f)
                curveToRelative(0.63f, -1.18f, 1.86f, -2f, 3.3f, -2f)
                curveToRelative(2.07f, 0f, 3.75f, 1.68f, 3.75f, 3.75f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.26f, 0.13f, 0.99f, -0.09f, 2.63f)
                lineToRelative(-0.52f, 3.41f)
                curveToRelative(2.1f, -1.14f, 3.61f, -3.48f, 3.61f, -6.04f)
                horizontalLineToRelative(0f)
                close()
                moveTo(13.79f, 21f)
                lineTo(5.35f, 21f)
                curveToRelative(-0.25f, 0f, -0.47f, -0.19f, -0.5f, -0.44f)
                lineToRelative(-0.77f, -6.56f)
                horizontalLineToRelative(8.27f)
                curveToRelative(-1.14f, -0.77f, -2.08f, -1.8f, -2.75f, -3f)
                lineTo(3.73f, 11f)
                lineToRelative(-0.35f, -3f)
                horizontalLineToRelative(7.25f)
                curveToRelative(0.46f, 2.43f, 2.22f, 4.41f, 4.54f, 5.16f)
                lineToRelative(-0.87f, 7.39f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                close()
                moveTo(15.52f, 10.06f)
                curveToRelative(-0.83f, -0.44f, -1.47f, -1.17f, -1.79f, -2.06f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-0.24f, 2.06f)
                close()
            }
        }.also { _GlassCitrus = it}
