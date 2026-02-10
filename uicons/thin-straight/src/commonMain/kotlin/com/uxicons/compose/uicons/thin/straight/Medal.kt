package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Ts.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.66f, 0f)
                horizontalLineToRelative(-8.47f)
                lineToRelative(-2.97f, 6.0f)
                curveToRelative(-0.07f, -0.0f, -0.15f, -0.0f, -0.22f, -0.0f)
                curveToRelative(-0.08f, 0f, -0.15f, 0f, -0.23f, 0.0f)
                lineTo(8.81f, 0f)
                lineTo(0.32f, 0f)
                lineToRelative(4.64f, 9.4f)
                curveToRelative(-1.23f, 1.54f, -1.96f, 3.49f, -1.96f, 5.6f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                lineTo(23.66f, 0f)
                close()
                moveTo(15.81f, 1f)
                horizontalLineToRelative(6.24f)
                lineToRelative(-3.75f, 7.58f)
                curveToRelative(-1.33f, -1.31f, -3.07f, -2.21f, -5.01f, -2.49f)
                lineToRelative(2.52f, -5.09f)
                close()
                moveTo(1.93f, 1f)
                horizontalLineToRelative(6.26f)
                lineToRelative(2.51f, 5.09f)
                curveToRelative(-1.94f, 0.28f, -3.69f, 1.19f, -5.02f, 2.5f)
                lineTo(1.93f, 1f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 7f, 12f, 7f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                close()
                moveTo(12.76f, 9.87f)
                horizontalLineToRelative(-1.49f)
                lineToRelative(-0.9f, 3.13f)
                horizontalLineToRelative(-3.37f)
                verticalLineToRelative(1.45f)
                lineToRelative(2.32f, 1.34f)
                lineToRelative(-1.08f, 2.96f)
                lineToRelative(1.16f, 0.86f)
                lineToRelative(2.61f, -2.07f)
                lineToRelative(2.61f, 2.09f)
                lineToRelative(1.21f, -0.83f)
                lineToRelative(-1.17f, -2.97f)
                lineToRelative(2.35f, -1.38f)
                verticalLineToRelative(-1.45f)
                horizontalLineToRelative(-3.35f)
                lineToRelative(-0.9f, -3.13f)
                close()
                moveTo(13.41f, 15.39f)
                lineToRelative(1.14f, 2.89f)
                lineToRelative(-2.54f, -2.03f)
                lineToRelative(-2.54f, 2.01f)
                lineToRelative(1.07f, -2.92f)
                lineToRelative(-2.33f, -1.34f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.89f, -3.11f)
                lineToRelative(0.89f, 3.11f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-2.38f, 1.39f)
                close()
            }
        }.also { _Medal = it}
