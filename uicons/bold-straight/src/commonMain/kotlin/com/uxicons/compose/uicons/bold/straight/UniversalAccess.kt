package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniversalAccess: ImageVector? = null

val Icons.Bs.UniversalAccess: ImageVector
    get() = _UniversalAccess ?: UXIcon(name = "UniversalAccess") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(10f, 6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(14f, 11.7f)
                verticalLineToRelative(1.45f)
                lineToRelative(2.34f, 4.68f)
                lineToRelative(-2.68f, 1.34f)
                lineToRelative(-1.59f, -3.17f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-1.59f, 3.17f)
                lineToRelative(-2.68f, -1.34f)
                lineToRelative(2.34f, -4.68f)
                verticalLineToRelative(-1.45f)
                lineToRelative(-4.11f, -1.83f)
                lineToRelative(1.22f, -2.74f)
                lineToRelative(4.21f, 1.87f)
                horizontalLineToRelative(1.36f)
                lineToRelative(4.21f, -1.87f)
                lineToRelative(1.22f, 2.74f)
                lineToRelative(-4.11f, 1.83f)
                close()
            }
        }.also { _UniversalAccess = it}
