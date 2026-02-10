package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Sr.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 24f)
                curveTo(3.81f, 24f, 0f, 20.19f, 0f, 15.5f)
                reflectiveCurveTo(3.81f, 7f, 8.5f, 7f)
                reflectiveCurveToRelative(8.5f, 3.81f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.81f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(15.5f, 0f)
                curveToRelative(-3.45f, 0f, -6.43f, 2.07f, -7.75f, 5.04f)
                curveToRelative(0.25f, -0.02f, 0.5f, -0.04f, 0.76f, -0.04f)
                curveToRelative(2.54f, 0f, 4.86f, 0.9f, 6.68f, 2.41f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-0.46f, -0.46f, -0.13f, -1.25f, 0.52f, -1.25f)
                horizontalLineToRelative(3.26f)
                curveToRelative(0.56f, 0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.26f)
                curveToRelative(0f, 0.65f, -0.79f, 0.98f, -1.25f, 0.52f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-2.1f, 2.1f)
                curveToRelative(1.5f, 1.82f, 2.41f, 4.14f, 2.41f, 6.68f)
                curveToRelative(0f, 0.26f, -0.02f, 0.51f, -0.04f, 0.76f)
                curveToRelative(2.96f, -1.33f, 5.04f, -4.3f, 5.04f, -7.75f)
                curveTo(24f, 3.81f, 20.19f, 0f, 15.5f, 0f)
                close()
            }
        }.also { _TransformationCircle = it}
