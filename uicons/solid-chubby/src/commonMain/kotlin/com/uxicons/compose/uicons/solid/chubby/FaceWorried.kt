package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWorried: ImageVector? = null

val Icons.Sc.FaceWorried: ImageVector
    get() = _FaceWorried ?: UXIcon(name = "FaceWorried") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(15.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(10f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(6f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-0.88f, 0f, -1f, 0.12f, -1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(16.64f, 18.27f)
                curveToRelative(-0.23f, 0.19f, -0.56f, 0.26f, -0.85f, 0.2f)
                curveToRelative(-0.4f, -0.08f, -2.47f, -0.48f, -3.79f, -0.48f)
                reflectiveCurveToRelative(-3.38f, 0.4f, -3.79f, 0.48f)
                curveToRelative(-0.73f, 0.17f, -1.42f, -0.58f, -1.16f, -1.29f)
                curveToRelative(0.61f, -1.84f, 2.69f, -3.18f, 4.95f, -3.18f)
                curveToRelative(2.25f, 0.0f, 4.34f, 1.34f, 4.95f, 3.18f)
                curveToRelative(0.13f, 0.39f, 0.01f, 0.83f, -0.31f, 1.09f)
                close()
                moveTo(18f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.88f, -0.12f, -1f, -1f, -1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(1.99f, 0f, 3f, 1.01f, 3f, 3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FaceWorried = it}
