package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedAlt: ImageVector? = null

val Icons.Tr.BedAlt: ImageVector
    get() = _BedAlt ?: UXIcon(name = "BedAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                lineTo(23f, 19f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.27f, 0f, -2.39f, 0.68f, -3f, 1.7f)
                curveToRelative(-0.61f, -1.02f, -1.73f, -1.7f, -3f, -1.7f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 14f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(12.5f, 14f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(4f, 14f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                lineTo(4f, 14f)
                close()
                moveTo(1f, 18f)
                verticalLineToRelative(-3f)
                lineTo(23f, 15f)
                verticalLineToRelative(3f)
                lineTo(1f, 18f)
                close()
            }
        }.also { _BedAlt = it}
