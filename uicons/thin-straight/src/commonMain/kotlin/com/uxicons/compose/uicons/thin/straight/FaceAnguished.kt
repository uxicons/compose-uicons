package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAnguished: ImageVector? = null

val Icons.Ts.FaceAnguished: ImageVector
    get() = _FaceAnguished ?: UXIcon(name = "FaceAnguished") {
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
                moveTo(8.94f, 5.96f)
                curveToRelative(-1.57f, 0.67f, -2.84f, 1.72f, -3.68f, 3.05f)
                lineToRelative(-0.84f, -0.54f)
                curveToRelative(0.95f, -1.5f, 2.38f, -2.69f, 4.13f, -3.44f)
                lineToRelative(0.39f, 0.92f)
                close()
                moveTo(19.64f, 8.47f)
                lineToRelative(-0.83f, 0.55f)
                curveToRelative(-0.88f, -1.33f, -2.18f, -2.38f, -3.75f, -3.06f)
                lineToRelative(0.39f, -0.92f)
                curveToRelative(1.76f, 0.75f, 3.21f, 1.94f, 4.2f, 3.43f)
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
                moveTo(12f, 14f)
                curveToRelative(-2.54f, 0f, -4.66f, 1.91f, -4.95f, 4.44f)
                lineToRelative(-0.06f, 0.56f)
                horizontalLineToRelative(10.02f)
                lineToRelative(-0.06f, -0.56f)
                curveToRelative(-0.28f, -2.53f, -2.41f, -4.44f, -4.95f, -4.44f)
                close()
                moveTo(8.15f, 18f)
                curveToRelative(0.45f, -1.74f, 2.02f, -3f, 3.85f, -3f)
                reflectiveCurveToRelative(3.4f, 1.26f, 3.85f, 3f)
                horizontalLineToRelative(-7.7f)
                close()
            }
        }.also { _FaceAnguished = it}
