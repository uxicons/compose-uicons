package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWorried: ImageVector? = null

val Icons.Ss.FaceWorried: ImageVector
    get() = _FaceWorried ?: UXIcon(name = "FaceWorried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(10f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5.84f, 9.14f)
                lineToRelative(-1.69f, -1.07f)
                curveToRelative(0.91f, -1.44f, 2.28f, -2.58f, 3.95f, -3.29f)
                lineToRelative(0.79f, 1.84f)
                curveToRelative(-1.3f, 0.55f, -2.35f, 1.43f, -3.05f, 2.52f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-2.5f, 0f, -5f, 1.0f, -5f, 1f)
                curveToRelative(0.51f, -1.9f, 2.22f, -4.0f, 5.0f, -4f)
                curveToRelative(2.78f, 0.0f, 4.49f, 2.1f, 5.0f, 4f)
                curveToRelative(0f, 0.0f, -2.5f, -1f, -5f, -1f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.1f, 9.05f)
                curveToRelative(-0.69f, -1.05f, -1.73f, -1.89f, -2.99f, -2.43f)
                lineToRelative(0.79f, -1.84f)
                curveToRelative(1.62f, 0.69f, 2.96f, 1.79f, 3.87f, 3.17f)
                lineToRelative(-1.67f, 1.1f)
                close()
            }
        }.also { _FaceWorried = it}
