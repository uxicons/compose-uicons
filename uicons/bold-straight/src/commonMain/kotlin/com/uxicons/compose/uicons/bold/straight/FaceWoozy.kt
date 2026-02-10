package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWoozy: ImageVector? = null

val Icons.Bs.FaceWoozy: ImageVector
    get() = _FaceWoozy ?: UXIcon(name = "FaceWoozy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(15.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 1.34f, -1.5f, 3f)
                reflectiveCurveToRelative(0.67f, 3f, 1.5f, 3f)
                reflectiveCurveToRelative(1.5f, -1.34f, 1.5f, -3f)
                reflectiveCurveToRelative(-0.67f, -3f, -1.5f, -3f)
                close()
                moveTo(11.67f, 10.84f)
                lineToRelative(-1.34f, -2.68f)
                lineToRelative(-4f, 2f)
                lineToRelative(1.34f, 2.68f)
                lineToRelative(4f, -2f)
                close()
                moveTo(19.3f, 15.25f)
                lineToRelative(-2.6f, -1.5f)
                curveToRelative(-0.63f, 1.08f, -1.56f, 2.04f, -2.01f, 2.22f)
                curveToRelative(-0.17f, -0.13f, -0.44f, -0.39f, -0.61f, -0.55f)
                curveToRelative(-0.66f, -0.63f, -1.48f, -1.42f, -2.58f, -1.42f)
                curveToRelative(-0.95f, 0f, -1.63f, 0.45f, -2.08f, 0.75f)
                curveToRelative(-0.12f, 0.08f, -0.29f, 0.19f, -0.38f, 0.23f)
                curveToRelative(-0.4f, -0.17f, -1.3f, -0.86f, -1.98f, -1.55f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(0.91f, 0.91f, 2.65f, 2.44f, 4.06f, 2.44f)
                curveToRelative(0.95f, 0f, 1.63f, -0.45f, 2.08f, -0.75f)
                curveToRelative(0.1f, -0.07f, 0.23f, -0.15f, 0.32f, -0.2f)
                curveToRelative(0.17f, 0.13f, 0.43f, 0.38f, 0.59f, 0.54f)
                curveToRelative(0.66f, 0.63f, 1.48f, 1.42f, 2.58f, 1.42f)
                curveToRelative(2.37f, 0f, 4.21f, -2.87f, 4.72f, -3.75f)
                close()
                moveTo(9.83f, 6.05f)
                lineToRelative(-1.66f, -1.11f)
                curveToRelative(-0.77f, 1.16f, -1.85f, 2.06f, -3.04f, 2.53f)
                lineToRelative(0.74f, 1.86f)
                curveToRelative(1.58f, -0.63f, 2.95f, -1.77f, 3.96f, -3.28f)
                close()
            }
        }.also { _FaceWoozy = it}
