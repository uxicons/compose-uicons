package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Rc.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.2f, 5.66f)
                curveToRelative(-0.18f, -0.04f, -4.24f, -0.87f, -9.2f, -0.97f)
                verticalLineToRelative(-1.43f)
                horizontalLineToRelative(1.49f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.49f)
                verticalLineToRelative(1.43f)
                curveToRelative(-4.97f, 0.1f, -9.02f, 0.94f, -9.2f, 0.97f)
                curveToRelative(-0.54f, 0.11f, -0.89f, 0.64f, -0.77f, 1.18f)
                curveToRelative(0.11f, 0.54f, 0.63f, 0.88f, 1.18f, 0.78f)
                curveToRelative(0.0f, 0f, 0.01f, -0.0f, 0.03f, -0.01f)
                lineToRelative(-0.09f, 12.67f)
                curveToRelative(-0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f)
                curveToRelative(0.17f, 0.05f, 4.33f, 1.14f, 9.12f, 1.14f)
                reflectiveCurveToRelative(8.95f, -1.09f, 9.12f, -1.14f)
                curveToRelative(0.44f, -0.12f, 0.74f, -0.52f, 0.74f, -0.97f)
                lineToRelative(-0.09f, -12.67f)
                curveToRelative(0.01f, 0.0f, 0.03f, 0.01f, 0.03f, 0.01f)
                curveToRelative(0.07f, 0.01f, 0.14f, 0.02f, 0.2f, 0.02f)
                curveToRelative(0.46f, 0f, 0.88f, -0.32f, 0.98f, -0.8f)
                curveToRelative(0.11f, -0.54f, -0.23f, -1.07f, -0.77f, -1.18f)
                close()
                moveTo(19.86f, 19.5f)
                curveToRelative(-1.38f, 0.3f, -4.48f, 0.9f, -7.86f, 0.9f)
                reflectiveCurveToRelative(-6.48f, -0.59f, -7.86f, -0.9f)
                lineToRelative(0.09f, -12.23f)
                curveToRelative(1.82f, -0.27f, 4.68f, -0.6f, 7.77f, -0.6f)
                reflectiveCurveToRelative(5.94f, 0.33f, 7.77f, 0.6f)
                lineToRelative(0.09f, 12.23f)
                close()
            }
        }.also { _Pot = it}
