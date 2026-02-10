package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderAll: ImageVector? = null

val Icons.Ss.BorderAll: ImageVector
    get() = _BorderAll ?: UXIcon(name = "BorderAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 3f)
                lineTo(22f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(3f, 2f)
                lineTo(11f, 2f)
                lineTo(11f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 13f)
                lineTo(11f, 13f)
                verticalLineToRelative(9f)
                lineTo(2f, 22f)
                lineTo(2f, 13f)
                close()
                moveTo(13f, 22f)
                lineTo(13f, 13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                lineTo(13f, 22f)
                close()
            }
        }.also { _BorderAll = it}
