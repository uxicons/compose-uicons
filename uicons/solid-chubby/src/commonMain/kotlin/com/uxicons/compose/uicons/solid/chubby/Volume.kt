package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Sc.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.45f, 6.34f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0.0f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.0f, 2.12f)
                curveToRelative(1.12f, 1.12f, 1.67f, 2.28f, 1.67f, 3.54f)
                curveToRelative(0f, 1.23f, -0.56f, 2.42f, -1.67f, 3.52f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(1.69f, -1.69f, 2.55f, -3.59f, 2.55f, -5.65f)
                curveToRelative(0f, -2.07f, -0.86f, -3.98f, -2.55f, -5.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.38f, 9.13f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.0f)
                reflectiveCurveToRelative(-0.58f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.4f, 0.4f, 0.51f, 0.66f, 0.51f, 0.75f)
                curveToRelative(0f, 0.02f, -0.01f, 0.24f, -0.51f, 0.73f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.94f, -0.94f, 1.39f, -1.87f, 1.39f, -2.86f)
                reflectiveCurveToRelative(-0.47f, -1.96f, -1.39f, -2.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.19f, 4.33f)
                curveToRelative(-0.47f, -0.23f, -0.98f, -0.18f, -1.36f, 0.13f)
                curveToRelative(-0.05f, 0.04f, -0.1f, 0.09f, -0.14f, 0.14f)
                curveToRelative(-1.19f, 1.53f, -2.61f, 3.01f, -2.97f, 3.15f)
                lineToRelative(-3.74f, 0.28f)
                curveToRelative(-0.27f, 0.02f, -0.51f, 0.16f, -0.67f, 0.38f)
                curveToRelative(-0.85f, 1.19f, -1.31f, 2.12f, -1.31f, 3.58f)
                curveToRelative(0f, 1.48f, 0.48f, 2.45f, 1.31f, 3.61f)
                curveToRelative(0.15f, 0.22f, 0.4f, 0.35f, 0.67f, 0.38f)
                lineToRelative(3.66f, 0.27f)
                curveToRelative(0.43f, 0.15f, 1.85f, 1.62f, 3.05f, 3.14f)
                curveToRelative(0.04f, 0.05f, 0.09f, 0.1f, 0.14f, 0.14f)
                curveToRelative(0.22f, 0.18f, 0.49f, 0.27f, 0.77f, 0.27f)
                curveToRelative(0.2f, 0f, 0.4f, -0.05f, 0.6f, -0.14f)
                curveToRelative(1.28f, -0.61f, 2.58f, -3.44f, 2.58f, -7.67f)
                reflectiveCurveToRelative(-1.3f, -7.05f, -2.58f, -7.66f)
                close()
            }
        }.also { _Volume = it}
