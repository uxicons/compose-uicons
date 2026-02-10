package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleTrash: ImageVector? = null

val Icons.Rc.CircleTrash: ImageVector
    get() = _CircleTrash ?: UXIcon(name = "CircleTrash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(17.28f, 8.16f)
                curveToRelative(-0.06f, -0.02f, -0.92f, -0.26f, -2.26f, -0.45f)
                curveToRelative(-0.16f, -0.6f, -0.33f, -0.95f, -0.36f, -1.02f)
                curveToRelative(-0.14f, -0.27f, -0.39f, -0.46f, -0.69f, -0.52f)
                curveToRelative(-0.03f, -0.01f, -0.85f, -0.18f, -1.98f, -0.18f)
                reflectiveCurveToRelative(-1.93f, 0.17f, -1.96f, 0.18f)
                curveToRelative(-0.29f, 0.06f, -0.54f, 0.25f, -0.68f, 0.52f)
                curveToRelative(-0.04f, 0.07f, -0.2f, 0.42f, -0.36f, 1.01f)
                curveToRelative(-1.35f, 0.19f, -2.22f, 0.44f, -2.28f, 0.45f)
                curveToRelative(-0.53f, 0.15f, -0.83f, 0.71f, -0.68f, 1.24f)
                curveToRelative(0.13f, 0.44f, 0.53f, 0.72f, 0.96f, 0.72f)
                curveToRelative(0.01f, 0f, 0.02f, -0.0f, 0.03f, -0.0f)
                curveToRelative(-0.02f, 0.55f, -0.03f, 1.17f, -0.03f, 1.72f)
                curveToRelative(0f, 3.0f, 0.52f, 4.87f, 0.54f, 4.94f)
                curveToRelative(0.09f, 0.32f, 0.34f, 0.58f, 0.66f, 0.68f)
                curveToRelative(0.07f, 0.02f, 1.67f, 0.53f, 3.81f, 0.53f)
                reflectiveCurveToRelative(3.74f, -0.51f, 3.81f, -0.53f)
                curveToRelative(0.32f, -0.1f, 0.56f, -0.36f, 0.66f, -0.68f)
                curveToRelative(0.02f, -0.08f, 0.54f, -1.95f, 0.54f, -4.94f)
                curveToRelative(0f, -0.56f, -0.01f, -1.18f, -0.03f, -1.74f)
                curveToRelative(0.44f, 0.01f, 0.86f, -0.26f, 0.99f, -0.7f)
                curveToRelative(0.15f, -0.53f, -0.15f, -1.08f, -0.68f, -1.24f)
                close()
                moveTo(14.66f, 15.7f)
                curveToRelative(-0.56f, 0.13f, -1.53f, 0.3f, -2.66f, 0.3f)
                reflectiveCurveToRelative(-2.09f, -0.17f, -2.66f, -0.3f)
                curveToRelative(-0.14f, -0.7f, -0.34f, -2.06f, -0.34f, -3.86f)
                curveToRelative(0f, -0.68f, 0.02f, -1.5f, 0.04f, -2.11f)
                curveToRelative(0.8f, -0.12f, 1.82f, -0.23f, 2.96f, -0.23f)
                reflectiveCurveToRelative(2.16f, 0.11f, 2.96f, 0.23f)
                curveToRelative(0.02f, 0.62f, 0.04f, 1.43f, 0.04f, 2.11f)
                curveToRelative(0f, 1.8f, -0.2f, 3.16f, -0.34f, 3.86f)
                close()
            }
        }.also { _CircleTrash = it}
