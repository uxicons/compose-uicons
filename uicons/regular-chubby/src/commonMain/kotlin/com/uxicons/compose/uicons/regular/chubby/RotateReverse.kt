package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateReverse: ImageVector? = null

val Icons.Rc.RotateReverse: ImageVector
    get() = _RotateReverse ?: UXIcon(name = "RotateReverse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.03f, 11.84f)
                curveToRelative(1.14f, -0.54f, 1.56f, -0.87f, 2.36f, -1.83f)
                curveToRelative(0.35f, -0.42f, 0.3f, -1.05f, -0.12f, -1.41f)
                curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.12f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.01f, -0.02f, 0.02f)
                curveToRelative(0.71f, -3.27f, 2.89f, -4.59f, 7.24f, -4.59f)
                curveToRelative(4.61f, 0f, 6.74f, 1.48f, 7.33f, 5.12f)
                curveToRelative(0.09f, 0.54f, 0.6f, 0.91f, 1.15f, 0.82f)
                reflectiveCurveToRelative(0.91f, -0.6f, 0.82f, -1.15f)
                curveToRelative(-1.0f, -6.09f, -5.79f, -6.79f, -9.31f, -6.79f)
                curveToRelative(-3.49f, 0f, -8.03f, 0.71f, -9.21f, 6.33f)
                curveToRelative(-0.26f, -0.46f, -0.84f, -0.63f, -1.31f, -0.4f)
                curveToRelative(-0.49f, 0.25f, -0.69f, 0.85f, -0.45f, 1.34f)
                curveToRelative(0.56f, 1.11f, 0.89f, 1.51f, 1.87f, 2.29f)
                curveToRelative(0.31f, 0.25f, 0.71f, 0.28f, 1.05f, 0.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.89f, 14.57f)
                curveToRelative(-0.56f, -1.11f, -0.89f, -1.52f, -1.87f, -2.29f)
                curveToRelative(-0.3f, -0.24f, -0.7f, -0.28f, -1.05f, -0.12f)
                curveToRelative(-1.14f, 0.55f, -1.56f, 0.87f, -2.36f, 1.83f)
                curveToRelative(-0.35f, 0.42f, -0.3f, 1.05f, 0.12f, 1.41f)
                curveToRelative(0.42f, 0.35f, 1.05f, 0.3f, 1.41f, -0.12f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.02f)
                curveToRelative(-0.71f, 3.27f, -2.89f, 4.59f, -7.24f, 4.59f)
                curveToRelative(-4.61f, 0f, -6.74f, -1.48f, -7.33f, -5.12f)
                curveToRelative(-0.09f, -0.54f, -0.6f, -0.91f, -1.15f, -0.82f)
                curveToRelative(-0.55f, 0.09f, -0.91f, 0.6f, -0.82f, 1.15f)
                curveToRelative(1.0f, 6.09f, 5.79f, 6.79f, 9.31f, 6.79f)
                curveToRelative(3.49f, 0f, 8.03f, -0.71f, 9.21f, -6.33f)
                curveToRelative(0.46f, 0.71f, 1.14f, 0.49f, 1.31f, 0.4f)
                curveToRelative(0.49f, -0.26f, 0.69f, -0.85f, 0.45f, -1.34f)
                close()
            }
        }.also { _RotateReverse = it}
