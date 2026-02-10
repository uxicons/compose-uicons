package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkatePark: ImageVector? = null

val Icons.Rr.SkatePark: ImageVector
    get() = _SkatePark ?: UXIcon(name = "SkatePark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12.01f)
                curveToRelative(-9.8f, -4.91f, -10.01f, -17.17f, -10.01f, -17.33f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.01f, 0.7f, 0.34f, 17.33f, 17.33f, 17.33f)
                horizontalLineToRelative(0.67f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.08f, 15.24f)
                curveToRelative(1.13f, 1.13f, 2.64f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(0.68f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-1.07f, 0f, -2.07f, -0.42f, -2.83f, -1.17f)
                lineToRelative(-5.32f, -5.32f)
                curveToRelative(-0.76f, -0.76f, -1.17f, -1.76f, -1.17f, -2.83f)
                verticalLineToRelative(-0.68f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 1.6f, 0.62f, 3.11f, 1.76f, 4.24f)
                close()
                moveTo(11.56f, 11.56f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                close()
                moveTo(16.44f, 16.44f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                reflectiveCurveToRelative(0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                close()
            }
        }.also { _SkatePark = it}
