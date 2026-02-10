package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileHorns: ImageVector? = null

val Icons.Bs.FaceSmileHorns: ImageVector
    get() = _FaceSmileHorns ?: UXIcon(name = "FaceSmileHorns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.06f, 8.33f)
                lineToRelative(1.88f, 2.34f)
                lineToRelative(-2.5f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.26f, 0.2f, -0.58f, 0.33f, -0.94f, 0.33f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.47f, 0.22f, -0.9f, 0.56f, -1.17f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2.5f, -2f, 2.5f, -2f)
                close()
                moveTo(8.56f, 12.67f)
                curveToRelative(0.26f, 0.21f, 0.58f, 0.33f, 0.94f, 0.33f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.47f, -0.22f, -0.9f, -0.56f, -1.17f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-2.5f, -2f, -2.5f, -2f)
                lineToRelative(-1.88f, 2.34f)
                lineToRelative(2.5f, 2f)
                horizontalLineToRelative(0f)
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
                moveTo(21.0f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
                moveTo(12.0f, 16f)
                curveToRelative(-1.86f, 0f, -3.49f, -1.41f, -3.5f, -1.42f)
                lineToRelative(-2.0f, 2.24f)
                curveToRelative(0.1f, 0.09f, 2.48f, 2.18f, 5.5f, 2.18f)
                reflectiveCurveToRelative(5.4f, -2.09f, 5.5f, -2.18f)
                lineToRelative(-1.99f, -2.24f)
                curveToRelative(-0.02f, 0.01f, -1.65f, 1.42f, -3.51f, 1.42f)
                close()
            }
        }.also { _FaceSmileHorns = it}
