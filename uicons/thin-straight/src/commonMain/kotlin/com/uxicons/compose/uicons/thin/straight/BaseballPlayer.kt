package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballPlayer: ImageVector? = null

val Icons.Ts.BaseballPlayer: ImageVector
    get() = _BaseballPlayer ?: UXIcon(name = "BaseballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(3f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18.13f, 0.03f)
                lineTo(17.25f, 0.51f)
                lineTo(21.93f, 9.0f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(-4.68f, -1.8f)
                curveToRelative(-0.59f, -0.23f, -1.23f, -0.21f, -1.8f, 0.05f)
                curveToRelative(-0.57f, 0.26f, -1.01f, 0.73f, -1.23f, 1.32f)
                lineToRelative(-5.75f, 15.43f)
                horizontalLineToRelative(1.07f)
                lineToRelative(3.26f, -8.75f)
                lineToRelative(5.53f, 4.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.25f)
                lineToRelative(-2.67f, -1.93f)
                lineToRelative(2.86f, -7.67f)
                lineToRelative(2.13f, 0.82f)
                lineToRelative(5.68f, 0.03f)
                verticalLineToRelative(-1.13f)
                close()
                moveTo(11.49f, 16.21f)
                lineTo(8.83f, 14.28f)
                lineTo(10.83f, 8.92f)
                reflectiveCurveToRelative(0.0f, -0.0f, 0.0f, -0.0f)
                curveToRelative(0.12f, -0.34f, 0.37f, -0.6f, 0.7f, -0.75f)
                curveToRelative(0.33f, -0.15f, 0.69f, -0.16f, 1.03f, -0.03f)
                lineToRelative(1.7f, 0.65f)
                lineToRelative(-2.76f, 7.42f)
                close()
            }
        }.also { _BaseballPlayer = it}
