package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Couch: ImageVector? = null

val Icons.Sc.Couch: ImageVector
    get() = _Couch ?: UXIcon(name = "Couch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.01f, 10f)
                curveToRelative(-0.01f, -0.17f, -0.01f, -0.35f, -0.01f, -0.6f)
                curveToRelative(0f, -3.55f, 0.83f, -5.8f, 0.86f, -5.9f)
                curveToRelative(0.1f, -0.28f, 0.32f, -0.49f, 0.6f, -0.59f)
                curveToRelative(0.1f, -0.04f, 2.62f, -0.91f, 7.54f, -0.91f)
                reflectiveCurveToRelative(7.43f, 0.87f, 7.54f, 0.91f)
                curveToRelative(0.28f, 0.1f, 0.5f, 0.32f, 0.6f, 0.59f)
                curveToRelative(0.04f, 0.09f, 0.86f, 2.34f, 0.86f, 5.9f)
                curveToRelative(0f, 0.25f, -0.01f, 0.43f, -0.01f, 0.6f)
                curveToRelative(-1.43f, 0.0f, -3.84f, 0.52f, -3.98f, 3.84f)
                curveToRelative(-0.02f, 0.28f, -0.05f, 0.53f, -0.07f, 0.76f)
                curveToRelative(-1.16f, 0.18f, -2.97f, 0.4f, -4.93f, 0.4f)
                reflectiveCurveToRelative(-3.77f, -0.22f, -4.94f, -0.4f)
                curveToRelative(-0.02f, -0.21f, -0.05f, -0.44f, -0.07f, -0.68f)
                curveToRelative(-0.15f, -3.39f, -2.56f, -3.91f, -3.99f, -3.91f)
                close()
                moveTo(21f, 12f)
                curveToRelative(-1.43f, 0f, -1.94f, 0.58f, -2f, 2f)
                curveToRelative(-0.12f, 1.47f, -0.3f, 2.31f, -0.3f, 2.31f)
                reflectiveCurveToRelative(-3.1f, 0.69f, -6.7f, 0.69f)
                reflectiveCurveToRelative(-6.7f, -0.69f, -6.7f, -0.69f)
                reflectiveCurveToRelative(-0.18f, -0.83f, -0.3f, -2.31f)
                curveToRelative(-0.06f, -1.42f, -0.57f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.57f, -2f, 2f)
                curveToRelative(0.09f, 2.32f, 0.46f, 4.07f, 0.73f, 5.05f)
                curveToRelative(0.16f, 0.6f, 0.67f, 1.03f, 1.27f, 1.11f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.78f, 0f, 1.42f, -0.6f, 1.49f, -1.37f)
                curveToRelative(1.62f, 0.2f, 3.65f, 0.37f, 6.01f, 0.37f)
                reflectiveCurveToRelative(4.39f, -0.17f, 6.01f, -0.37f)
                curveToRelative(0.07f, 0.77f, 0.7f, 1.37f, 1.49f, 1.37f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0.61f, -0.08f, 1.12f, -0.51f, 1.27f, -1.11f)
                curveToRelative(0.27f, -0.98f, 0.64f, -2.73f, 0.73f, -5.05f)
                curveToRelative(0f, -1.43f, -0.57f, -2f, -2f, -2f)
                close()
            }
        }.also { _Couch = it}
