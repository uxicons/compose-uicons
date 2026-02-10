package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Rc.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.88f, 0.12f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(7f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(0.88f, 0f, 1f, -0.12f, 1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.99f, -1.01f, 3f, -3f, 3f)
                close()
                moveTo(16.95f, 16.18f)
                curveToRelative(0.09f, 0.26f, 0.06f, 0.55f, -0.07f, 0.79f)
                curveToRelative(-0.21f, 0.39f, -0.67f, 0.59f, -1.09f, 0.51f)
                curveToRelative(-0.4f, -0.08f, -2.47f, -0.48f, -3.79f, -0.48f)
                curveToRelative(-1.31f, 0f, -3.38f, 0.4f, -3.79f, 0.48f)
                curveToRelative(-0.29f, 0.06f, -0.62f, -0.01f, -0.85f, -0.2f)
                curveToRelative(-0.32f, -0.26f, -0.45f, -0.69f, -0.31f, -1.09f)
                curveToRelative(0.61f, -1.84f, 2.69f, -3.18f, 4.95f, -3.18f)
                curveToRelative(2.25f, 0.0f, 4.34f, 1.34f, 4.95f, 3.18f)
                close()
            }
        }.also { _FaceWeary = it}
