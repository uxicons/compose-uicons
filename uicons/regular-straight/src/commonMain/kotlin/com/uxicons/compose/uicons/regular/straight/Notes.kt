package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Rs.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(13.69f)
                lineToRelative(6.31f, -6.31f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(6f, 18f)
                lineTo(6f, 3f)
                close()
                moveTo(20.86f, 14f)
                lineToRelative(-2.86f, 2.86f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(2.86f)
                close()
                moveTo(2f, 22f)
                horizontalLineToRelative(13.65f)
                lineToRelative(-2f, 2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-15.22f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(16.04f)
                close()
            }
        }.also { _Notes = it}
