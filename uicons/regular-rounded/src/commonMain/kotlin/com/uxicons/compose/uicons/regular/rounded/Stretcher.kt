package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Rr.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 19f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.07f, -0.98f, 0.2f)
                lineToRelative(-4.04f, -3.7f)
                lineToRelative(4.91f, -4.5f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-13.32f)
                curveToRelative(-1.34f, 0f, -2.58f, -0.67f, -3.33f, -1.78f)
                lineTo(1.83f, 0.45f)
                curveTo(1.53f, -0.01f, 0.91f, -0.14f, 0.45f, 0.17f)
                reflectiveCurveTo(-0.14f, 1.09f, 0.17f, 1.55f)
                lineToRelative(4.52f, 6.77f)
                curveToRelative(0.89f, 1.33f, 2.25f, 2.22f, 3.78f, 2.54f)
                lineToRelative(5.05f, 4.63f)
                lineToRelative(-4.04f, 3.7f)
                curveToRelative(-0.3f, -0.13f, -0.63f, -0.2f, -0.98f, -0.2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.29f, -0.06f, -0.57f, -0.15f, -0.84f)
                lineToRelative(4.15f, -3.81f)
                lineToRelative(4.15f, 3.81f)
                curveToRelative(-0.09f, 0.26f, -0.15f, 0.54f, -0.15f, 0.84f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(11.57f, 11f)
                horizontalLineToRelative(6.86f)
                lineToRelative(-3.43f, 3.14f)
                lineToRelative(-3.43f, -3.14f)
                close()
            }
        }.also { _Stretcher = it}
