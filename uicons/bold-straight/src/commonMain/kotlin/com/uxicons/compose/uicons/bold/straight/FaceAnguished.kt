package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceAnguished: ImageVector? = null

val Icons.Bs.FaceAnguished: ImageVector
    get() = _FaceAnguished ?: UXIcon(name = "FaceAnguished") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(16f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
                moveTo(9.33f, 6.55f)
                lineToRelative(-1.66f, -1.11f)
                curveToRelative(-0.77f, 1.16f, -1.85f, 2.06f, -3.04f, 2.53f)
                lineToRelative(0.74f, 1.86f)
                curveToRelative(1.58f, -0.63f, 2.95f, -1.76f, 3.96f, -3.28f)
                close()
                moveTo(16.33f, 5.45f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(1.01f, 1.51f, 2.38f, 2.65f, 3.96f, 3.28f)
                lineToRelative(0.74f, -1.86f)
                curveToRelative(-1.19f, -0.47f, -2.27f, -1.37f, -3.04f, -2.53f)
                close()
            }
        }.also { _FaceAnguished = it}
