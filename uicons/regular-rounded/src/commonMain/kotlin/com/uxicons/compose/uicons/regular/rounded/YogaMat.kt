package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMat: ImageVector? = null

val Icons.Rr.YogaMat: ImageVector
    get() = _YogaMat ?: UXIcon(name = "YogaMat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 0f)
                horizontalLineToRelative(-0.56f)
                curveToRelative(-1.82f, 0f, -3.3f, 1.48f, -3.3f, 3.3f)
                verticalLineToRelative(2.7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1.5f)
                curveTo(9f, 2.02f, 6.98f, 0f, 4.5f, 0f)
                reflectiveCurveTo(0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.29f, 0.04f, 4.34f, -1.88f, 4.5f, -4.14f)
                lineTo(24f, 4.14f)
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
                moveTo(22f, 19.51f)
                curveToRelative(0.02f, 1.34f, -1.16f, 2.52f, -2.5f, 2.49f)
                lineTo(8.24f, 22f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.57f, 0.76f, -2.5f)
                lineTo(9f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 1.82f, 1.48f, 3.3f, 3.3f, 3.3f)
                curveToRelative(1.47f, 0f, 2.72f, 1.14f, 2.7f, 2.51f)
                close()
                moveTo(22f, 15.81f)
                curveToRelative(-0.77f, -0.51f, -1.7f, -0.81f, -2.7f, -0.81f)
                curveToRelative(-0.72f, 0f, -1.3f, -0.58f, -1.3f, -1.3f)
                lineTo(18f, 3.3f)
                curveToRelative(0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f)
                horizontalLineToRelative(0.56f)
                curveToRelative(1.18f, 0f, 2.14f, 0.96f, 2.14f, 2.14f)
                lineTo(22.0f, 15.81f)
                close()
            }
        }.also { _YogaMat = it}
