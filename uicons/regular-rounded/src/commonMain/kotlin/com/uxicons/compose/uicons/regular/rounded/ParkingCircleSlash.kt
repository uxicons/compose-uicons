package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Rr.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 22f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.33f, -2.26f)
                lineTo(4.26f, 5.67f)
                curveToRelative(-1.41f, 1.73f, -2.26f, 3.93f, -2.26f, 6.33f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.69f, 0f, -1.31f, 0.35f, -1.68f, 0.91f)
                lineToRelative(4.09f, 4.09f)
                horizontalLineToRelative(0.09f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-2.4f, 0f, -4.6f, 0.85f, -6.33f, 2.26f)
                lineToRelative(2.22f, 2.22f)
                curveToRelative(0.75f, -0.92f, 1.88f, -1.48f, 3.11f, -1.48f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.91f, -1.2f, 3.55f, -2.89f, 4.2f)
                lineToRelative(4.62f, 4.62f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.33f)
                close()
            }
        }.also { _ParkingCircleSlash = it}
