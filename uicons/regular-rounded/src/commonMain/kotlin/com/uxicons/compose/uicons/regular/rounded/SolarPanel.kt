package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanel: ImageVector? = null

val Icons.Rr.SolarPanel: ImageVector
    get() = _SolarPanel ?: UXIcon(name = "SolarPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 12.37f)
                lineToRelative(-1.02f, -8f)
                curveToRelative(-0.32f, -2.49f, -2.45f, -4.37f, -4.96f, -4.37f)
                lineTo(6.02f, 0f)
                curveTo(3.51f, 0f, 1.38f, 1.88f, 1.06f, 4.37f)
                lineTo(0.04f, 12.37f)
                curveToRelative(-0.18f, 1.43f, 0.26f, 2.86f, 1.21f, 3.94f)
                curveToRelative(0.95f, 1.08f, 2.32f, 1.7f, 3.75f, 1.7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6.02f)
                curveToRelative(1.44f, 0f, 2.8f, -0.62f, 3.75f, -1.7f)
                curveToRelative(0.95f, -1.08f, 1.39f, -2.51f, 1.21f, -3.94f)
                close()
                moveTo(20.98f, 4.62f)
                lineToRelative(0.43f, 3.38f)
                horizontalLineToRelative(-4.97f)
                lineToRelative(-0.38f, -6f)
                horizontalLineToRelative(1.94f)
                curveToRelative(1.51f, 0f, 2.79f, 1.13f, 2.98f, 2.62f)
                close()
                moveTo(9.06f, 16f)
                lineToRelative(0.38f, -6f)
                horizontalLineToRelative(5.12f)
                lineToRelative(0.38f, 6f)
                horizontalLineToRelative(-5.87f)
                close()
                moveTo(9.56f, 8f)
                lineToRelative(0.38f, -6f)
                horizontalLineToRelative(4.12f)
                lineToRelative(0.38f, 6f)
                horizontalLineToRelative(-4.87f)
                close()
                moveTo(6.02f, 2f)
                horizontalLineToRelative(1.91f)
                lineToRelative(-0.38f, 6f)
                lineTo(2.62f, 8f)
                lineToRelative(0.43f, -3.38f)
                curveToRelative(0.19f, -1.49f, 1.47f, -2.62f, 2.98f, -2.62f)
                close()
                moveTo(2.75f, 14.98f)
                curveToRelative(-0.57f, -0.65f, -0.83f, -1.51f, -0.72f, -2.36f)
                lineToRelative(0.34f, -2.62f)
                horizontalLineToRelative(5.08f)
                lineToRelative(-0.38f, 6f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.86f, 0f, -1.68f, -0.37f, -2.25f, -1.02f)
                close()
                moveTo(21.27f, 14.98f)
                curveToRelative(-0.57f, 0.65f, -1.39f, 1.02f, -2.25f, 1.02f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(-0.38f, -6f)
                horizontalLineToRelative(5.1f)
                lineToRelative(0.34f, 2.62f)
                curveToRelative(0.11f, 0.85f, -0.15f, 1.72f, -0.72f, 2.36f)
                close()
            }
        }.also { _SolarPanel = it}
