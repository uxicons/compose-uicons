package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Operation: ImageVector? = null

val Icons.Rs.Operation: ImageVector
    get() = _Operation ?: UXIcon(name = "Operation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(2.98f, 0f, 5.82f, 1.12f, 8f, 3.07f)
                lineTo(20f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.12f)
                curveToRelative(-1.86f, -1.89f, -4.42f, -3f, -7.12f, -3f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                curveToRelative(-2.7f, 0f, -5.25f, -1.11f, -7.12f, -3f)
                horizontalLineToRelative(4.12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.07f)
                curveToRelative(2.18f, 1.95f, 5.02f, 3.07f, 8f, 3.07f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17.7f, 9.87f)
                lineToRelative(-1.42f, 0.82f)
                curveToRelative(0.13f, 0.42f, 0.22f, 0.85f, 0.22f, 1.31f)
                reflectiveCurveToRelative(-0.09f, 0.89f, -0.22f, 1.31f)
                lineToRelative(1.42f, 0.82f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-1.41f, -0.81f)
                curveToRelative(-0.6f, 0.65f, -1.39f, 1.12f, -2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(-0.9f, -0.2f, -1.68f, -0.68f, -2.29f, -1.33f)
                lineToRelative(-1.41f, 0.81f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(1.42f, -0.82f)
                curveToRelative(-0.13f, -0.42f, -0.22f, -0.85f, -0.22f, -1.31f)
                reflectiveCurveToRelative(0.09f, -0.9f, 0.22f, -1.31f)
                lineToRelative(-1.42f, -0.81f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.41f, 0.81f)
                curveToRelative(0.6f, -0.65f, 1.39f, -1.12f, 2.29f, -1.33f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.62f)
                curveToRelative(0.9f, 0.2f, 1.69f, 0.68f, 2.29f, 1.33f)
                lineToRelative(1.41f, -0.81f)
                lineToRelative(1.0f, 1.73f)
                close()
                moveTo(14.5f, 12f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _Operation = it}
