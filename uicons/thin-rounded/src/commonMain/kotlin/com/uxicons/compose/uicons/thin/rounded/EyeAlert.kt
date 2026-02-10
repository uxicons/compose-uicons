package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeAlert: ImageVector? = null

val Icons.Tr.EyeAlert: ImageVector
    get() = _EyeAlert ?: UXIcon(name = "EyeAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveToRelative(-6.19f, 0f, -9.72f, -4.08f, -11.27f, -6.51f)
                curveToRelative(-0.98f, -1.53f, -0.98f, -3.44f, 0f, -4.97f)
                curveTo(2.28f, 7.08f, 5.81f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9.72f, 4.08f, 11.27f, 6.51f)
                curveToRelative(0.98f, 1.53f, 0.98f, 3.44f, 0f, 4.97f)
                curveToRelative(-1.55f, 2.43f, -5.08f, 6.51f, -11.27f, 6.51f)
                close()
                moveTo(12f, 4f)
                curveTo(6.29f, 4f, 3.01f, 7.79f, 1.57f, 10.05f)
                curveToRelative(-0.77f, 1.2f, -0.77f, 2.69f, 0f, 3.9f)
                curveToRelative(1.44f, 2.26f, 4.71f, 6.05f, 10.43f, 6.05f)
                reflectiveCurveToRelative(8.99f, -3.79f, 10.43f, -6.05f)
                curveToRelative(0.77f, -1.2f, 0.77f, -2.69f, 0f, -3.9f)
                curveToRelative(-1.44f, -2.26f, -4.71f, -6.05f, -10.43f, -6.05f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12.5f, 12.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _EyeAlert = it}
