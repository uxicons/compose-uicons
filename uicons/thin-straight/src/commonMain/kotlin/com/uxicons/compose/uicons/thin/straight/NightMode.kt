package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightMode: ImageVector? = null

val Icons.Ts.NightMode: ImageVector
    get() = _NightMode ?: UXIcon(name = "NightMode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.0f, 9.13f)
                verticalLineToRelative(-6.13f)
                horizontalLineToRelative(-6.13f)
                lineToRelative(-2.87f, -2.86f)
                lineToRelative(-2.87f, 2.86f)
                lineToRelative(-6.13f, 0.0f)
                verticalLineToRelative(6.13f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(2.86f, 2.87f)
                lineToRelative(0.0f, 6.13f)
                lineToRelative(6.14f, -0.0f)
                lineToRelative(2.86f, 2.86f)
                lineToRelative(2.87f, -2.86f)
                horizontalLineToRelative(6.13f)
                lineToRelative(-0.0f, -6.13f)
                lineToRelative(2.87f, -2.87f)
                close()
                moveTo(20f, 14.45f)
                verticalLineToRelative(5.55f)
                horizontalLineToRelative(-5.55f)
                lineToRelative(-2.45f, 2.45f)
                lineToRelative(-2.45f, -2.45f)
                horizontalLineToRelative(-5.55f)
                verticalLineToRelative(-5.55f)
                lineToRelative(-2.45f, -2.45f)
                lineToRelative(2.45f, -2.45f)
                verticalLineToRelative(-5.55f)
                horizontalLineToRelative(5.55f)
                lineToRelative(2.45f, -2.45f)
                lineToRelative(2.45f, 2.45f)
                horizontalLineToRelative(5.55f)
                verticalLineToRelative(5.55f)
                lineToRelative(2.45f, 2.45f)
                close()
                moveTo(15.73f, 7.55f)
                lineTo(16.6f, 7.11f)
                reflectiveCurveToRelative(-1.6f, -1.1f, -3.6f, -1.1f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2f, 0f, 3.6f, -1.1f, 3.6f, -1.1f)
                lineToRelative(-0.87f, -0.45f)
                curveToRelative(-1.68f, -0.86f, -2.73f, -2.56f, -2.73f, -4.45f)
                reflectiveCurveToRelative(1.04f, -3.59f, 2.73f, -4.45f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0f, 1.92f, 0.9f, 3.68f, 2.4f, 4.8f)
                curveToRelative(-0.45f, 0.13f, -0.92f, 0.2f, -1.4f, 0.2f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                curveToRelative(0.48f, 0f, 0.95f, 0.07f, 1.4f, 0.2f)
                curveToRelative(-1.5f, 1.12f, -2.4f, 2.88f, -2.4f, 4.8f)
                close()
            }
        }.also { _NightMode = it}
