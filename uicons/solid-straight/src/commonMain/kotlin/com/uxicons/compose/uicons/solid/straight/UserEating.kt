package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserEating: ImageVector? = null

val Icons.Ss.UserEating: ImageVector
    get() = _UserEating ?: UXIcon(name = "UserEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 4.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                lineTo(3f, 0f)
                horizontalLineToRelative(2f)
                lineTo(5f, 5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8f, 4.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5f)
                lineTo(3f, 12f)
                lineTo(3f, 7f)
                close()
                moveTo(22.78f, 0.19f)
                curveToRelative(-0.82f, 0.68f, -2.18f, 2.45f, -2.28f, 4.94f)
                curveToRelative(-0.03f, 1.29f, 0.36f, 2.71f, 1.5f, 4.12f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(2f)
                lineTo(24f, 0.6f)
                curveToRelative(-0.0f, -0.51f, -0.75f, -0.81f, -1.22f, -0.41f)
                close()
                moveTo(22f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-3.38f, -3.52f)
                verticalLineToRelative(6.51f)
                lineTo(8f, 24f)
                verticalLineToRelative(-6.53f)
                lineToRelative(-3.42f, 3.53f)
                horizontalLineToRelative(-1.58f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.69f)
                lineToRelative(2.4f, -2.48f)
                curveToRelative(0.75f, -0.77f, 1.79f, -1.22f, 2.87f, -1.22f)
                horizontalLineToRelative(6.45f)
                curveToRelative(1.08f, 0f, 2.13f, 0.45f, 2.88f, 1.23f)
                lineToRelative(2.39f, 2.49f)
                verticalLineToRelative(-3.72f)
                close()
                moveTo(9f, 7.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                close()
            }
        }.also { _UserEating = it}
