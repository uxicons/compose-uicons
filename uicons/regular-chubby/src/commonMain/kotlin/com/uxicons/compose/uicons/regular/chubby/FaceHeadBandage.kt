package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceHeadBandage: ImageVector? = null

val Icons.Rc.FaceHeadBandage: ImageVector
    get() = _FaceHeadBandage ?: UXIcon(name = "FaceHeadBandage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(4.94f, 1.04f, 1.14f, 4.84f, 1.01f, 11.98f)
                curveToRelative(0f, 0f, -0.83f, 11.02f, 11f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.94f, -11f, -10.98f)
                close()
                moveTo(20.98f, 11.36f)
                curveToRelative(-3.16f, -5.1f, -8.03f, -7.53f, -14.3f, -7.14f)
                curveToRelative(1.38f, -0.8f, 3.15f, -1.21f, 5.32f, -1.22f)
                curveToRelative(5.66f, 0.04f, 8.68f, 2.86f, 8.98f, 8.36f)
                close()
                moveTo(4.34f, 6.51f)
                curveToRelative(2.4f, -0.42f, 4.58f, -0.44f, 6.53f, -0.07f)
                curveToRelative(-2.44f, 0.22f, -5.07f, 1.26f, -7.72f, 3.67f)
                curveToRelative(0.2f, -1.41f, 0.59f, -2.61f, 1.19f, -3.6f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-5.67f, -0.03f, -8.54f, -2.57f, -8.95f, -7.96f)
                curveToRelative(4.26f, -4.77f, 9.02f, -5.87f, 14.13f, -3.28f)
                curveToRelative(1.38f, 1.38f, 2.54f, 3.15f, 3.45f, 5.32f)
                curveToRelative(-0.94f, 3.99f, -3.74f, 5.89f, -8.63f, 5.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.31f, 17.29f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.42f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.41f, 0.01f)
                curveToRelative(1.62f, -1.6f, 4.29f, -2.22f, 6.6f, 0.01f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.28f, 0.69f, 0.28f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.72f, -0.31f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.03f, -1.41f)
                curveToRelative(-3.26f, -3.15f, -7.16f, -2.2f, -9.39f, 0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.0f, 10f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.45f, -1.0f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1.0f, 1f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1.0f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.01f, 14f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1.0f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1.0f, -1f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1.0f, 1f)
                close()
            }
        }.also { _FaceHeadBandage = it}
