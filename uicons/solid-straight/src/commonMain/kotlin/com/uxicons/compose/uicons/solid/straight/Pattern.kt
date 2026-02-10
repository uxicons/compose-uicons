package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pattern: ImageVector? = null

val Icons.Ss.Pattern: ImageVector
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
                moveTo(14f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                lineTo(14f, 4f)
                close()
                moveTo(7f, 4f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(7.03f, 20.32f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-3.75f, 3.75f)
                close()
                moveTo(13.23f, 20f)
                lineToRelative(3.75f, -6f)
                lineToRelative(3.75f, 6f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }.also { _Pattern = it}
