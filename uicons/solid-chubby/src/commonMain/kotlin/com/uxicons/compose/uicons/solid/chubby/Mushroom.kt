package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Sc.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.04f, 5.76f)
                curveTo(18.2f, 1.54f, 14.72f, 1f, 12f, 1f)
                reflectiveCurveTo(5.8f, 1.54f, 2.96f, 5.76f)
                curveToRelative(-1.83f, 2.72f, -2.12f, 6.28f, -0.69f, 8.64f)
                curveToRelative(0.66f, 1.09f, 1.71f, 1.75f, 2.94f, 1.86f)
                curveToRelative(1.43f, 0.12f, 2.91f, -0.52f, 3.94f, -1.72f)
                curveToRelative(0f, 0f, 0.89f, -1.47f, 2.85f, -1.47f)
                curveToRelative(1.94f, 0f, 2.85f, 1.47f, 2.85f, 1.47f)
                curveToRelative(1.88f, 2.0f, 3.83f, 1.73f, 3.94f, 1.72f)
                curveToRelative(1.24f, -0.1f, 2.28f, -0.77f, 2.94f, -1.86f)
                curveToRelative(1.43f, -2.36f, 1.14f, -5.92f, -0.69f, -8.64f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.33f, 15.83f)
                curveToRelative(-0.57f, -0.64f, -0.66f, -0.78f, -1.33f, -0.78f)
                reflectiveCurveToRelative(-0.88f, 0.2f, -1.33f, 0.77f)
                curveToRelative(-0.91f, 1.14f, -2.17f, 1.87f, -3.49f, 2.22f)
                curveToRelative(-0.15f, 0.68f, -0.15f, 1.38f, -0.01f, 2.08f)
                curveToRelative(0.27f, 1.31f, 1.32f, 2.87f, 4.83f, 2.87f)
                curveToRelative(4.45f, 0f, 4.93f, -2.72f, 4.93f, -3.89f)
                curveToRelative(0f, -0.36f, -0.04f, -0.71f, -0.12f, -1.06f)
                curveToRelative(-1.32f, -0.35f, -2.52f, -1.13f, -3.48f, -2.22f)
                close()
            }
        }.also { _Mushroom = it}
