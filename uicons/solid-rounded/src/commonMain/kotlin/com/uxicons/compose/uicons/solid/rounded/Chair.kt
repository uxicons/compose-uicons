package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Sr.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13.28f)
                lineTo(19f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                lineTo(5f, 13.28f)
                curveToRelative(-1.74f, 0.62f, -3f, 2.27f, -3f, 4.22f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                lineTo(20f, 19f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.95f, -1.26f, -3.6f, -3f, -4.22f)
                close()
                moveTo(17f, 5f)
                lineTo(17f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 2.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                close()
                moveTo(11f, 13f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 13f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 2.18f)
                lineTo(9f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                close()
            }
        }.also { _Chair = it}
