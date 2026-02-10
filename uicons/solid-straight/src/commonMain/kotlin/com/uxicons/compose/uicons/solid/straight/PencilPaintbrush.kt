package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilPaintbrush: ImageVector? = null

val Icons.Ss.PencilPaintbrush: ImageVector
    get() = _PencilPaintbrush ?: UXIcon(name = "PencilPaintbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.31f, 9.4f)
                lineTo(3.71f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3.71f)
                lineTo(14.6f, 5.69f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(23.23f, 0.77f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                close()
                moveTo(6.67f, 10.79f)
                lineToRelative(3.71f, -3.71f)
                lineTo(4.48f, 0.77f)
                curveTo(3.45f, -0.26f, 1.79f, -0.26f, 0.77f, 0.77f)
                curveTo(-0.26f, 1.79f, -0.26f, 3.45f, 0.77f, 4.48f)
                lineToRelative(5.9f, 6.32f)
                close()
                moveTo(23.64f, 22.59f)
                curveToRelative(-0.72f, -2.84f, -2.52f, -7.59f, -6.54f, -7.59f)
                curveToRelative(-2.26f, 0f, -4.1f, 2.02f, -4.1f, 4.5f)
                curveToRelative(0f, 2.54f, 2.51f, 4.5f, 4.67f, 4.5f)
                horizontalLineToRelative(6.33f)
                lineToRelative(-0.36f, -1.41f)
                close()
            }
        }.also { _PencilPaintbrush = it}
