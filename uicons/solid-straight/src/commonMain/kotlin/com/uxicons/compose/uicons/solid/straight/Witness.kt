package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Witness: ImageVector? = null

val Icons.Ss.Witness: ImageVector
    get() = _Witness ?: UXIcon(name = "Witness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(16.08f, 10.0f)
                curveToRelative(-0.5f, 0f, -1.07f, -0.26f, -1.07f, -1.08f)
                curveToRelative(0f, -0.42f, -0.0f, -6.92f, -0.0f, -6.92f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2.0f, -2.0f)
                lineToRelative(5.0f, -0.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4.85f)
                curveToRelative(-0.63f, 0.47f, -2.19f, 1.61f, -2.35f, 1.73f)
                curveToRelative(-0.2f, 0.17f, -0.46f, 0.27f, -0.72f, 0.27f)
                close()
            }
        }.also { _Witness = it}
