package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Rc.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.88f, 20.75f)
                curveToRelative(-0.31f, -1.44f, -1.33f, -5.33f, -4.06f, -10.45f)
                curveToRelative(-3.25f, -6.1f, -5.84f, -8.73f, -6.12f, -9.01f)
                curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0f)
                curveToRelative(-0.28f, 0.28f, -2.87f, 2.91f, -6.12f, 9.01f)
                curveToRelative(-2.73f, 5.12f, -3.75f, 9.02f, -4.06f, 10.45f)
                curveToRelative(-0.13f, 0.53f, 0.25f, 1.1f, 0.79f, 1.19f)
                curveToRelative(1.64f, 0.32f, 5.9f, 1.05f, 10.1f, 1.05f)
                reflectiveCurveToRelative(8.46f, -0.74f, 10.1f, -1.05f)
                curveToRelative(0.54f, -0.09f, 0.91f, -0.66f, 0.79f, -1.19f)
                close()
                moveTo(12f, 3.49f)
                curveToRelative(0.88f, 1.04f, 2.52f, 3.19f, 4.47f, 6.68f)
                curveToRelative(-0.33f, 1.2f, -0.96f, 2.33f, -1.47f, 3.11f)
                curveToRelative(-0.41f, -0.58f, -0.76f, -1.17f, -1.06f, -1.76f)
                curveToRelative(-0.17f, -0.34f, -0.54f, -0.53f, -0.91f, -0.55f)
                curveToRelative(-0.39f, 0.01f, -0.73f, 0.24f, -0.89f, 0.59f)
                curveToRelative(-0.48f, 1.06f, -1.04f, 2.02f, -1.69f, 2.9f)
                curveToRelative(-0.8f, -0.91f, -2.05f, -2.48f, -2.96f, -4.23f)
                curveToRelative(1.97f, -3.53f, 3.62f, -5.7f, 4.51f, -6.75f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.33f, 0f, -6.72f, -0.49f, -8.69f, -0.83f)
                curveToRelative(0.43f, -1.61f, 1.32f, -4.38f, 3.06f, -7.84f)
                curveToRelative(1.5f, 2.45f, 3.32f, 4.29f, 3.41f, 4.38f)
                curveToRelative(0.39f, 0.41f, 1.1f, 0.38f, 1.46f, -0.05f)
                curveToRelative(0.69f, -0.79f, 1.3f, -1.67f, 1.85f, -2.6f)
                curveToRelative(0.35f, 0.52f, 0.73f, 1.04f, 1.15f, 1.54f)
                curveToRelative(0.37f, 0.48f, 1.16f, 0.48f, 1.54f, 0.01f)
                curveToRelative(0.06f, -0.07f, 1.11f, -1.34f, 1.93f, -3.07f)
                curveToRelative(1.68f, 3.37f, 2.55f, 6.07f, 2.97f, 7.65f)
                curveToRelative(-1.97f, 0.34f, -5.36f, 0.83f, -8.69f, 0.83f)
                close()
            }
        }.also { _Mountain = it}
