package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meeting: ImageVector? = null

val Icons.Sr.Meeting: ImageVector
    get() = _Meeting ?: UXIcon(name = "Meeting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.93f, 9f)
                horizontalLineToRelative(0.07f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(0.2f)
                lineToRelative(1.83f, 1.62f)
                curveToRelative(0.29f, 0.26f, 0.65f, 0.38f, 1.02f, 0.38f)
                curveToRelative(0.36f, 0f, 0.72f, -0.13f, 1.0f, -0.38f)
                lineToRelative(1.88f, -1.62f)
                close()
                moveTo(5.5f, 18f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(15f, 14.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(5.5f, 19f)
                curveToRelative(-2.43f, 0f, -4.62f, 1.47f, -5.44f, 3.65f)
                curveToRelative(-0.12f, 0.31f, -0.07f, 0.65f, 0.11f, 0.92f)
                curveToRelative(0.19f, 0.27f, 0.49f, 0.43f, 0.82f, 0.43f)
                horizontalLineToRelative(9f)
                curveToRelative(0.33f, 0f, 0.64f, -0.16f, 0.82f, -0.43f)
                curveToRelative(0.19f, -0.27f, 0.23f, -0.61f, 0.11f, -0.92f)
                curveToRelative(-0.82f, -2.18f, -3.0f, -3.65f, -5.44f, -3.65f)
                close()
                moveTo(23.94f, 22.65f)
                curveToRelative(-0.82f, -2.18f, -3.0f, -3.65f, -5.44f, -3.65f)
                reflectiveCurveToRelative(-4.62f, 1.47f, -5.44f, 3.65f)
                curveToRelative(-0.12f, 0.31f, -0.07f, 0.65f, 0.11f, 0.92f)
                curveToRelative(0.19f, 0.27f, 0.49f, 0.43f, 0.82f, 0.43f)
                horizontalLineToRelative(9f)
                curveToRelative(0.33f, 0f, 0.64f, -0.16f, 0.82f, -0.43f)
                curveToRelative(0.19f, -0.27f, 0.23f, -0.61f, 0.11f, -0.92f)
                close()
            }
        }.also { _Meeting = it}
