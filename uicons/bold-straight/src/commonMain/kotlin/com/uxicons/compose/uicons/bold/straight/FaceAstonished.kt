package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAstonished: ImageVector? = null

val Icons.Bs.FaceAstonished: ImageVector
    get() = _FaceAstonished ?: UXIcon(name = "FaceAstonished") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(16f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(9.39f, 6.92f)
                lineToRelative(-0.78f, -1.84f)
                curveToRelative(-1.67f, 0.71f, -3.04f, 1.85f, -3.95f, 3.29f)
                lineToRelative(1.69f, 1.07f)
                curveToRelative(0.69f, -1.08f, 1.77f, -1.98f, 3.05f, -2.52f)
                close()
                moveTo(19.26f, 8.24f)
                curveToRelative(-0.91f, -1.38f, -2.25f, -2.47f, -3.87f, -3.16f)
                lineToRelative(-0.78f, 1.84f)
                curveToRelative(1.26f, 0.54f, 2.29f, 1.38f, 2.99f, 2.43f)
                lineToRelative(1.67f, -1.1f)
                close()
            }
        }.also { _FaceAstonished = it}
