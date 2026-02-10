package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRaisedEyebrow: ImageVector? = null

val Icons.Sr.FaceRaisedEyebrow: ImageVector
    get() = _FaceRaisedEyebrow ?: UXIcon(name = "FaceRaisedEyebrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(10f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(16f, 17f)
                lineTo(8f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.95f, 7.71f)
                curveToRelative(-0.46f, 0.31f, -1.08f, 0.2f, -1.39f, -0.26f)
                curveToRelative(-0.03f, -0.03f, -0.37f, -0.46f, -1.06f, -0.46f)
                curveToRelative(-0.97f, 0f, -1.57f, 1.36f, -1.57f, 1.38f)
                curveToRelative(-0.16f, 0.38f, -0.53f, 0.62f, -0.93f, 0.62f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.02f, -0.38f, -0.07f)
                curveToRelative(-0.51f, -0.21f, -0.76f, -0.79f, -0.55f, -1.3f)
                curveToRelative(0.39f, -0.98f, 1.56f, -2.63f, 3.43f, -2.63f)
                curveToRelative(1.74f, 0f, 2.61f, 1.19f, 2.71f, 1.32f)
                curveToRelative(0.31f, 0.46f, 0.2f, 1.08f, -0.26f, 1.39f)
                close()
            }
        }.also { _FaceRaisedEyebrow = it}
