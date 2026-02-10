package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pattern: ImageVector? = null

val Icons.Rs.Pattern: ImageVector
    get() = _Pattern ?: UXIcon(name = "Pattern") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(5f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                close()
                moveTo(7.46f, 13.5f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
                close()
                moveTo(16.5f, 14f)
                lineToRelative(3.12f, 5f)
                horizontalLineToRelative(-6.25f)
                lineToRelative(3.12f, -5f)
                close()
            }
        }.also { _Pattern = it}
