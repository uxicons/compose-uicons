package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentUser: ImageVector? = null

val Icons.Sr.GovernmentUser: ImageVector
    get() = _GovernmentUser ?: UXIcon(name = "GovernmentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 5f)
                curveTo(5f, 2.24f, 7.24f, 0f, 10f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(23f, 0f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(5.35f)
                curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
                lineToRelative(1.33f, -1.74f)
                lineToRelative(1.33f, 1.74f)
                curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
                lineTo(23f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 20f)
                lineTo(1f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(10.54f, 14.19f)
                lineToRelative(0.96f, 3.81f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.53f, 0f, 0.93f, -0.5f, 0.79f, -1.01f)
                curveToRelative(-0.69f, -2.66f, -2.71f, -4.78f, -5.31f, -5.61f)
                lineToRelative(-1.87f, 2.81f)
                close()
                moveTo(3.07f, 18f)
                horizontalLineToRelative(5.43f)
                lineToRelative(0.96f, -3.81f)
                lineToRelative(-1.87f, -2.81f)
                curveToRelative(-2.6f, 0.83f, -4.62f, 2.95f, -5.31f, 5.61f)
                curveToRelative(-0.13f, 0.51f, 0.26f, 1.01f, 0.79f, 1.01f)
                close()
            }
        }.also { _GovernmentUser = it}
