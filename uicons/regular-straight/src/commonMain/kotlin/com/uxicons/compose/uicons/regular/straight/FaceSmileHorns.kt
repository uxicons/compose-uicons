package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileHorns: ImageVector? = null

val Icons.Rs.FaceSmileHorns: ImageVector
    get() = _FaceSmileHorns ?: UXIcon(name = "FaceSmileHorns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.34f, 15.25f)
                lineToRelative(1.33f, 1.49f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                reflectiveCurveToRelative(-5.56f, -2.16f, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                curveToRelative(0.02f, 0.02f, 2.0f, 1.75f, 4.34f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                close()
                moveTo(14.72f, 10.21f)
                curveToRelative(-0.43f, 0.26f, -0.72f, 0.74f, -0.72f, 1.28f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.15f, -0.02f, -0.3f, -0.07f, -0.44f)
                lineToRelative(1.67f, -1.26f)
                lineToRelative(-1.2f, -1.6f)
                lineToRelative(-2.67f, 2.02f)
                close()
                moveTo(22.75f, 6.67f)
                curveToRelative(0.8f, 1.61f, 1.25f, 3.42f, 1.25f, 5.33f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -1.91f, 0.45f, -3.72f, 1.25f, -5.33f)
                lineTo(0f, 0f)
                lineTo(4.99f, 2.27f)
                curveTo(6.96f, 0.84f, 9.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.04f, 0.84f, 7.01f, 2.27f)
                lineTo(24f, 0f)
                lineToRelative(-1.25f, 6.67f)
                close()
                moveTo(22f, 12.0f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
                moveTo(7f, 11.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.55f, -0.29f, -1.02f, -0.72f, -1.28f)
                lineToRelative(-2.67f, -2.02f)
                lineToRelative(-1.2f, 1.6f)
                lineToRelative(1.67f, 1.26f)
                curveToRelative(-0.04f, 0.14f, -0.07f, 0.29f, -0.07f, 0.44f)
                close()
            }
        }.also { _FaceSmileHorns = it}
