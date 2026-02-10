package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsProgress: ImageVector? = null

val Icons.Tr.BarsProgress: ImageVector
    get() = _BarsProgress ?: UXIcon(name = "BarsProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                lineTo(20f, 11f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                lineTo(4f, 3f)
                curveTo(1.79f, 3f, 0f, 4.79f, 0f, 7f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(23f, 7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                lineTo(16f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(4f, 4f)
                lineTo(15f, 4f)
                verticalLineToRelative(6f)
                lineTo(4f, 10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(20f, 13f)
                lineTo(4f, 13f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                lineTo(20f, 21f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(1f, 17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                lineTo(4f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(20f, 20f)
                lineTo(10f, 20f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BarsProgress = it}
