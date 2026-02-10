package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCrossbones: ImageVector? = null

val Icons.Ts.SkullCrossbones: ImageVector
    get() = _SkullCrossbones ?: UXIcon(name = "SkullCrossbones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.4f, 19.01f)
                lineToRelative(10.56f, 4.03f)
                lineToRelative(-0.36f, 0.94f)
                lineToRelative(-11.6f, -4.43f)
                lineTo(0.4f, 23.97f)
                lineToRelative(-0.36f, -0.94f)
                lineToRelative(10.56f, -4.03f)
                lineTo(0.04f, 14.98f)
                lineToRelative(0.36f, -0.94f)
                lineToRelative(11.6f, 4.43f)
                lineToRelative(11.6f, -4.43f)
                lineToRelative(0.36f, 0.94f)
                lineToRelative(-10.56f, 4.03f)
                close()
                moveTo(14f, 8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(10f, 8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(8f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _SkullCrossbones = it}
