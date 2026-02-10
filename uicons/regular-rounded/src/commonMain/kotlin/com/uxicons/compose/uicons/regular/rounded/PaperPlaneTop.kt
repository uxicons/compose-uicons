package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Rr.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.92f, 8.73f)
                lineTo(3.96f, 0.28f)
                curveTo(2.95f, -0.21f, 1.76f, -0.04f, 0.92f, 0.71f)
                curveTo(0.08f, 1.47f, -0.22f, 2.65f, 0.17f, 3.71f)
                curveToRelative(0.02f, 0.04f, 4.41f, 8.3f, 4.41f, 8.3f)
                curveToRelative(0f, 0f, -4.31f, 8.25f, -4.33f, 8.29f)
                curveToRelative(-0.39f, 1.06f, -0.09f, 2.24f, 0.75f, 2.99f)
                curveToRelative(0.52f, 0.47f, 1.18f, 0.71f, 1.84f, 0.71f)
                curveToRelative(0.41f, 0f, 0.82f, -0.09f, 1.2f, -0.28f)
                lineToRelative(17.87f, -8.44f)
                curveToRelative(1.28f, -0.6f, 2.08f, -1.86f, 2.08f, -3.28f)
                curveToRelative(0f, -1.42f, -0.8f, -2.67f, -2.08f, -3.27f)
                close()
                moveTo(2.03f, 2.97f)
                curveToRelative(-0.12f, -0.41f, 0.14f, -0.69f, 0.22f, -0.77f)
                curveToRelative(0.09f, -0.08f, 0.41f, -0.32f, 0.84f, -0.12f)
                curveToRelative(0.01f, 0.0f, 17.97f, 8.46f, 17.97f, 8.46f)
                curveToRelative(0.24f, 0.11f, 0.44f, 0.27f, 0.59f, 0.46f)
                lineTo(6.32f, 11f)
                lineTo(2.03f, 2.97f)
                close()
                moveTo(21.07f, 13.47f)
                lineTo(3.18f, 21.92f)
                curveToRelative(-0.42f, 0.21f, -0.75f, -0.04f, -0.84f, -0.12f)
                curveToRelative(-0.09f, -0.08f, -0.35f, -0.35f, -0.22f, -0.77f)
                lineToRelative(4.2f, -8.03f)
                horizontalLineToRelative(15.35f)
                curveToRelative(-0.15f, 0.2f, -0.35f, 0.36f, -0.6f, 0.47f)
                close()
            }
        }.also { _PaperPlaneTop = it}
