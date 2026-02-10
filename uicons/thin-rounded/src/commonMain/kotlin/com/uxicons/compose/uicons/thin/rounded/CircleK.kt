package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleK: ImageVector? = null

val Icons.Tr.CircleK: ImageVector
    get() = _CircleK ?: UXIcon(name = "CircleK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16.67f, 17.23f)
                curveToRelative(0.15f, 0.23f, 0.09f, 0.54f, -0.14f, 0.69f)
                curveToRelative(-0.09f, 0.06f, -0.18f, 0.08f, -0.28f, 0.08f)
                curveToRelative(-0.16f, 0f, -0.32f, -0.08f, -0.42f, -0.23f)
                lineToRelative(-3.8f, -5.78f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(0.12f, 5.24f)
                curveToRelative(0.01f, 0.28f, -0.21f, 0.51f, -0.49f, 0.51f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.27f, 0f, -0.49f, -0.22f, -0.5f, -0.49f)
                lineToRelative(-0.25f, -10.75f)
                curveToRelative(-0.01f, -0.28f, 0.21f, -0.51f, 0.49f, -0.51f)
                curveToRelative(0.3f, 0.02f, 0.51f, 0.21f, 0.51f, 0.49f)
                lineToRelative(0.1f, 4.51f)
                horizontalLineToRelative(3.95f)
                lineToRelative(3.8f, -4.81f)
                curveToRelative(0.17f, -0.22f, 0.49f, -0.25f, 0.7f, -0.08f)
                curveToRelative(0.22f, 0.17f, 0.25f, 0.48f, 0.08f, 0.7f)
                lineToRelative(-3.73f, 4.72f)
                lineToRelative(3.75f, 5.7f)
                close()
            }
        }.also { _CircleK = it}
