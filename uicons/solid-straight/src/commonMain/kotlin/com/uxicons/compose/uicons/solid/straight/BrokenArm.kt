package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenArm: ImageVector? = null

val Icons.Ss.BrokenArm: ImageVector
    get() = _BrokenArm ?: UXIcon(name = "BrokenArm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                close()
                moveTo(11f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(4.48f)
                lineToRelative(2.71f, -2.48f)
                horizontalLineToRelative(2.96f)
                lineTo(0f, 13.19f)
                verticalLineToRelative(3.81f)
                curveToRelative(0f, 0.13f, 0.01f, 0.25f, 0.02f, 0.38f)
                lineTo(11f, 7.33f)
                verticalLineToRelative(-1.33f)
                close()
                moveTo(11f, 10.04f)
                lineTo(0.52f, 19.63f)
                curveToRelative(0.42f, 1.04f, 1.09f, 1.95f, 1.93f, 2.67f)
                lineToRelative(8.56f, -8.3f)
                verticalLineToRelative(-3.96f)
                close()
                moveTo(4.18f, 23.4f)
                curveToRelative(0.86f, 0.38f, 1.81f, 0.6f, 2.81f, 0.6f)
                horizontalLineToRelative(3.84f)
                lineToRelative(-3.68f, -3.42f)
                lineToRelative(-2.97f, 2.82f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.19f)
                lineToRelative(0.61f, -0.62f)
                curveToRelative(0.48f, -0.47f, 0.52f, -1.22f, 0.09f, -1.74f)
                curveToRelative(-0.43f, -0.51f, -1.18f, -0.61f, -1.72f, -0.21f)
                lineToRelative(-2.08f, 1.76f)
                horizontalLineToRelative(-0.82f)
                lineToRelative(-1.73f, 1.64f)
                lineToRelative(3.64f, 3.38f)
                verticalLineToRelative(2.73f)
                lineToRelative(-5.1f, -4.73f)
                lineToRelative(-2.29f, 2.18f)
                lineToRelative(5.17f, 4.8f)
                horizontalLineToRelative(7.22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _BrokenArm = it}
