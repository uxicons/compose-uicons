package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Rr.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(19f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.46f, -0.1f, 0.9f, -0.29f, 1.29f)
                lineToRelative(-6.59f, -6.59f)
                curveToRelative(1.69f, -0.65f, 2.89f, -2.29f, 2.89f, -4.2f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.23f, 0f, -2.36f, 0.56f, -3.1f, 1.48f)
                lineTo(3.71f, 2.29f)
                curveToRelative(0.39f, -0.19f, 0.83f, -0.29f, 1.29f, -0.29f)
                horizontalLineToRelative(14f)
                close()
                moveTo(13.41f, 12f)
                lineToRelative(-4.09f, -4.09f)
                curveToRelative(0.36f, -0.56f, 0.99f, -0.91f, 1.68f, -0.91f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.09f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.46f, 0.1f, -0.9f, 0.29f, -1.29f)
                lineTo(20.29f, 21.71f)
                curveToRelative(-0.39f, 0.19f, -0.83f, 0.29f, -1.29f, 0.29f)
                lineTo(5f, 22f)
                close()
                moveTo(9f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ParkingSlash = it}
