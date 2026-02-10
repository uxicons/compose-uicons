package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMat: ImageVector? = null

val Icons.Rs.YogaMat: ImageVector
    get() = _YogaMat ?: UXIcon(name = "YogaMat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 0f)
                horizontalLineToRelative(-3.86f)
                lineTo(16f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1.5f)
                curveTo(9f, 2.02f, 6.98f, 0f, 4.5f, 0f)
                reflectiveCurveTo(0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.36f, 0f, 4.3f, -1.83f, 4.49f, -4.14f)
                lineToRelative(0.01f, -15.71f)
                curveToRelative(0f, -2.29f, -1.86f, -4.14f, -4.14f, -4.14f)
                close()
                moveTo(4.5f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(7f, 15.76f)
                curveToRelative(-0.72f, -0.48f, -1.57f, -0.76f, -2.5f, -0.76f)
                reflectiveCurveToRelative(-1.78f, 0.28f, -2.5f, 0.76f)
                lineTo(2f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(2f, 19.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.5f, 22f)
                lineTo(8.24f, 22f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.57f, 0.76f, -2.5f)
                lineTo(9f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(22f, 15.76f)
                curveToRelative(-0.72f, -0.48f, -1.58f, -0.76f, -2.5f, -0.76f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 2f)
                horizontalLineToRelative(1.86f)
                curveToRelative(1.18f, 0f, 2.14f, 0.96f, 2.14f, 2.14f)
                lineTo(22f, 15.76f)
                close()
            }
        }.also { _YogaMat = it}
