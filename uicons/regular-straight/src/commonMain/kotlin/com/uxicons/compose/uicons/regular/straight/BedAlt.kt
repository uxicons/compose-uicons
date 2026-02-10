package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedAlt: ImageVector? = null

val Icons.Rs.BedAlt: ImageVector
    get() = _BedAlt ?: UXIcon(name = "BedAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-3f)
                lineTo(22f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 4f)
                lineTo(21f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.77f, -2f, -0.77f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                lineTo(2f, 13f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(11f, 13f)
                lineTo(6f, 13f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(2f, 17f)
                verticalLineToRelative(-2f)
                lineTo(22f, 15f)
                verticalLineToRelative(2f)
                lineTo(2f, 17f)
                close()
            }
        }.also { _BedAlt = it}
