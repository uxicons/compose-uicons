package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DollyFlatbedAlt: ImageVector? = null

val Icons.Bs.DollyFlatbedAlt: ImageVector
    get() = _DollyFlatbedAlt ?: UXIcon(name = "DollyFlatbedAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 18f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.55f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                horizontalLineToRelative(-5.6f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.18f, 0.02f, -0.36f, 0.06f, -0.53f)
                curveToRelative(-1.72f, -0.22f, -3.06f, -1.69f, -3.06f, -3.47f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(8f)
                lineTo(8f, 16f)
                verticalLineToRelative(-8f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                close()
                moveTo(13.94f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(13.94f, 0f)
                close()
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _DollyFlatbedAlt = it}
