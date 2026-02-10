package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Rr.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(2.58f, -4.5f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                reflectiveCurveToRelative(-0.4f, -0.94f, -0.25f, -1.43f)
                curveToRelative(0.02f, -0.07f, 3.06f, -5.41f, 3.06f, -5.41f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.65f, 1.36f, -0.37f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.37f, 1.36f)
                lineToRelative(-2.57f, 4.5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.85f)
                reflectiveCurveToRelative(0.25f, 1.15f, -0.08f, 1.64f)
                lineToRelative(-2.86f, 5.01f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                close()
                moveTo(14.03f, 12.44f)
                reflectiveCurveToRelative(0f, 0.01f, -0.01f, 0.02f)
                verticalLineToRelative(-0.02f)
                close()
            }
        }.also { _CircleBolt = it}
