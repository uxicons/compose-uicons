package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Sc.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.18f, 5.25f)
                curveToRelative(-0.4f, -1.16f, -0.11f, -2.43f, 0.76f, -3.3f)
                curveToRelative(0.88f, -0.88f, 2.17f, -1.18f, 3.35f, -0.77f)
                curveToRelative(2.33f, 0.81f, 4.83f, 1.87f, 7.41f, 3.17f)
                curveToRelative(5.22f, 2.62f, 8.85f, 5.21f, 10.3f, 6.65f)
                horizontalLineToRelative(-19.23f)
                curveToRelative(-1.3f, -2.28f, -2.15f, -4.5f, -2.59f, -5.75f)
                close()
                moveTo(3.77f, 13f)
                curveToRelative(-1.3f, 2.28f, -2.15f, 4.5f, -2.59f, 5.75f)
                curveToRelative(-0.4f, 1.16f, -0.11f, 2.43f, 0.76f, 3.3f)
                curveToRelative(0.89f, 0.89f, 2.18f, 1.17f, 3.35f, 0.77f)
                curveToRelative(2.33f, -0.81f, 4.83f, -1.87f, 7.41f, -3.17f)
                curveToRelative(5.17f, -2.59f, 8.79f, -5.16f, 10.3f, -6.65f)
                horizontalLineToRelative(-19.23f)
                close()
            }
        }.also { _PaperPlaneTop = it}
