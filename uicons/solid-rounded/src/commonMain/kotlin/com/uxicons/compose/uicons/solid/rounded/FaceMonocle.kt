package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMonocle: ImageVector? = null

val Icons.Sr.FaceMonocle: ImageVector
    get() = _FaceMonocle ?: UXIcon(name = "FaceMonocle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20f, 20.93f)
                lineTo(20f, 10.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.93f, 0f, 1.78f, -0.28f, 2.5f, -0.76f)
                verticalLineToRelative(8.14f)
                curveToRelative(-1.77f, 1.02f, -3.81f, 1.62f, -6f, 1.62f)
                curveTo(5.37f, 24f, 0f, 18.63f, 0f, 12f)
                reflectiveCurveTo(5.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.37f, 12f, 12f)
                curveToRelative(0f, 3.55f, -1.55f, 6.73f, -4f, 8.93f)
                close()
                moveTo(6f, 8.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(7f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(0.95f, 0f, 3.46f, 0f, 5.17f, 2.56f)
                curveToRelative(0.19f, 0.29f, 0.51f, 0.45f, 0.83f, 0.45f)
                curveToRelative(0.19f, 0f, 0.38f, -0.06f, 0.55f, -0.17f)
                curveToRelative(0.46f, -0.31f, 0.58f, -0.93f, 0.28f, -1.39f)
                curveToRelative(-1.52f, -2.29f, -3.82f, -3.44f, -6.83f, -3.44f)
                close()
                moveTo(18f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.07f)
                curveToRelative(-0.61f, 0.55f, -1.28f, 1.04f, -2f, 1.46f)
                verticalLineToRelative(0.62f)
                close()
            }
        }.also { _FaceMonocle = it}
