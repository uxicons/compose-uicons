package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballPlayer: ImageVector? = null

val Icons.Rs.BaseballPlayer: ImageVector
    get() = _BaseballPlayer ?: UXIcon(name = "BaseballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(24f, 9.24f)
                verticalLineToRelative(1.76f)
                horizontalLineToRelative(-6.69f)
                lineToRelative(-2.08f, -0.8f)
                lineToRelative(-2.17f, 6.12f)
                lineToRelative(2.94f, 2.17f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-4.99f, -3.69f)
                lineToRelative(-3.0f, 8.19f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(5.54f, -15.1f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0.27f, -0.72f, 0.79f, -1.29f, 1.49f, -1.6f)
                curveToRelative(0.7f, -0.32f, 1.47f, -0.34f, 2.19f, -0.06f)
                lineToRelative(4.59f, 1.77f)
                horizontalLineToRelative(3.89f)
                lineToRelative(-4.45f, -8.02f)
                lineToRelative(1.75f, -0.97f)
                lineToRelative(5.13f, 9.23f)
                close()
                moveTo(13.37f, 9.48f)
                lineTo(12.38f, 9.1f)
                curveToRelative(-0.21f, -0.08f, -0.44f, -0.07f, -0.64f, 0.02f)
                reflectiveCurveToRelative(-0.36f, 0.26f, -0.44f, 0.47f)
                verticalLineToRelative(0.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(-1.56f, 4.26f)
                lineToRelative(1.65f, 1.22f)
                lineToRelative(1.99f, -5.59f)
                close()
            }
        }.also { _BaseballPlayer = it}
