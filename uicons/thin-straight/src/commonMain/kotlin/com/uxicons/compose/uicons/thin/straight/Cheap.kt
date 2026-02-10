package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheap: ImageVector? = null

val Icons.Ts.Cheap: ImageVector
    get() = _Cheap ?: UXIcon(name = "Cheap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.82f, 19.36f)
                lineToRelative(-4.29f, 4.21f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-4.25f, -4.25f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.13f, 4.13f)
                lineTo(18f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(22.68f)
                lineToRelative(4.12f, -4.04f)
                lineToRelative(0.7f, 0.71f)
                close()
                moveTo(1f, 10.5f)
                curveTo(1f, 5.26f, 5.26f, 1f, 10.5f, 1f)
                curveToRelative(2.05f, 0f, 3.95f, 0.66f, 5.5f, 1.77f)
                verticalLineToRelative(-1.2f)
                curveToRelative(-1.6f, -0.99f, -3.48f, -1.57f, -5.5f, -1.57f)
                curveTo(4.71f, 0f, 0f, 4.71f, 0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-5.24f, 0f, -9.5f, -4.26f, -9.5f, -9.5f)
                close()
                moveTo(4f, 10.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                verticalLineToRelative(-1f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.36f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                close()
            }
        }.also { _Cheap = it}
