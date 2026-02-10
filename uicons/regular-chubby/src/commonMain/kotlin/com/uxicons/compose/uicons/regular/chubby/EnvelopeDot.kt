package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Rc.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 11.96f)
                curveToRelative(0.01f, 0.34f, 0.02f, 0.68f, 0.02f, 1.04f)
                curveToRelative(0f, 4.4f, -1.02f, 7.17f, -1.06f, 7.28f)
                curveToRelative(-0.1f, 0.28f, -0.32f, 0.49f, -0.6f, 0.59f)
                curveToRelative(-0.13f, 0.05f, -3.23f, 1.12f, -9.34f, 1.12f)
                reflectiveCurveToRelative(-9.21f, -1.08f, -9.34f, -1.12f)
                curveToRelative(-0.28f, -0.1f, -0.5f, -0.32f, -0.6f, -0.59f)
                curveToRelative(-0.04f, -0.12f, -1.06f, -2.89f, -1.06f, -7.28f)
                reflectiveCurveToRelative(1.02f, -7.17f, 1.06f, -7.28f)
                curveToRelative(0.1f, -0.28f, 0.32f, -0.49f, 0.6f, -0.59f)
                curveToRelative(0.13f, -0.05f, 3.23f, -1.12f, 9.34f, -1.12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-3.48f, 0f, -5.91f, 0.37f, -7.3f, 0.66f)
                curveToRelative(2.1f, 2.4f, 6.02f, 5.31f, 7.3f, 6.14f)
                curveToRelative(0.53f, -0.36f, 1.39f, -0.96f, 2.39f, -1.73f)
                curveToRelative(0.44f, -0.34f, 1.06f, -0.25f, 1.4f, 0.18f)
                curveToRelative(0.34f, 0.44f, 0.25f, 1.07f, -0.18f, 1.4f)
                curveToRelative(-1.72f, 1.31f, -3.02f, 2.15f, -3.07f, 2.18f)
                curveToRelative(-0.33f, 0.21f, -0.75f, 0.21f, -1.08f, 0f)
                curveToRelative(0.0f, 0.07f, -5.47f, -3.7f, -8.0f, -6.59f)
                curveToRelative(-0.23f, 1.14f, -0.46f, 2.76f, -0.46f, 4.75f)
                curveToRelative(0f, 3.02f, 0.53f, 5.22f, 0.79f, 6.12f)
                curveToRelative(1.03f, 0.27f, 3.78f, 0.88f, 8.21f, 0.88f)
                reflectiveCurveToRelative(7.18f, -0.6f, 8.21f, -0.88f)
                curveToRelative(0.26f, -0.9f, 0.79f, -3.1f, 0.79f, -6.12f)
                curveToRelative(0f, -0.33f, -0.01f, -0.65f, -0.02f, -0.96f)
                curveToRelative(-0.02f, -0.55f, 0.41f, -1.02f, 0.96f, -1.04f)
                curveToRelative(0.55f, -0.02f, 1.02f, 0.41f, 1.04f, 0.96f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -2.69f, 1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                reflectiveCurveToRelative(-1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                close()
                moveTo(17f, 6f)
                curveToRelative(0f, 1.59f, 0.41f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.41f, 2f, -2f)
                reflectiveCurveToRelative(-0.41f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.41f, -2f, 2f)
                close()
            }
        }.also { _EnvelopeDot = it}
