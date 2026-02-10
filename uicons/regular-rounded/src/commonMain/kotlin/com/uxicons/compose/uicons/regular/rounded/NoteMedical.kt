package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteMedical: ImageVector? = null

val Icons.Rr.NoteMedical: ImageVector
    get() = _NoteMedical ?: UXIcon(name = "NoteMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 13f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24.04f, 5f)
                verticalLineToRelative(9.93f)
                curveToRelative(0f, 1.6f, -0.62f, 3.11f, -1.76f, 4.24f)
                lineToRelative(-3.07f, 3.07f)
                curveToRelative(-1.13f, 1.13f, -2.64f, 1.76f, -4.24f, 1.76f)
                lineTo(5.04f, 24f)
                curveTo(2.28f, 24f, 0.04f, 21.76f, 0.04f, 19f)
                lineTo(0.04f, 5f)
                curveTo(0.04f, 2.24f, 2.28f, 0f, 5.04f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(15.04f, 22.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0f, -0.02f, 0f, -10f, 0f, -10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5.04f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0f, 0f, 9.98f, 0f, 10f, 0f)
                close()
                moveTo(20.87f, 17.76f)
                curveToRelative(0.23f, -0.23f, 0.43f, -0.49f, 0.59f, -0.76f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.42f)
                curveToRelative(0.27f, -0.17f, 0.53f, -0.36f, 0.76f, -0.59f)
                lineToRelative(3.07f, -3.07f)
                close()
            }
        }.also { _NoteMedical = it}
