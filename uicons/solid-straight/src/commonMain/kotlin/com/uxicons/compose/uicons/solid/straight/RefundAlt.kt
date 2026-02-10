package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RefundAlt: ImageVector? = null

val Icons.Ss.RefundAlt: ImageVector
    get() = _RefundAlt ?: UXIcon(name = "RefundAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10f)
                curveToRelative(0f, 0.38f, 0.27f, 0.7f, 0.64f, 0.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.38f, -0.27f, -0.7f, -0.65f, -0.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.34f, -0.22f, -2.31f, -1.37f, -2.31f, -2.73f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(4.99f)
                curveToRelative(1.11f, 0f, 2.01f, -0.9f, 2.01f, -2.01f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.01f, 3.34f)
                curveTo(19.8f, 2.03f, 16.1f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.51f, 2f, 12f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(3.64f, 0f, 6.9f, 1.92f, 8.67f, 5f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _RefundAlt = it}
