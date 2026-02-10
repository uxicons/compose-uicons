package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawPolygon: ImageVector? = null

val Icons.Sc.DrawPolygon: ImageVector
    get() = _DrawPolygon ?: UXIcon(name = "DrawPolygon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 17f)
                curveToRelative(-1.56f, -2.32f, -2.64f, -3.42f, -4.01f, -4.9f)
                curveToRelative(0.01f, -0.07f, 0.01f, -0.13f, 0f, -0.2f)
                curveToRelative(1.37f, -1.48f, 2.39f, -2.59f, 3.95f, -4.9f)
                curveToRelative(2.0f, 0.04f, 3.07f, -0.99f, 3.06f, -3.0f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                curveToRelative(-1.11f, 0f, -1.9f, 0.32f, -2.39f, 0.94f)
                curveToRelative(-1.52f, -0.22f, -3.57f, -0.44f, -5.61f, -0.44f)
                reflectiveCurveToRelative(-4.1f, 0.23f, -5.61f, 0.44f)
                curveToRelative(-0.49f, -0.62f, -1.29f, -0.94f, -2.39f, -0.94f)
                curveToRelative(-1.99f, 0f, -3f, 1.01f, -3f, 3f)
                curveToRelative(0f, 1.11f, 0.32f, 1.9f, 0.94f, 2.39f)
                curveToRelative(-0.22f, 1.53f, -0.44f, 3.58f, -0.44f, 5.61f)
                curveToRelative(0f, 2.04f, 0.23f, 4.1f, 0.44f, 5.61f)
                curveToRelative(-0.62f, 0.49f, -0.94f, 1.29f, -0.94f, 2.39f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                curveToRelative(1.11f, 0f, 1.9f, -0.32f, 2.39f, -0.94f)
                curveToRelative(1.51f, 0.22f, 3.56f, 0.44f, 5.61f, 0.44f)
                reflectiveCurveToRelative(4.1f, -0.23f, 5.61f, -0.44f)
                curveToRelative(0.49f, 0.62f, 1.29f, 0.94f, 2.39f, 0.94f)
                curveToRelative(1.99f, 0f, 3f, -1.01f, 3f, -3f)
                reflectiveCurveToRelative(-1.01f, -3f, -3f, -3f)
                close()
                moveTo(17.09f, 19.1f)
                curveToRelative(-1.39f, 0.2f, -3.26f, 0.4f, -5.09f, 0.4f)
                reflectiveCurveToRelative(-3.7f, -0.2f, -5.09f, -0.4f)
                curveToRelative(-0.22f, -1.11f, -0.9f, -1.78f, -2.01f, -2.01f)
                curveToRelative(-0.2f, -1.39f, -0.4f, -3.26f, -0.4f, -5.09f)
                reflectiveCurveToRelative(0.2f, -3.68f, 0.4f, -5.09f)
                curveToRelative(1.11f, -0.22f, 1.78f, -0.9f, 2.01f, -2.01f)
                curveToRelative(1.39f, -0.2f, 3.26f, -0.4f, 5.09f, -0.4f)
                reflectiveCurveToRelative(3.69f, 0.2f, 5.09f, 0.4f)
                curveToRelative(0.05f, 0.24f, 0.12f, 0.45f, 0.2f, 0.65f)
                curveToRelative(-1.08f, 1.61f, -2.05f, 2.7f, -2.91f, 3.67f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.39f, -0.14f, -0.85f, -0.22f, -1.38f, -0.22f)
                curveToRelative(-1.99f, 0f, -3f, 1.01f, -3f, 3f)
                reflectiveCurveToRelative(1.01f, 3f, 3f, 3f)
                curveToRelative(0.53f, 0f, 0.99f, -0.08f, 1.38f, -0.22f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.86f, 0.97f, 1.83f, 2.06f, 2.91f, 3.67f)
                curveToRelative(-0.09f, 0.2f, -0.16f, 0.41f, -0.2f, 0.65f)
                close()
            }
        }.also { _DrawPolygon = it}
