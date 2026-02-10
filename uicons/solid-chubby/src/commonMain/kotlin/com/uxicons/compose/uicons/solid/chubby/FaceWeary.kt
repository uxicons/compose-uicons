package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Sc.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.88f, 0f, 1f, -0.12f, 1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.99f, -1.01f, 3f, -3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(16.88f, 16.97f)
                curveToRelative(-0.21f, 0.39f, -0.67f, 0.59f, -1.09f, 0.51f)
                curveToRelative(-0.4f, -0.08f, -2.47f, -0.48f, -3.79f, -0.48f)
                curveToRelative(-1.31f, 0f, -3.38f, 0.4f, -3.79f, 0.48f)
                curveToRelative(-3.46f, -0.88f, 1.44f, -4.96f, 3.78f, -4.48f)
                curveToRelative(2.25f, 0.0f, 4.34f, 1.34f, 4.95f, 3.18f)
                curveToRelative(0.09f, 0.26f, 0.06f, 0.55f, -0.07f, 0.79f)
                close()
                moveTo(17f, 11f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.88f, 0.12f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FaceWeary = it}
