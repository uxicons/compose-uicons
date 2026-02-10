package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Towel: ImageVector? = null

val Icons.Rr.Towel: ImageVector
    get() = _Towel ?: UXIcon(name = "Towel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-13.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(7f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(20f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10.34f)
                curveToRelative(-0.22f, 0.46f, -0.34f, 0.96f, -0.34f, 1.5f)
                close()
                moveTo(17f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Towel = it}
