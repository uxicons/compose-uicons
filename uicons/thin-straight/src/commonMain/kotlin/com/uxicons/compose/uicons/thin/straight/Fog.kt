package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fog: ImageVector? = null

val Icons.Ts.Fog: ImageVector
    get() = _Fog ?: UXIcon(name = "Fog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 24f)
                lineTo(14f, 24f)
                verticalLineToRelative(-1f)
                lineTo(5f, 23f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 15f)
                lineTo(5f, 15f)
                verticalLineToRelative(1f)
                lineTo(14f, 16f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17.0f, 5.02f)
                curveTo(15.87f, 2.0f, 13.0f, 0f, 9.75f, 0f)
                curveTo(5.48f, 0f, 2f, 3.48f, 2f, 7.75f)
                curveToRelative(0f, 0.76f, 0.12f, 1.52f, 0.34f, 2.27f)
                curveToRelative(-1.48f, 1.03f, -2.35f, 2.68f, -2.35f, 4.48f)
                curveToRelative(0f, 2.13f, 1.22f, 3.98f, 3f, 4.89f)
                verticalLineToRelative(-1.15f)
                curveToRelative(-1.21f, -0.81f, -2f, -2.18f, -2f, -3.74f)
                curveToRelative(0f, -1.58f, 0.82f, -3.02f, 2.2f, -3.85f)
                lineToRelative(0.35f, -0.21f)
                lineToRelative(-0.14f, -0.39f)
                curveToRelative(-0.27f, -0.75f, -0.41f, -1.53f, -0.41f, -2.3f)
                curveToRelative(0f, -3.72f, 3.03f, -6.75f, 6.75f, -6.75f)
                curveToRelative(2.93f, 0f, 5.51f, 1.87f, 6.42f, 4.66f)
                lineToRelative(0.11f, 0.34f)
                lineToRelative(0.35f, 0.01f)
                curveToRelative(3.51f, 0.07f, 6.37f, 2.98f, 6.37f, 6.49f)
                curveToRelative(0f, 1.83f, -0.79f, 3.53f, -2f, 4.73f)
                verticalLineToRelative(1.31f)
                curveToRelative(1.79f, -1.39f, 3f, -3.62f, 3f, -6.05f)
                curveToRelative(0f, -3.93f, -3.11f, -7.22f, -7.0f, -7.48f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                lineTo(10f, 19f)
                verticalLineToRelative(1f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Fog = it}
