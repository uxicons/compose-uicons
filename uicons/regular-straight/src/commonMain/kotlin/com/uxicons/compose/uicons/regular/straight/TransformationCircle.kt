package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Rs.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.96f, 8.46f)
                lineToRelative(2.04f, 2.04f)
                verticalLineToRelative(-4.58f)
                curveToRelative(0f, -0.51f, -0.41f, -0.92f, -0.92f, -0.92f)
                horizontalLineToRelative(-4.58f)
                lineToRelative(2.04f, 2.04f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-1.45f, -1.14f, -3.27f, -1.83f, -5.25f, -1.83f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -1.98f, -0.69f, -3.81f, -1.83f, -5.25f)
                lineToRelative(1.79f, -1.79f)
                close()
                moveTo(8.5f, 22f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 3.45f, -2.07f, 6.43f, -5.04f, 7.75f)
                curveToRelative(0.02f, -0.25f, 0.04f, -0.5f, 0.04f, -0.76f)
                curveToRelative(0f, -0.5f, -0.05f, -0.98f, -0.12f, -1.46f)
                curveToRelative(1.87f, -1.14f, 3.12f, -3.19f, 3.12f, -5.54f)
                curveToRelative(0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-2.35f, 0f, -4.4f, 1.25f, -5.54f, 3.12f)
                curveToRelative(-0.48f, -0.07f, -0.96f, -0.12f, -1.46f, -0.12f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.02f, -0.76f, 0.04f)
                curveTo(9.07f, 2.07f, 12.05f, 0f, 15.5f, 0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
            }
        }.also { _TransformationCircle = it}
