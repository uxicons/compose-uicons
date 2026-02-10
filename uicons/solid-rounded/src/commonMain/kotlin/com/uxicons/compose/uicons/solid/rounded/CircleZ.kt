package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Sr.CircleZ: ImageVector
    get() = _CircleZ ?: UXIcon(name = "CircleZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(9.02f, 15.79f)
                curveToRelative(0.05f, 0.14f, 0.14f, 0.21f, 0.28f, 0.21f)
                horizontalLineToRelative(6.7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6.7f)
                curveToRelative(-1f, 0f, -1.85f, -0.62f, -2.17f, -1.58f)
                curveToRelative(-0.33f, -0.98f, -0.01f, -2.0f, 0.81f, -2.62f)
                lineToRelative(6.94f, -5.21f)
                curveToRelative(0.17f, -0.12f, 0.14f, -0.29f, 0.11f, -0.38f)
                curveToRelative(-0.05f, -0.14f, -0.14f, -0.21f, -0.28f, -0.21f)
                horizontalLineToRelative(-6.7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.7f)
                curveToRelative(1f, 0f, 1.85f, 0.62f, 2.17f, 1.58f)
                curveToRelative(0.33f, 0.98f, 0.01f, 2.0f, -0.81f, 2.62f)
                lineToRelative(-6.94f, 5.21f)
                curveToRelative(-0.17f, 0.12f, -0.14f, 0.29f, -0.11f, 0.38f)
                close()
            }
        }.also { _CircleZ = it}
