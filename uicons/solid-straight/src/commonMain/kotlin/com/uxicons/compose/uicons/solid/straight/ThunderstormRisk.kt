package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThunderstormRisk: ImageVector? = null

val Icons.Ss.ThunderstormRisk: ImageVector
    get() = _ThunderstormRisk ?: UXIcon(name = "ThunderstormRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 24f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                lineToRelative(-7f, 12f)
                close()
                moveTo(13f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 12.5f)
                curveToRelative(0f, 3.34f, -2.2f, 6.18f, -5.22f, 7.14f)
                lineToRelative(-5.71f, -9.64f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-6.05f, 10f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-2.76f, 0f, -5f, -2.47f, -5f, -5.5f)
                curveToRelative(0f, -1.72f, 0.81f, -3.33f, 2.16f, -4.37f)
                curveToRelative(-0.1f, -0.54f, -0.16f, -1.08f, -0.16f, -1.63f)
                curveTo(2f, 3.81f, 5.81f, 0f, 10.5f, 0f)
                curveToRelative(3.45f, 0f, 6.54f, 2.08f, 7.85f, 5.23f)
                curveToRelative(3.31f, 0.83f, 5.65f, 3.8f, 5.65f, 7.27f)
                close()
            }
        }.also { _ThunderstormRisk = it}
