package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Sr.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.66f, 16.59f)
                lineToRelative(-0.52f, 0.6f)
                curveToRelative(-0.55f, 0.55f, -1.28f, 0.81f, -2f, 0.81f)
                curveToRelative(-3.71f, 0f, -9.14f, -5.14f, -9.14f, -9.14f)
                curveToRelative(0f, -0.72f, 0.26f, -1.45f, 0.81f, -2f)
                lineToRelative(0.6f, -0.52f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                lineToRelative(1f, 1.3f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                lineToRelative(-0.85f, 1.07f)
                curveToRelative(0.9f, 2.24f, 2.43f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.07f, -0.85f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                lineToRelative(1.3f, 1f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                close()
            }
        }.also { _CirclePhone = it}
