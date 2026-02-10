package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRaisedEyebrow: ImageVector? = null

val Icons.Rc.FaceRaisedEyebrow: ImageVector
    get() = _FaceRaisedEyebrow ?: UXIcon(name = "FaceRaisedEyebrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 17f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                reflectiveCurveToRelative(-11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 6.56f, -2.44f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                close()
                moveTo(14f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(13.89f, 8.95f)
                curveToRelative(0.4f, -0.8f, 0.79f, -0.93f, 1.16f, -0.95f)
                curveToRelative(0.24f, -0.01f, 0.48f, 0.06f, 1.04f, 0.31f)
                curveToRelative(0.5f, 0.23f, 1.09f, 0.0f, 1.32f, -0.5f)
                reflectiveCurveToRelative(0.0f, -1.1f, -0.5f, -1.32f)
                curveToRelative(-0.64f, -0.29f, -1.24f, -0.53f, -1.96f, -0.49f)
                curveToRelative(-1.24f, 0.06f, -2.19f, 0.75f, -2.84f, 2.05f)
                curveToRelative(-0.25f, 0.49f, -0.05f, 1.09f, 0.45f, 1.34f)
                curveToRelative(0.48f, 0.24f, 1.09f, 0.05f, 1.34f, -0.45f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _FaceRaisedEyebrow = it}
