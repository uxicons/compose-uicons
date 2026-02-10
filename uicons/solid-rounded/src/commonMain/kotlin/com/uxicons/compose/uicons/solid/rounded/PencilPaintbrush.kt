package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilPaintbrush: ImageVector? = null

val Icons.Sr.PencilPaintbrush: ImageVector
    get() = _PencilPaintbrush ?: UXIcon(name = "PencilPaintbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.31f, 15f)
                curveToRelative(3.85f, 0f, 5.76f, 4.03f, 6.61f, 6.7f)
                curveToRelative(0.36f, 1.15f, -0.52f, 2.31f, -1.75f, 2.31f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(-2.38f, 0f, -4.91f, -2.02f, -4.91f, -4.5f)
                curveToRelative(0f, -2.48f, 1.93f, -4.5f, 4.31f, -4.5f)
                close()
                moveTo(1.17f, 19.12f)
                curveToRelative(-0.75f, 0.75f, -1.17f, 1.77f, -1.17f, 2.83f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(2.05f)
                curveToRelative(1.06f, 0f, 2.08f, -0.42f, 2.83f, -1.17f)
                lineToRelative(13.43f, -13.43f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(1.17f, 19.12f)
                close()
                moveTo(23.23f, 0.77f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-3.51f, 3.51f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.51f, -3.51f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                close()
                moveTo(0.77f, 4.48f)
                curveTo(-0.26f, 3.45f, -0.26f, 1.79f, 0.77f, 0.77f)
                curveTo(1.79f, -0.26f, 3.45f, -0.26f, 4.48f, 0.77f)
                lineToRelative(5.9f, 6.32f)
                lineToRelative(-3.71f, 3.71f)
                lineTo(0.77f, 4.48f)
                close()
            }
        }.also { _PencilPaintbrush = it}
