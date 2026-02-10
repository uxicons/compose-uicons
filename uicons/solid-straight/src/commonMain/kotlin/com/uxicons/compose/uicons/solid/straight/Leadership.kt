package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leadership: ImageVector? = null

val Icons.Ss.Leadership: ImageVector
    get() = _Leadership ?: UXIcon(name = "Leadership") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3.5f, 10f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24.03f, 12.14f)
                verticalLineToRelative(2.27f)
                lineToRelative(-13.82f, 9.59f)
                horizontalLineToRelative(-3.27f)
                lineToRelative(0.06f, -0.04f)
                verticalLineToRelative(-3.96f)
                lineTo(2.99f, 20.0f)
                lineToRelative(-0.03f, 2.53f)
                lineToRelative(-0.46f, 1.47f)
                lineTo(0.39f, 24.0f)
                lineToRelative(0.61f, -1.92f)
                verticalLineToRelative(-8.08f)
                curveToRelative(0f, -1.24f, 0.74f, -2.34f, 1.9f, -2.79f)
                lineToRelative(0.17f, -0.05f)
                lineToRelative(4.96f, -1.01f)
                lineToRelative(3.47f, -3.19f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.55f, -0.59f, 1.32f, -0.97f, 2.19f, -0.97f)
                horizontalLineToRelative(5.3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-3f, 1.88f)
                verticalLineToRelative(3.62f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.63f)
                lineToRelative(5.03f, -3.49f)
                close()
                moveTo(13f, 19.8f)
                lineToRelative(4.03f, -2.8f)
                horizontalLineToRelative(-0.03f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4.8f)
                close()
                moveTo(11f, 21.18f)
                verticalLineToRelative(-10.95f)
                lineToRelative(-2f, 1.77f)
                lineToRelative(-3f, 0.62f)
                verticalLineToRelative(5.38f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.57f)
                lineToRelative(2f, -1.39f)
                close()
            }
        }.also { _Leadership = it}
