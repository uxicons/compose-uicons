package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Ss.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 24f)
                curveTo(3.81f, 24f, 0f, 20.19f, 0f, 15.5f)
                reflectiveCurveTo(3.81f, 7f, 8.5f, 7f)
                reflectiveCurveToRelative(8.5f, 3.81f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.81f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(15.5f, 0f)
                curveToRelative(-3.46f, 0f, -6.43f, 2.07f, -7.76f, 5.04f)
                curveToRelative(0.25f, -0.02f, 0.5f, -0.04f, 0.76f, -0.04f)
                curveToRelative(2.54f, 0f, 4.86f, 0.9f, 6.68f, 2.4f)
                lineToRelative(2.36f, -2.36f)
                lineToRelative(-2.04f, -2.04f)
                horizontalLineToRelative(4.58f)
                curveToRelative(0.51f, 0f, 0.92f, 0.41f, 0.92f, 0.92f)
                verticalLineToRelative(4.58f)
                lineToRelative(-2.04f, -2.04f)
                lineToRelative(-2.36f, 2.36f)
                curveToRelative(1.5f, 1.82f, 2.4f, 4.14f, 2.4f, 6.68f)
                curveToRelative(0f, 0.26f, -0.02f, 0.51f, -0.04f, 0.76f)
                curveToRelative(2.97f, -1.33f, 5.04f, -4.3f, 5.04f, -7.76f)
                curveTo(24f, 3.81f, 20.19f, 0f, 15.5f, 0f)
                close()
            }
        }.also { _TransformationCircle = it}
