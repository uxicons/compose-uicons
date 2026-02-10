package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Ss.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.17f, 13f)
                horizontalLineToRelative(19.83f)
                lineTo(4.2f, 23.68f)
                curveToRelative(-0.44f, 0.21f, -0.89f, 0.31f, -1.33f, 0.31f)
                curveToRelative(-0.7f, 0f, -1.36f, -0.26f, -1.89f, -0.73f)
                curveToRelative(-0.84f, -0.77f, -1.11f, -1.91f, -0.72f, -2.97f)
                lineToRelative(0.06f, -0.12f)
                lineToRelative(3.85f, -7.17f)
                close()
                moveTo(4.03f, 0.28f)
                curveTo(2.98f, -0.22f, 1.75f, -0.04f, 0.89f, 0.75f)
                curveTo(0.05f, 1.52f, -0.22f, 2.66f, 0.18f, 3.72f)
                lineToRelative(3.98f, 7.28f)
                horizontalLineToRelative(19.84f)
                lineTo(4.11f, 0.32f)
                lineToRelative(-0.08f, -0.04f)
                close()
            }
        }.also { _PaperPlaneTop = it}
