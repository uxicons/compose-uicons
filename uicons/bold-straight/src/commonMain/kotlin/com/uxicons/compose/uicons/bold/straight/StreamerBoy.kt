package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreamerBoy: ImageVector? = null

val Icons.Bs.StreamerBoy: ImageVector
    get() = _StreamerBoy ?: UXIcon(name = "StreamerBoy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 8f)
                horizontalLineToRelative(1.35f)
                curveToRelative(0.83f, 2.33f, 3.04f, 4f, 5.65f, 4f)
                reflectiveCurveToRelative(4.82f, -1.67f, 5.65f, -4f)
                horizontalLineToRelative(1.35f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                reflectiveCurveToRelative(-4.82f, 1.67f, -5.65f, 4f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(9f, 9f)
                curveToRelative(-1.67f, 0.0f, -3.04f, -1.38f, -3.0f, -3.05f)
                curveToRelative(0.16f, 0.01f, 0.31f, 0.05f, 0.47f, 0.05f)
                curveToRelative(1.82f, 0f, 3.39f, -0.98f, 4.26f, -2.43f)
                curveToRelative(0.76f, 0.55f, 1.26f, 1.43f, 1.26f, 2.43f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(21.99f, 12.59f)
                curveToRelative(0.0f, -0.03f, 0.01f, -0.06f, 0.01f, -0.09f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.21f, 0f, 0.41f, -0.03f, 0.6f, -0.08f)
                lineToRelative(0.9f, 0.77f)
                verticalLineToRelative(5.31f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9.69f)
                lineToRelative(-2.01f, -1.72f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _StreamerBoy = it}
