package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWoozy: ImageVector? = null

val Icons.Rs.FaceWoozy: ImageVector
    get() = _FaceWoozy ?: UXIcon(name = "FaceWoozy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(5.37f, 9.33f)
                lineToRelative(-0.74f, -1.86f)
                curveToRelative(1.19f, -0.47f, 2.27f, -1.37f, 3.04f, -2.53f)
                lineToRelative(1.66f, 1.11f)
                curveToRelative(-1.01f, 1.51f, -2.38f, 2.65f, -3.96f, 3.28f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, -1.66f, 0.67f, -3f, 1.5f, -3f)
                reflectiveCurveToRelative(1.5f, 1.34f, 1.5f, 3f)
                reflectiveCurveToRelative(-0.67f, 3f, -1.5f, 3f)
                reflectiveCurveToRelative(-1.5f, -1.34f, -1.5f, -3f)
                close()
                moveTo(6.55f, 11.11f)
                lineToRelative(4f, -2f)
                lineToRelative(0.9f, 1.79f)
                lineToRelative(-4f, 2f)
                lineToRelative(-0.9f, -1.79f)
                close()
                moveTo(17.14f, 14.5f)
                lineToRelative(1.73f, 1f)
                curveToRelative(-0.34f, 0.58f, -2.13f, 3.5f, -4.29f, 3.5f)
                curveToRelative(-0.9f, 0f, -1.61f, -0.68f, -2.23f, -1.28f)
                curveToRelative(-0.26f, -0.25f, -0.7f, -0.68f, -0.88f, -0.72f)
                curveToRelative(-0.15f, 0.0f, -0.34f, 0.12f, -0.66f, 0.34f)
                curveToRelative(-0.42f, 0.28f, -1.0f, 0.67f, -1.8f, 0.67f)
                curveToRelative(-1.28f, 0f, -3.02f, -1.6f, -3.71f, -2.29f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(0.85f, 0.85f, 1.95f, 1.66f, 2.31f, 1.71f)
                curveToRelative(0.17f, 0f, 0.36f, -0.12f, 0.68f, -0.33f)
                curveToRelative(0.42f, -0.28f, 1.0f, -0.67f, 1.8f, -0.67f)
                curveToRelative(0.9f, 0f, 1.61f, 0.68f, 2.23f, 1.28f)
                curveToRelative(0.26f, 0.25f, 0.7f, 0.68f, 0.88f, 0.72f)
                curveToRelative(0.68f, -0.0f, 1.91f, -1.46f, 2.52f, -2.5f)
                close()
            }
        }.also { _FaceWoozy = it}
