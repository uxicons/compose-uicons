package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartMinus: ImageVector? = null

val Icons.Ts.CartMinus: ImageVector
    get() = _CartMinus ?: UXIcon(name = "CartMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(8f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(20.94f, 14f)
                lineTo(5.88f, 14f)
                lineToRelative(-1.25f, -9f)
                lineTo(13f, 5f)
                verticalLineToRelative(-1f)
                lineTo(4.49f, 4f)
                lineToRelative(-0.26f, -1.84f)
                curveTo(4.06f, 0.93f, 3f, 0f, 1.76f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 1f)
                lineTo(1.76f, 1f)
                curveToRelative(0.75f, 0f, 1.38f, 0.56f, 1.49f, 1.29f)
                lineToRelative(2.02f, 14.55f)
                curveToRelative(0.17f, 1.23f, 1.23f, 2.16f, 2.48f, 2.16f)
                horizontalLineToRelative(12.26f)
                verticalLineToRelative(-1f)
                lineTo(7.74f, 18f)
                curveToRelative(-0.75f, 0f, -1.38f, -0.56f, -1.49f, -1.29f)
                lineToRelative(-0.24f, -1.71f)
                horizontalLineToRelative(15.74f)
                lineToRelative(1.4f, -7f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(-1.2f, 6f)
                close()
            }
        }.also { _CartMinus = it}
