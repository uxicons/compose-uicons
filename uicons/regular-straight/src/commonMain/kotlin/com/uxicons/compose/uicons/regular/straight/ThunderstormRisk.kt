package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThunderstormRisk: ImageVector? = null

val Icons.Rs.ThunderstormRisk: ImageVector
    get() = _ThunderstormRisk ?: UXIcon(name = "ThunderstormRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.5f)
                curveToRelative(0f, 3.34f, -2.2f, 6.18f, -5.22f, 7.14f)
                lineToRelative(-1.04f, -1.79f)
                curveToRelative(2.44f, -0.56f, 4.27f, -2.75f, 4.27f, -5.36f)
                curveToRelative(0f, -2.69f, -1.92f, -4.97f, -4.56f, -5.42f)
                lineToRelative(-0.59f, -0.1f)
                lineToRelative(-0.19f, -0.56f)
                curveToRelative(-0.89f, -2.64f, -3.37f, -4.42f, -6.16f, -4.42f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 0.61f, 0.09f, 1.22f, 0.25f, 1.8f)
                lineToRelative(0.22f, 0.76f)
                lineToRelative(-0.69f, 0.39f)
                curveToRelative(-1.1f, 0.62f, -1.78f, 1.79f, -1.78f, 3.05f)
                curveToRelative(0f, 1.93f, 1.35f, 3.5f, 3f, 3.5f)
                horizontalLineToRelative(1.19f)
                lineToRelative(-1.17f, 2f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-2.76f, 0f, -5f, -2.47f, -5f, -5.5f)
                curveToRelative(0f, -1.72f, 0.81f, -3.33f, 2.16f, -4.37f)
                curveToRelative(-0.1f, -0.54f, -0.16f, -1.08f, -0.16f, -1.63f)
                curveTo(2f, 3.81f, 5.81f, 0f, 10.5f, 0f)
                curveToRelative(3.45f, 0f, 6.54f, 2.08f, 7.85f, 5.23f)
                curveToRelative(3.31f, 0.83f, 5.65f, 3.8f, 5.65f, 7.27f)
                close()
                moveTo(12f, 12f)
                lineToRelative(7f, 12f)
                lineTo(5f, 24f)
                lineToRelative(7f, -12f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _ThunderstormRisk = it}
