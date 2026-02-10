package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiraSign: ImageVector? = null

val Icons.Rr.LiraSign: ImageVector
    get() = _LiraSign ?: UXIcon(name = "LiraSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6.61f)
                lineToRelative(7.32f, -2.44f)
                curveToRelative(0.52f, -0.17f, 0.81f, -0.74f, 0.63f, -1.26f)
                curveToRelative(-0.17f, -0.52f, -0.74f, -0.81f, -1.26f, -0.63f)
                lineToRelative(-6.68f, 2.23f)
                verticalLineToRelative(-1.89f)
                lineToRelative(7.32f, -2.44f)
                curveToRelative(0.52f, -0.17f, 0.81f, -0.74f, 0.63f, -1.26f)
                curveToRelative(-0.17f, -0.52f, -0.74f, -0.81f, -1.26f, -0.63f)
                lineToRelative(-6.68f, 2.23f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(7.95f)
                lineToRelative(-3.32f, 1.1f)
                curveToRelative(-0.52f, 0.17f, -0.81f, 0.74f, -0.63f, 1.26f)
                curveToRelative(0.14f, 0.42f, 0.53f, 0.68f, 0.95f, 0.68f)
                curveToRelative(0.1f, 0f, 0.21f, -0.02f, 0.32f, -0.05f)
                lineToRelative(2.68f, -0.9f)
                verticalLineToRelative(1.89f)
                lineToRelative(-3.32f, 1.1f)
                curveToRelative(-0.52f, 0.17f, -0.81f, 0.74f, -0.63f, 1.26f)
                curveToRelative(0.14f, 0.42f, 0.53f, 0.68f, 0.95f, 0.68f)
                curveToRelative(0.1f, 0f, 0.21f, -0.02f, 0.32f, -0.05f)
                lineToRelative(2.68f, -0.9f)
                verticalLineToRelative(5.95f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _LiraSign = it}
