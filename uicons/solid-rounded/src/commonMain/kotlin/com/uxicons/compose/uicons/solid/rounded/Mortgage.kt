package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mortgage: ImageVector? = null

val Icons.Sr.Mortgage: ImageVector
    get() = _Mortgage ?: UXIcon(name = "Mortgage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.08f, 6.55f)
                lineToRelative(-0.08f, -0.07f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.92f)
                lineToRelative(-4.92f, -3.85f)
                curveToRelative(-1.81f, -1.42f, -4.35f, -1.42f, -6.17f, 0f)
                lineTo(1.92f, 6.55f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.52f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                close()
                moveTo(7f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.0f, 19f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.49f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(4f, -7f)
                curveToRelative(0.27f, -0.48f, 0.89f, -0.65f, 1.36f, -0.37f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.89f, 0.37f, 1.36f)
                lineToRelative(-4f, 7f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                close()
                moveTo(15.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Mortgage = it}
