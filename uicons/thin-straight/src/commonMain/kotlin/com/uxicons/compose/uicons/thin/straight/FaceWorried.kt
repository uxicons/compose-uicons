package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWorried: ImageVector? = null

val Icons.Ts.FaceWorried: ImageVector
    get() = _FaceWorried ?: UXIcon(name = "FaceWorried") {
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
                moveTo(9f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(5.26f, 9.01f)
                lineToRelative(-0.84f, -0.54f)
                curveToRelative(0.95f, -1.5f, 2.38f, -2.69f, 4.13f, -3.43f)
                lineToRelative(0.39f, 0.92f)
                curveToRelative(-1.57f, 0.67f, -2.84f, 1.72f, -3.68f, 3.05f)
                close()
                moveTo(19.64f, 8.47f)
                lineToRelative(-0.83f, 0.55f)
                curveToRelative(-0.88f, -1.33f, -2.18f, -2.38f, -3.76f, -3.06f)
                lineToRelative(0.39f, -0.92f)
                curveToRelative(1.76f, 0.75f, 3.21f, 1.94f, 4.2f, 3.43f)
                close()
                moveTo(12.0f, 13f)
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
                curveToRelative(-1.77f, 0f, -3.58f, 0.33f, -4.66f, 0.56f)
                curveToRelative(0.62f, -1.29f, 2.08f, -3.56f, 4.65f, -3.56f)
                horizontalLineToRelative(0.01f)
                curveToRelative(2.56f, 0f, 4.03f, 2.27f, 4.66f, 3.56f)
                curveToRelative(-1.08f, -0.24f, -2.9f, -0.56f, -4.67f, -0.56f)
                close()
            }
        }.also { _FaceWorried = it}
