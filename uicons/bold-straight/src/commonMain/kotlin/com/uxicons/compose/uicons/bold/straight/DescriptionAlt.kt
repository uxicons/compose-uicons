package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DescriptionAlt: ImageVector? = null

val Icons.Bs.DescriptionAlt: ImageVector
    get() = _DescriptionAlt ?: UXIcon(name = "DescriptionAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(21f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveTo(0f, 14.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 22.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(0f, 8f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _DescriptionAlt = it}
