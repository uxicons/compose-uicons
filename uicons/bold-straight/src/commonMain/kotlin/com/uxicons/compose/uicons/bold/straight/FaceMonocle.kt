package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMonocle: ImageVector? = null

val Icons.Bs.FaceMonocle: ImageVector
    get() = _FaceMonocle ?: UXIcon(name = "FaceMonocle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 17f)
                verticalLineToRelative(-3f)
                curveToRelative(3.19f, 0f, 5.62f, 1.23f, 7.25f, 3.67f)
                lineToRelative(-2.5f, 1.66f)
                curveToRelative(-1.55f, -2.33f, -3.88f, -2.33f, -4.75f, -2.33f)
                close()
                moveTo(9f, 9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(19f, 10.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 14.74f)
                curveToRelative(-0.47f, 0.17f, -0.97f, 0.26f, -1.5f, 0.26f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(16f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.68f, 0f, 1.35f, -0.07f, 2f, -0.18f)
                verticalLineToRelative(-3.05f)
                curveToRelative(-0.64f, 0.15f, -1.31f, 0.23f, -2f, 0.23f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(7.91f)
                curveToRelative(1.86f, -2.12f, 3f, -4.88f, 3f, -7.91f)
                close()
            }
        }.also { _FaceMonocle = it}
