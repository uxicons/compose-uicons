package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percent50: ImageVector? = null

val Icons.Ss.Percent50: ImageVector
    get() = _Percent50 ?: UXIcon(name = "Percent50") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.4f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.4f, -0.9f, -0.9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.4f, 0.9f, 0.9f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.63f, -5.37f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.63f, 0f, 12f)
                reflectiveCurveTo(5.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.37f, 12f, 12f)
                close()
                moveTo(15f, 9.23f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                close()
                moveTo(8f, 13.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(2.9f)
                verticalLineToRelative(-1.6f)
                lineTo(3f, 8f)
                verticalLineToRelative(4.6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(14f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.78f, 15.98f)
                lineToRelative(5.22f, -8f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-5.22f, 8f)
                horizontalLineToRelative(1.91f)
                close()
                moveTo(22f, 14.73f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                close()
            }
        }.also { _Percent50 = it}
