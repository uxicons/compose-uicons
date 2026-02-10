package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartMinus: ImageVector? = null

val Icons.Sc.CartMinus: ImageVector
    get() = _CartMinus ?: UXIcon(name = "CartMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 20.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14f, 4.5f)
                curveToRelative(0f, -0.52f, 0.08f, -1.02f, 0.21f, -1.5f)
                curveToRelative(-2.49f, -0.01f, -5.47f, 0.2f, -7.66f, 0.42f)
                curveToRelative(-0.15f, -0.49f, -0.33f, -0.92f, -0.54f, -1.29f)
                curveToRelative(-0.14f, -0.26f, -0.36f, -0.47f, -0.62f, -0.6f)
                curveToRelative(-1.06f, -0.55f, -2.61f, -0.53f, -2.91f, -0.52f)
                curveToRelative(-0.83f, 0.03f, -1.48f, 0.72f, -1.45f, 1.55f)
                reflectiveCurveToRelative(0.72f, 1.49f, 1.55f, 1.45f)
                curveToRelative(0.3f, -0.01f, 0.71f, 0.02f, 1.03f, 0.07f)
                curveToRelative(0.42f, 1.17f, 0.71f, 3.27f, 0.99f, 5.32f)
                curveToRelative(0.42f, 3.04f, 0.85f, 6.18f, 1.88f, 8.25f)
                curveToRelative(0.2f, 0.41f, 0.58f, 0.7f, 1.03f, 0.8f)
                curveToRelative(1.3f, 0.28f, 3.65f, 0.56f, 6.0f, 0.56f)
                curveToRelative(2.36f, -0.02f, 4.71f, -0.22f, 6.28f, -0.53f)
                curveToRelative(0.81f, -0.16f, 1.34f, -0.95f, 1.18f, -1.76f)
                reflectiveCurveToRelative(-0.95f, -1.35f, -1.76f, -1.18f)
                curveToRelative(-1.08f, 0.21f, -3.15f, 0.45f, -5.71f, 0.47f)
                curveToRelative(-1.7f, 0f, -3.43f, -0.17f, -4.62f, -0.35f)
                curveToRelative(-0.21f, -0.57f, -0.39f, -1.24f, -0.55f, -1.97f)
                curveToRelative(1.48f, 0.17f, 3.46f, 0.3f, 5.67f, 0.32f)
                curveToRelative(2.64f, -0.02f, 5.58f, -0.24f, 7.17f, -0.53f)
                curveToRelative(0.33f, -0.06f, 0.63f, -0.34f, 0.76f, -0.64f)
                curveToRelative(0.45f, -1.05f, 0.67f, -1.61f, 0.99f, -3.95f)
                curveToRelative(0.0f, -0.03f, 0.0f, -0.05f, 0.01f, -0.08f)
                curveToRelative(-0.94f, 0.75f, -2.13f, 1.2f, -3.43f, 1.2f)
                curveToRelative(-3.04f, 0f, -5.5f, -2.46f, -5.5f, -5.5f)
                close()
                moveTo(17.5f, 6f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _CartMinus = it}
