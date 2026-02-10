package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filters: ImageVector? = null

val Icons.Rs.Filters: ImageVector
    get() = _Filters ?: UXIcon(name = "Filters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-3.09f)
                lineTo(0f, 9.41f)
                verticalLineToRelative(-2.41f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(4.4f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(2.91f)
                lineToRelative(2f, 1.5f)
                verticalLineToRelative(-2f)
                lineToRelative(2f, 1.5f)
                close()
                moveTo(17f, 12.41f)
                lineToRelative(7f, -7f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.41f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(3.09f)
                lineToRelative(6f, 4.5f)
                verticalLineToRelative(-7.59f)
                close()
                moveTo(13f, 11.59f)
                lineTo(6f, 4.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.59f)
                lineToRelative(-7f, 7f)
                verticalLineToRelative(4.41f)
                lineToRelative(-2f, -1.5f)
                verticalLineToRelative(-2.91f)
                close()
            }
        }.also { _Filters = it}
