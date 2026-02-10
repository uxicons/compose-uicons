package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsAndVenusBurst: ImageVector? = null

val Icons.Ts.MarsAndVenusBurst: ImageVector
    get() = _MarsAndVenusBurst ?: UXIcon(name = "MarsAndVenusBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.79f)
                lineToRelative(-5.15f, 5.15f)
                curveToRelative(-0.86f, -0.7f, -1.95f, -1.15f, -3.15f, -1.15f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 2.59f, 1.98f, 4.69f, 4.5f, 4.95f)
                verticalLineToRelative(3.55f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.55f)
                curveToRelative(2.52f, -0.26f, 4.5f, -2.36f, 4.5f, -4.95f)
                curveToRelative(0f, -1.2f, -0.44f, -2.28f, -1.15f, -3.15f)
                lineToRelative(5.15f, -5.15f)
                lineTo(23.0f, 7.5f)
                horizontalLineToRelative(1f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14f, 15f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(9.21f, 15.33f)
                lineToRelative(0.5f, 0.94f)
                lineToRelative(-6.12f, 2.05f)
                lineToRelative(1.91f, -5.21f)
                lineTo(0.36f, 10.84f)
                lineToRelative(5.11f, -2.52f)
                lineTo(0f, -0.03f)
                lineTo(8.72f, 4.87f)
                lineTo(11.3f, 0.04f)
                lineToRelative(2.12f, 4.0f)
                curveToRelative(-0.35f, 0.03f, -0.7f, 0.08f, -1.04f, 0.17f)
                lineToRelative(-1.08f, -2.04f)
                lineToRelative(-2.17f, 4.08f)
                lineTo(3.08f, 2.85f)
                lineToRelative(3.84f, 5.87f)
                lineToRelative(-4.2f, 2.07f)
                lineToRelative(4.04f, 1.79f)
                lineToRelative(-1.51f, 4.12f)
                lineToRelative(3.96f, -1.36f)
                close()
            }
        }.also { _MarsAndVenusBurst = it}
