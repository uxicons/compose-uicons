package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Rr.CircleZ: ImageVector
    get() = _CircleZ ?: UXIcon(name = "CircleZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.04f, 0.02f)
                curveTo(5.42f, 0.02f, 0.04f, 5.4f, 0.04f, 12.02f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.66f, 0.02f, 12.04f, 0.02f)
                close()
                moveTo(12.04f, 22.02f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.52f, 2.02f, 12.04f, 2.02f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(9.06f, 15.81f)
                curveToRelative(0.05f, 0.14f, 0.14f, 0.21f, 0.28f, 0.21f)
                horizontalLineToRelative(6.7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6.7f)
                curveToRelative(-1.0f, 0f, -1.85f, -0.62f, -2.17f, -1.58f)
                curveToRelative(-0.33f, -0.98f, -0.01f, -2.0f, 0.81f, -2.62f)
                lineToRelative(6.94f, -5.21f)
                curveToRelative(0.17f, -0.12f, 0.14f, -0.29f, 0.11f, -0.38f)
                curveToRelative(-0.05f, -0.14f, -0.14f, -0.21f, -0.28f, -0.21f)
                horizontalLineToRelative(-6.7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.7f)
                curveToRelative(1f, 0f, 1.85f, 0.62f, 2.17f, 1.58f)
                curveToRelative(0.33f, 0.98f, 0.01f, 2.0f, -0.81f, 2.61f)
                lineToRelative(-6.94f, 5.21f)
                curveToRelative(-0.17f, 0.12f, -0.14f, 0.29f, -0.11f, 0.38f)
                close()
            }
        }.also { _CircleZ = it}
