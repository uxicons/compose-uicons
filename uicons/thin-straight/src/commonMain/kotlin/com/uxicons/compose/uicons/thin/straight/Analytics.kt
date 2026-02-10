package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Analytics: ImageVector? = null

val Icons.Ts.Analytics: ImageVector
    get() = _Analytics ?: UXIcon(name = "Analytics") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(15f)
                close()
                moveTo(4f, 5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(7f, 5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _Analytics = it}
