package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendBack: ImageVector? = null

val Icons.Rs.SendBack: ImageVector
    get() = _SendBack ?: UXIcon(name = "SendBack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 9f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                lineTo(2f, 9f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _SendBack = it}
