package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileHorns: ImageVector? = null

val Icons.Ss.FaceSmileHorns: ImageVector
    get() = _FaceSmileHorns ?: UXIcon(name = "FaceSmileHorns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                lineToRelative(-5f, 2.27f)
                curveToRelative(-1.97f, -1.42f, -4.39f, -2.27f, -7f, -2.27f)
                reflectiveCurveTo(6.97f, 0.85f, 5f, 2.27f)
                lineTo(0f, 0f)
                lineTo(1.25f, 6.69f)
                curveToRelative(-0.8f, 1.6f, -1.25f, 3.4f, -1.25f, 5.31f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -1.91f, -0.46f, -3.71f, -1.25f, -5.31f)
                lineToRelative(1.25f, -6.69f)
                close()
                moveTo(6.6f, 8.2f)
                reflectiveCurveToRelative(2.79f, 2.1f, 2.84f, 2.14f)
                lineToRelative(0.01f, 0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(0.34f, 0.28f, 0.55f, 0.69f, 0.55f, 1.16f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.15f, 0.03f, -0.3f, 0.07f, -0.44f)
                lineToRelative(-1.68f, -1.26f)
                lineToRelative(1.2f, -1.6f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.11f, 0f, -5.56f, -2.16f, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                curveToRelative(0.02f, 0.02f, 2.0f, 1.75f, 4.34f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                lineToRelative(1.33f, 1.49f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                close()
                moveTo(16.93f, 11.06f)
                curveToRelative(0.04f, 0.14f, 0.07f, 0.28f, 0.07f, 0.44f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.47f, 0.22f, -0.88f, 0.55f, -1.15f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(0.04f, -0.04f, 2.84f, -2.14f, 2.84f, -2.14f)
                lineToRelative(1.2f, 1.6f)
                lineToRelative(-1.68f, 1.26f)
                close()
            }
        }.also { _FaceSmileHorns = it}
