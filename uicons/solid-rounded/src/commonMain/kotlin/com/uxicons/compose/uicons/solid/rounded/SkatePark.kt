package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkatePark: ImageVector? = null

val Icons.Sr.SkatePark: ImageVector
    get() = _SkatePark ?: UXIcon(name = "SkatePark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-16.99f, 0f, -17.33f, -16.63f, -17.33f, -17.33f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12.76f, 9.92f)
                curveToRelative(-1.13f, -1.13f, -1.76f, -2.64f, -1.76f, -4.24f)
                verticalLineToRelative(-0.68f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 1.07f, 0.42f, 2.07f, 1.17f, 2.83f)
                lineToRelative(5.32f, 5.32f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                horizontalLineToRelative(0.68f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-1.6f, 0f, -3.11f, -0.62f, -4.24f, -1.76f)
                close()
                moveTo(9.44f, 11.56f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                reflectiveCurveToRelative(-1.54f, 0.59f, -2.12f, 0f)
                close()
                moveTo(18.56f, 16.44f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                reflectiveCurveToRelative(-1.54f, 0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0f)
                close()
            }
        }.also { _SkatePark = it}
