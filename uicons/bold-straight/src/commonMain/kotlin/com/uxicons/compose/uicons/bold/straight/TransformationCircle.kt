package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Bs.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.5f)
                curveToRelative(0f, 3.45f, -2.07f, 6.43f, -5.04f, 7.75f)
                curveToRelative(0.02f, -0.25f, 0.04f, -0.5f, 0.04f, -0.76f)
                curveToRelative(0f, -0.87f, -0.12f, -1.71f, -0.32f, -2.52f)
                curveToRelative(1.4f, -1.0f, 2.32f, -2.63f, 2.32f, -4.48f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-1.85f, 0f, -3.48f, 0.92f, -4.48f, 2.32f)
                curveToRelative(-0.81f, -0.2f, -1.65f, -0.32f, -2.52f, -0.32f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.02f, -0.76f, 0.04f)
                curveTo(9.07f, 2.07f, 12.05f, 0f, 15.5f, 0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
                moveTo(15.47f, 10.65f)
                curveToRelative(0.96f, 1.38f, 1.53f, 3.05f, 1.53f, 4.85f)
                curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
                reflectiveCurveTo(0f, 20.19f, 0f, 15.5f)
                reflectiveCurveTo(3.81f, 7f, 8.5f, 7f)
                curveToRelative(1.8f, 0f, 3.47f, 0.57f, 4.85f, 1.53f)
                lineToRelative(1.84f, -1.84f)
                lineToRelative(-1.69f, -1.69f)
                horizontalLineToRelative(4.58f)
                curveToRelative(0.51f, 0f, 0.92f, 0.41f, 0.92f, 0.92f)
                verticalLineToRelative(4.58f)
                lineToRelative(-1.69f, -1.69f)
                lineToRelative(-1.84f, 1.84f)
                close()
                moveTo(14f, 15.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }.also { _TransformationCircle = it}
