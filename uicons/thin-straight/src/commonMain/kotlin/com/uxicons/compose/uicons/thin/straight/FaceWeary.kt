package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Ts.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(7.17f, 10f)
                curveToRelative(-0.78f, 0f, -1.56f, -0.21f, -2.23f, -0.62f)
                lineToRelative(0.52f, -0.85f)
                curveToRelative(0.66f, 0.4f, 1.47f, 0.56f, 2.22f, 0.43f)
                curveToRelative(0.61f, -0.1f, 1.46f, -0.44f, 2.09f, -1.48f)
                lineToRelative(0.85f, 0.52f)
                curveToRelative(-0.83f, 1.36f, -1.97f, 1.81f, -2.78f, 1.94f)
                curveToRelative(-0.22f, 0.04f, -0.45f, 0.06f, -0.68f, 0.06f)
                close()
                moveTo(18.55f, 8.53f)
                lineToRelative(0.52f, 0.85f)
                curveToRelative(-0.66f, 0.41f, -1.45f, 0.62f, -2.23f, 0.62f)
                curveToRelative(-0.23f, 0f, -0.46f, -0.02f, -0.68f, -0.06f)
                curveToRelative(-0.81f, -0.14f, -1.95f, -0.58f, -2.78f, -1.94f)
                lineToRelative(0.85f, -0.52f)
                curveToRelative(0.63f, 1.04f, 1.49f, 1.38f, 2.09f, 1.48f)
                curveToRelative(0.75f, 0.13f, 1.56f, -0.03f, 2.22f, -0.43f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-4.3f, 0f, -5.9f, 4.92f, -5.97f, 5.13f)
                lineToRelative(-0.28f, 0.88f)
                lineToRelative(0.89f, -0.24f)
                curveToRelative(0.03f, -0.01f, 2.81f, -0.76f, 5.36f, -0.76f)
                reflectiveCurveToRelative(5.34f, 0.75f, 5.37f, 0.76f)
                lineToRelative(0.89f, 0.24f)
                lineToRelative(-0.28f, -0.88f)
                curveToRelative(-0.07f, -0.21f, -1.68f, -5.13f, -5.97f, -5.13f)
                close()
                moveTo(11.99f, 17f)
                curveToRelative(-1.76f, 0f, -3.58f, 0.33f, -4.66f, 0.56f)
                curveToRelative(0.62f, -1.29f, 2.08f, -3.56f, 4.65f, -3.56f)
                horizontalLineToRelative(0.01f)
                curveToRelative(2.56f, 0f, 4.03f, 2.27f, 4.66f, 3.56f)
                curveToRelative(-1.08f, -0.24f, -2.9f, -0.56f, -4.66f, -0.56f)
                close()
            }
        }.also { _FaceWeary = it}
