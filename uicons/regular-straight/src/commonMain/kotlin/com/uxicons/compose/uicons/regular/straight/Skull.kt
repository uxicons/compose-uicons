package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Rs.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 0.02f)
                curveToRelative(-3.08f, -0.2f, -6.01f, 0.84f, -8.26f, 2.94f)
                curveTo(2.27f, 5.04f, 1f, 7.97f, 1f, 11f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5.65f)
                curveTo(23f, 5.38f, 18.5f, 0.41f, 12.75f, 0.02f)
                close()
                moveTo(21f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                lineTo(7f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.48f, 1.04f, -4.87f, 2.86f, -6.57f)
                curveToRelative(1.84f, -1.72f, 4.24f, -2.57f, 6.76f, -2.41f)
                curveToRelative(4.7f, 0.31f, 8.38f, 4.41f, 8.38f, 9.33f)
                verticalLineToRelative(5.65f)
                close()
                moveTo(10f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 17.0f)
                curveToRelative(0f, 1.1f, -0.9f, 1f, -2f, 1f)
                reflectiveCurveToRelative(-2f, 0.1f, -2f, -1f)
                reflectiveCurveToRelative(0.9f, -3f, 2f, -3f)
                reflectiveCurveToRelative(2f, 1.9f, 2f, 3f)
                close()
            }
        }.also { _Skull = it}
