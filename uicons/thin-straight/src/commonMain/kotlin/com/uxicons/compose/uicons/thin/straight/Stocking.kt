package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Ts.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                lineTo(7f, 0f)
                reflectiveCurveToRelative(0f, 1f, 0f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.65f)
                lineToRelative(-4.4f, 1.54f)
                curveTo(1.15f, 12.27f, -0.78f, 15.96f, 0.3f, 19.4f)
                curveToRelative(0.86f, 2.75f, 3.37f, 4.6f, 6.25f, 4.6f)
                curveToRelative(0.66f, 0f, 1.32f, -0.1f, 1.97f, -0.3f)
                lineToRelative(8.86f, -3.0f)
                curveToRelative(2.76f, -0.94f, 4.62f, -3.52f, 4.62f, -6.44f)
                lineTo(22f, 1f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, -1f, 0f, -1f)
                close()
                moveTo(21f, 14.26f)
                curveToRelative(0f, 2.49f, -1.58f, 4.7f, -3.94f, 5.49f)
                lineToRelative(-8.85f, 3.0f)
                curveToRelative(-0.54f, 0.17f, -1.1f, 0.25f, -1.66f, 0.25f)
                curveToRelative(-2.44f, 0f, -4.57f, -1.56f, -5.29f, -3.9f)
                curveToRelative(-0.91f, -2.92f, 0.72f, -6.04f, 3.66f, -6.96f)
                lineToRelative(5.09f, -1.78f)
                lineTo(10f, 1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(13.26f)
                close()
            }
        }.also { _Stocking = it}
