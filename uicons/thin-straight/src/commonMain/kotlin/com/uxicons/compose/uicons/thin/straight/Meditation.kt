package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meditation: ImageVector? = null

val Icons.Ts.Meditation: ImageVector
    get() = _Meditation ?: UXIcon(name = "Meditation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 6f)
                curveToRelative(1.66f, 0f, 2.96f, -1.32f, 2.96f, -3f)
                reflectiveCurveToRelative(-1.3f, -3f, -2.96f, -3f)
                curveToRelative(-1.68f, 0f, -3.04f, 1.35f, -3.04f, 3f)
                reflectiveCurveToRelative(1.37f, 3f, 3.04f, 3f)
                close()
                moveTo(11.99f, 1f)
                curveToRelative(1.1f, 0f, 1.96f, 0.88f, 1.96f, 2f)
                reflectiveCurveToRelative(-0.86f, 2f, -1.96f, 2f)
                curveToRelative(-1.13f, 0f, -2.04f, -0.9f, -2.04f, -2f)
                reflectiveCurveToRelative(0.92f, -2f, 2.04f, -2f)
                close()
                moveTo(16f, 19.21f)
                lineToRelative(7f, 3.92f)
                verticalLineToRelative(0.87f)
                lineTo(9f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11.72f)
                lineToRelative(-5.72f, -3.21f)
                lineTo(15f, 9.03f)
                curveToRelative(-0.07f, -0.01f, -0.15f, -0.03f, -0.23f, -0.03f)
                horizontalLineToRelative(-5.55f)
                curveToRelative(-0.08f, 0f, -0.15f, 0.02f, -0.23f, 0.03f)
                verticalLineToRelative(10.76f)
                lineToRelative(-5.72f, 3.21f)
                horizontalLineToRelative(3.72f)
                verticalLineToRelative(1f)
                lineTo(1f, 24f)
                verticalLineToRelative(-0.85f)
                lineToRelative(7f, -3.95f)
                lineTo(8f, 9.66f)
                curveToRelative(-0.04f, 0.05f, -0.08f, 0.1f, -0.11f, 0.16f)
                lineToRelative(-2.5f, 4.91f)
                lineToRelative(-4.11f, 2.69f)
                lineToRelative(-0.55f, -0.84f)
                lineToRelative(3.89f, -2.54f)
                lineToRelative(2.38f, -4.67f)
                curveToRelative(0.43f, -0.84f, 1.28f, -1.36f, 2.23f, -1.36f)
                horizontalLineToRelative(5.55f)
                curveToRelative(0.94f, 0f, 1.8f, 0.52f, 2.23f, 1.36f)
                lineToRelative(2.38f, 4.67f)
                lineToRelative(3.89f, 2.54f)
                lineToRelative(-0.55f, 0.84f)
                lineToRelative(-4.11f, -2.69f)
                lineToRelative(-2.5f, -4.91f)
                curveToRelative(-0.03f, -0.06f, -0.07f, -0.11f, -0.11f, -0.16f)
                verticalLineToRelative(9.55f)
                close()
            }
        }.also { _Meditation = it}
