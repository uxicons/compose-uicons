package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsAndVenusBurst: ImageVector? = null

val Icons.Bs.MarsAndVenusBurst: ImageVector
    get() = _MarsAndVenusBurst ?: UXIcon(name = "MarsAndVenusBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                lineTo(24f, 2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.26f, 2.26f)
                curveToRelative(-0.79f, -0.45f, -1.71f, -0.7f, -2.68f, -0.7f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 2.51f, 1.7f, 4.63f, 4f, 5.29f)
                verticalLineToRelative(3.21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.21f)
                curveToRelative(2.31f, -0.66f, 4f, -2.77f, 4f, -5.29f)
                curveToRelative(0f, -0.97f, -0.26f, -1.89f, -0.7f, -2.68f)
                lineToRelative(2.26f, -2.26f)
                lineToRelative(2.44f, 2.44f)
                close()
                moveTo(14.5f, 13f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(9.56f, 16.13f)
                lineToRelative(-2.56f, 2.87f)
                lineToRelative(-0.5f, -4f)
                lineToRelative(-5f, 1.5f)
                lineToRelative(2.5f, -5.5f)
                lineTo(-0.04f, 9.03f)
                lineToRelative(4.04f, -2.03f)
                lineTo(0.11f, 0.05f)
                lineTo(7f, 3.5f)
                lineTo(9.5f, 0f)
                lineToRelative(1.85f, 3.7f)
                curveToRelative(-2.57f, 1.19f, -4.35f, 3.78f, -4.35f, 6.8f)
                curveToRelative(0f, 2.25f, 0.99f, 4.26f, 2.56f, 5.63f)
                close()
            }
        }.also { _MarsAndVenusBurst = it}
