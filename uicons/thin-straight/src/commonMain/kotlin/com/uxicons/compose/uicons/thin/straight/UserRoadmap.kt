package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserRoadmap: ImageVector? = null

val Icons.Ts.UserRoadmap: ImageVector
    get() = _UserRoadmap ?: UXIcon(name = "UserRoadmap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(3.5f, 15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7f, 22.2f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                lineTo(2.2f, 21f)
                curveToRelative(-0.66f, 0f, -1.2f, 0.54f, -1.2f, 1.2f)
                verticalLineToRelative(1.8f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -1.21f, 0.99f, -2.2f, 2.2f, -2.2f)
                horizontalLineToRelative(2.6f)
                curveToRelative(1.21f, 0f, 2.2f, 0.99f, 2.2f, 2.2f)
                close()
                moveTo(19f, 5.98f)
                lineToRelative(4.94f, -2.98f)
                lineTo(19.09f, 0f)
                horizontalLineToRelative(-1.09f)
                lineTo(18f, 10f)
                horizontalLineToRelative(1f)
                lineTo(19f, 5.98f)
                close()
                moveTo(19f, 1.12f)
                lineToRelative(3.02f, 1.87f)
                lineToRelative(-3.02f, 1.82f)
                lineTo(19f, 1.12f)
                close()
                moveTo(24f, 18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(9f, 22f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(12.5f, 16f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _UserRoadmap = it}
