package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMonocle: ImageVector? = null

val Icons.Ss.FaceMonocle: ImageVector
    get() = _FaceMonocle ?: UXIcon(name = "FaceMonocle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20f, 20.93f)
                lineTo(20f, 10f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.25f, -2.25f, -2.16f, -4f, -4.47f, -4f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.92f, 0f, 1.78f, -0.28f, 2.5f, -0.76f)
                verticalLineToRelative(8.14f)
                curveToRelative(-1.77f, 1.02f, -3.81f, 1.62f, -6f, 1.62f)
                curveTo(5.37f, 24f, 0f, 18.63f, 0f, 12f)
                reflectiveCurveTo(5.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.37f, 12f, 12f)
                curveToRelative(0f, 3.55f, -1.55f, 6.73f, -4f, 8.93f)
                close()
                moveTo(7.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(7f, 14f)
                verticalLineToRelative(2f)
                curveToRelative(0.95f, 0f, 3.46f, 0f, 5.17f, 2.56f)
                lineToRelative(1.66f, -1.11f)
                curveToRelative(-1.52f, -2.29f, -3.82f, -3.44f, -6.83f, -3.44f)
                close()
                moveTo(18f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.07f)
                curveToRelative(-0.61f, 0.55f, -1.28f, 1.04f, -2f, 1.46f)
                verticalLineToRelative(1.62f)
                close()
            }
        }.also { _FaceMonocle = it}
