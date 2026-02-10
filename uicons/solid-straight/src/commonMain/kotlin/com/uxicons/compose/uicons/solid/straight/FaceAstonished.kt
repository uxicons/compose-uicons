package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAstonished: ImageVector? = null

val Icons.Ss.FaceAstonished: ImageVector
    get() = _FaceAstonished ?: UXIcon(name = "FaceAstonished") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(5.84f, 9.14f)
                lineToRelative(-1.69f, -1.07f)
                curveToRelative(0.91f, -1.44f, 2.28f, -2.58f, 3.95f, -3.29f)
                lineToRelative(0.78f, 1.84f)
                curveToRelative(-1.28f, 0.55f, -2.36f, 1.44f, -3.05f, 2.52f)
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
                moveTo(18.1f, 9.05f)
                curveToRelative(-0.69f, -1.05f, -1.73f, -1.89f, -2.99f, -2.43f)
                lineToRelative(0.78f, -1.84f)
                curveToRelative(1.62f, 0.69f, 2.96f, 1.78f, 3.87f, 3.16f)
                lineToRelative(-1.67f, 1.1f)
                close()
            }
        }.also { _FaceAstonished = it}
