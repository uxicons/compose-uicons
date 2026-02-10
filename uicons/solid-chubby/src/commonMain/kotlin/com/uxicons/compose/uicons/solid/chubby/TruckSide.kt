package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Sc.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.67f, 3.23f)
                curveToRelative(-0.1f, -0.33f, -0.35f, -0.58f, -0.68f, -0.68f)
                curveToRelative(-0.13f, -0.04f, -3.15f, -0.9f, -6.71f, -0.9f)
                reflectiveCurveToRelative(-6.58f, 0.86f, -6.71f, 0.9f)
                curveToRelative(-0.33f, 0.1f, -0.59f, 0.35f, -0.68f, 0.68f)
                curveToRelative(-0.04f, 0.12f, -0.88f, 3.03f, -0.88f, 6.9f)
                curveToRelative(0f, 3.9f, 0.84f, 6.79f, 0.88f, 6.91f)
                curveToRelative(0.1f, 0.35f, 0.39f, 0.62f, 0.75f, 0.69f)
                curveToRelative(0.12f, 0.03f, 3.11f, 0.66f, 6.64f, 0.66f)
                reflectiveCurveToRelative(6.52f, -0.63f, 6.64f, -0.66f)
                curveToRelative(0.36f, -0.08f, 0.65f, -0.34f, 0.75f, -0.69f)
                curveToRelative(0.04f, -0.12f, 0.88f, -3.03f, 0.88f, -6.9f)
                curveToRelative(0f, -3.9f, -0.84f, -6.79f, -0.88f, -6.91f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.69f, 19.95f)
                curveToRelative(0.23f, 1.36f, 1.41f, 2.4f, 2.83f, 2.4f)
                curveToRelative(1.26f, 0f, 2.34f, -0.82f, 2.72f, -1.96f)
                curveToRelative(-2.24f, -0.0f, -4.25f, -0.24f, -5.54f, -0.44f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.53f, 11.22f)
                horizontalLineToRelative(3.43f)
                curveToRelative(-0.13f, -2.03f, -0.53f, -3.43f, -0.55f, -3.5f)
                curveToRelative(-0.1f, -0.33f, -0.35f, -0.58f, -0.68f, -0.68f)
                curveToRelative(-0.06f, -0.02f, -1.03f, -0.3f, -2.4f, -0.48f)
                curveToRelative(0.13f, 1.05f, 0.22f, 2.26f, 0.22f, 3.58f)
                curveToRelative(0f, 0.37f, -0.01f, 0.73f, -0.02f, 1.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.39f, 13.22f)
                curveToRelative(-0.27f, 2.56f, -0.77f, 4.29f, -0.8f, 4.39f)
                curveToRelative(-0.04f, 0.15f, -0.1f, 0.29f, -0.16f, 0.42f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.45f, 0f, 0.84f, -0.3f, 0.96f, -0.72f)
                curveToRelative(0.02f, -0.08f, 0.5f, -1.76f, 0.58f, -4.09f)
                horizontalLineToRelative(-3.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.91f, 20.03f)
                curveToRelative(0.26f, 1.32f, 1.42f, 2.32f, 2.81f, 2.32f)
                reflectiveCurveToRelative(2.56f, -1f, 2.81f, -2.32f)
                horizontalLineToRelative(-5.63f)
                close()
            }
        }.also { _TruckSide = it}
