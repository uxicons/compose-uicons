package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRaisedEyebrow: ImageVector? = null

val Icons.Bs.FaceRaisedEyebrow: ImageVector
    get() = _FaceRaisedEyebrow ?: UXIcon(name = "FaceRaisedEyebrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                curveToRelative(0f, -1.85f, 0.56f, -3.57f, 1.52f, -5f)
                horizontalLineToRelative(5.48f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.65f)
                curveToRelative(1.55f, -1.25f, 3.51f, -2f, 5.65f, -2f)
                curveToRelative(2.38f, 0f, 4.54f, 0.93f, 6.15f, 2.44f)
                curveToRelative(-0.68f, -0.29f, -1.41f, -0.44f, -2.15f, -0.44f)
                curveToRelative(-1.67f, 0f, -3.23f, 0.74f, -4.28f, 2.04f)
                lineToRelative(1.55f, 1.26f)
                curveToRelative(0.67f, -0.83f, 1.66f, -1.3f, 2.72f, -1.3f)
                curveToRelative(0.7f, 0f, 1.37f, 0.2f, 1.94f, 0.59f)
                lineToRelative(0.93f, -1.39f)
                curveToRelative(1.32f, 1.57f, 2.13f, 3.59f, 2.13f, 5.8f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 17f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(8f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _FaceRaisedEyebrow = it}
