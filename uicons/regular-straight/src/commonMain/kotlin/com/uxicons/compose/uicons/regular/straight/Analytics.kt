package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Analytics: ImageVector? = null

val Icons.Rs.Analytics: ImageVector
    get() = _Analytics ?: UXIcon(name = "Analytics") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _Analytics = it}
