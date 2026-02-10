package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanel: ImageVector? = null

val Icons.Sr.SolarPanel: ImageVector
    get() = _SolarPanel ?: UXIcon(name = "SolarPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.62f)
                lineToRelative(0.5f, -8f)
                horizontalLineToRelative(6.24f)
                lineToRelative(0.5f, 8f)
                horizontalLineToRelative(-2.62f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(14.5f, 0.06f)
                curveToRelative(-0.0f, -0.02f, -0.0f, -0.04f, -0.0f, -0.06f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0f, 0.02f, 0f, 0.04f, -0.0f, 0.06f)
                lineToRelative(-0.5f, 7.94f)
                horizontalLineToRelative(5.99f)
                lineTo(14.5f, 0.06f)
                close()
                moveTo(23.42f, 8f)
                lineToRelative(-0.46f, -3.63f)
                curveToRelative(-0.32f, -2.49f, -2.45f, -4.37f, -4.96f, -4.37f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(0.5f, 8f)
                horizontalLineToRelative(6.42f)
                close()
                moveTo(23.98f, 12.37f)
                lineToRelative(-0.3f, -2.37f)
                horizontalLineToRelative(-6.55f)
                reflectiveCurveToRelative(0.5f, 7.98f, 0.5f, 8f)
                horizontalLineToRelative(1.4f)
                curveToRelative(1.44f, 0f, 2.8f, -0.62f, 3.75f, -1.7f)
                curveToRelative(0.95f, -1.08f, 1.39f, -2.51f, 1.21f, -3.94f)
                close()
                moveTo(7.5f, 0f)
                horizontalLineToRelative(-1.48f)
                curveTo(3.51f, 0f, 1.38f, 1.88f, 1.06f, 4.37f)
                lineToRelative(-0.46f, 3.63f)
                horizontalLineToRelative(6.4f)
                lineTo(7.5f, 0f)
                close()
                moveTo(6.88f, 10f)
                lineTo(0.34f, 10f)
                lineTo(0.04f, 12.37f)
                curveToRelative(-0.18f, 1.43f, 0.26f, 2.86f, 1.21f, 3.94f)
                curveToRelative(0.95f, 1.08f, 2.32f, 1.7f, 3.75f, 1.7f)
                horizontalLineToRelative(1.38f)
                curveToRelative(0f, -0.02f, 0.5f, -8f, 0.5f, -8f)
                close()
            }
        }.also { _SolarPanel = it}
