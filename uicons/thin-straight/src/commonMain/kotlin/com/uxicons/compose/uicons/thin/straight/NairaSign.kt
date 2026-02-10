package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NairaSign: ImageVector? = null

val Icons.Ts.NairaSign: ImageVector
    get() = _NairaSign ?: UXIcon(name = "NairaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 12f)
                lineTo(12.6f, 12f)
                lineTo(5.34f, 0.84f)
                curveTo(4.9f, 0.14f, 4.1f, -0.16f, 3.3f, 0.08f)
                curveToRelative(-0.79f, 0.23f, -1.3f, 0.92f, -1.3f, 1.74f)
                lineTo(2f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(1f)
                lineTo(2f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1f)
                lineTo(3f, 13f)
                lineTo(12.05f, 13f)
                lineToRelative(6.6f, 10.16f)
                curveToRelative(0.35f, 0.54f, 0.9f, 0.84f, 1.51f, 0.84f)
                curveToRelative(0.18f, 0f, 0.35f, -0.03f, 0.53f, -0.08f)
                curveToRelative(0.79f, -0.23f, 1.3f, -0.92f, 1.3f, -1.74f)
                lineTo(21.99f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 12f)
                lineTo(3f, 1.82f)
                curveToRelative(0f, -0.45f, 0.3f, -0.7f, 0.59f, -0.78f)
                curveToRelative(0.28f, -0.08f, 0.67f, -0.04f, 0.92f, 0.34f)
                lineToRelative(6.9f, 10.62f)
                lineTo(3f, 12f)
                close()
                moveTo(21f, 22.18f)
                curveToRelative(0f, 0.45f, -0.3f, 0.7f, -0.59f, 0.78f)
                curveToRelative(-0.28f, 0.08f, -0.67f, 0.04f, -0.92f, -0.34f)
                lineToRelative(-6.25f, -9.62f)
                horizontalLineToRelative(7.75f)
                verticalLineToRelative(9.18f)
                close()
            }
        }.also { _NairaSign = it}
