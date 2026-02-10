package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAnguished: ImageVector? = null

val Icons.Rs.FaceAnguished: ImageVector
    get() = _FaceAnguished ?: UXIcon(name = "FaceAnguished") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(8.89f, 6.62f)
                curveToRelative(-1.28f, 0.55f, -2.36f, 1.44f, -3.05f, 2.52f)
                lineToRelative(-1.69f, -1.07f)
                curveToRelative(0.91f, -1.44f, 2.28f, -2.58f, 3.95f, -3.29f)
                lineToRelative(0.78f, 1.84f)
                close()
                moveTo(19.76f, 7.95f)
                lineToRelative(-1.67f, 1.1f)
                curveToRelative(-0.69f, -1.05f, -1.73f, -1.89f, -2.99f, -2.43f)
                lineToRelative(0.78f, -1.84f)
                curveToRelative(1.62f, 0.69f, 2.96f, 1.78f, 3.87f, 3.16f)
                close()
                moveTo(8.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(16f, 19f)
                lineTo(8f, 19f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _FaceAnguished = it}
