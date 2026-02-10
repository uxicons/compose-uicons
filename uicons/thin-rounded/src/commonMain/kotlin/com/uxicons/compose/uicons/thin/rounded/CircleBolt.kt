package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Tr.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(12.43f, 18.76f)
                lineToRelative(3.39f, -5.55f)
                curveToRelative(0.23f, -0.34f, 0.25f, -0.77f, 0.05f, -1.13f)
                curveToRelative(-0.19f, -0.36f, -0.57f, -0.58f, -0.97f, -0.58f)
                horizontalLineToRelative(-5.78f)
                reflectiveCurveToRelative(-0.08f, -0.03f, -0.09f, -0.05f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.04f, -0.02f, -0.06f)
                lineToRelative(3.43f, -5.63f)
                curveToRelative(0.14f, -0.24f, 0.07f, -0.54f, -0.17f, -0.69f)
                curveToRelative(-0.24f, -0.14f, -0.54f, -0.07f, -0.69f, 0.17f)
                curveToRelative(0f, 0f, -3.51f, 5.78f, -3.52f, 5.82f)
                curveToRelative(-0.1f, 0.34f, -0.04f, 0.7f, 0.17f, 0.99f)
                curveToRelative(0.21f, 0.29f, 0.54f, 0.45f, 0.9f, 0.45f)
                horizontalLineToRelative(5.78f)
                reflectiveCurveToRelative(0.07f, 0.02f, 0.09f, 0.05f)
                reflectiveCurveToRelative(0.02f, 0.07f, -0.02f, 0.12f)
                lineToRelative(-3.4f, 5.56f)
                curveToRelative(-0.14f, 0.24f, -0.07f, 0.54f, 0.17f, 0.69f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                curveToRelative(0.17f, 0f, 0.33f, -0.08f, 0.43f, -0.24f)
                close()
            }
        }.also { _CircleBolt = it}
