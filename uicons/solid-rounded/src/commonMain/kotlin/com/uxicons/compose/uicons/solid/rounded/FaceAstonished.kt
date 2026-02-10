package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAstonished: ImageVector? = null

val Icons.Sr.FaceAstonished: ImageVector
    get() = _FaceAstonished ?: UXIcon(name = "FaceAstonished") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(6f, 9f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.07f, -0.62f, -0.22f)
                curveToRelative(-0.43f, -0.34f, -0.5f, -0.97f, -0.16f, -1.41f)
                curveToRelative(0.91f, -1.14f, 2.31f, -2.06f, 3.56f, -2.35f)
                curveToRelative(0.54f, -0.12f, 1.07f, 0.21f, 1.2f, 0.75f)
                curveToRelative(0.12f, 0.54f, -0.21f, 1.07f, -0.75f, 1.2f)
                curveToRelative(-0.81f, 0.19f, -1.82f, 0.86f, -2.44f, 1.65f)
                curveToRelative(-0.2f, 0.25f, -0.49f, 0.38f, -0.78f, 0.38f)
                close()
                moveTo(7f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15f, 17f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.62f, 8.78f)
                curveToRelative(-0.18f, 0.15f, -0.4f, 0.22f, -0.62f, 0.22f)
                curveToRelative(-0.29f, 0f, -0.58f, -0.13f, -0.78f, -0.38f)
                curveToRelative(-0.62f, -0.78f, -1.63f, -1.46f, -2.44f, -1.65f)
                curveToRelative(-0.54f, -0.12f, -0.88f, -0.66f, -0.75f, -1.2f)
                curveToRelative(0.12f, -0.54f, 0.66f, -0.88f, 1.2f, -0.75f)
                curveToRelative(1.25f, 0.29f, 2.65f, 1.21f, 3.56f, 2.35f)
                curveToRelative(0.34f, 0.43f, 0.27f, 1.06f, -0.16f, 1.41f)
                close()
            }
        }.also { _FaceAstonished = it}
