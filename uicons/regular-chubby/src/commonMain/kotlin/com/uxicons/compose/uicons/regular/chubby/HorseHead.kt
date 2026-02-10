package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Rc.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 13.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22.89f, 16.55f)
                curveToRelative(-0.06f, -0.12f, -1.56f, -3.11f, -4.06f, -6.61f)
                curveToRelative(-2.1f, -3.15f, -4.22f, -4.69f, -5.45f, -5.39f)
                lineToRelative(0.63f, -2.47f)
                curveToRelative(0.14f, -0.55f, -0.31f, -1.1f, -0.87f, -1.03f)
                curveToRelative(-0.84f, 0.1f, -3.01f, 1.14f, -4.2f, 3.08f)
                curveToRelative(-2.52f, 0.44f, -7.14f, 2.28f, -7.91f, 9.8f)
                curveToRelative(-0.01f, 0.18f, -0.28f, 4.45f, 1.02f, 8.38f)
                curveToRelative(0.17f, 0.53f, 0.75f, 0.81f, 1.26f, 0.64f)
                curveToRelative(0.52f, -0.17f, 0.81f, -0.74f, 0.64f, -1.26f)
                curveToRelative(-1.18f, -3.56f, -0.93f, -7.58f, -0.93f, -7.58f)
                curveToRelative(0.86f, -8.38f, 7.14f, -8.12f, 7.48f, -8.1f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.57f, 0.25f, 2.96f, 1.46f, 5.38f, 5.08f)
                curveToRelative(1.93f, 2.71f, 3.27f, 5.13f, 3.73f, 6.01f)
                curveToRelative(-0.31f, 0.91f, -0.69f, 1.56f, -0.93f, 1.92f)
                curveToRelative(-0.59f, -0.02f, -1.66f, -0.18f, -2.12f, -1.0f)
                curveToRelative(-1.05f, -1.84f, -3.3f, -2.4f, -5.29f, -2.89f)
                lineToRelative(-0.34f, -0.08f)
                curveToRelative(-0.61f, -0.17f, -1.26f, 0.34f, -1.24f, 0.97f)
                curveToRelative(0f, 3.27f, 2.08f, 6.42f, 2.17f, 6.55f)
                curveToRelative(0.31f, 0.46f, 0.93f, 0.58f, 1.39f, 0.28f)
                curveToRelative(0.46f, -0.31f, 0.58f, -0.93f, 0.28f, -1.39f)
                curveToRelative(-0.02f, -0.02f, -1.28f, -1.94f, -1.7f, -4.13f)
                curveToRelative(1.28f, 0.35f, 2.51f, 0.81f, 3.0f, 1.68f)
                curveToRelative(1.31f, 2.3f, 4.34f, 2.01f, 4.47f, 2f)
                curveToRelative(0.25f, -0.03f, 0.48f, -0.14f, 0.65f, -0.33f)
                curveToRelative(0.04f, -0.05f, 1.08f, -1.23f, 1.71f, -3.38f)
                curveToRelative(0.07f, -0.24f, 0.05f, -0.5f, -0.06f, -0.73f)
                close()
            }
        }.also { _HorseHead = it}
