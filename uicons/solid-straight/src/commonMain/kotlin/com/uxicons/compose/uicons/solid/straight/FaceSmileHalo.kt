package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileHalo: ImageVector? = null

val Icons.Ss.FaceSmileHalo: ImageVector
    get() = _FaceSmileHalo ?: UXIcon(name = "FaceSmileHalo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.6f, 6.39f)
                curveToRelative(-2.11f, 1.08f, -5.62f, 1.61f, -10.6f, 1.61f)
                reflectiveCurveTo(3.51f, 7.46f, 1.4f, 6.39f)
                curveToRelative(-0.89f, 1.68f, -1.4f, 3.58f, -1.4f, 5.61f)
                curveToRelative(0f, 6.63f, 5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                curveToRelative(0f, -2.03f, -0.51f, -3.94f, -1.4f, -5.61f)
                close()
                moveTo(8f, 10f)
                curveToRelative(1.77f, 0f, 3f, 2.11f, 3f, 4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.89f, 1.23f, -4f, 3f, -4f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.11f, 0f, -5.56f, -2.16f, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                curveToRelative(0.02f, 0.02f, 2.0f, 1.75f, 4.34f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                lineToRelative(1.33f, 1.49f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.89f, 1.23f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-2.58f, 0f, -11f, -0.22f, -11f, -3f)
                reflectiveCurveTo(9.42f, 0f, 12f, 0f)
                reflectiveCurveToRelative(11f, 0.22f, 11f, 3f)
                reflectiveCurveToRelative(-8.42f, 3f, -11f, 3f)
                close()
                moveTo(3.5f, 3f)
                curveToRelative(1.22f, 0.45f, 4.14f, 1f, 8.5f, 1f)
                reflectiveCurveToRelative(7.28f, -0.55f, 8.5f, -1f)
                curveToRelative(-1.22f, -0.45f, -4.14f, -1f, -8.5f, -1f)
                reflectiveCurveToRelative(-7.28f, 0.55f, -8.5f, 1f)
                close()
            }
        }.also { _FaceSmileHalo = it}
