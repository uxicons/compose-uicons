package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BigDrop: ImageVector? = null

val Icons.Rs.BigDrop: ImageVector
    get() = _BigDrop ?: UXIcon(name = "BigDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.99f)
                lineToRelative(-0.01f, -3.01f)
                curveToRelative(-0.0f, -1.65f, -1.35f, -2.99f, -3f, -2.99f)
                horizontalLineToRelative(-4.0f)
                lineTo(12f, 0f)
                lineToRelative(-3f, 3f)
                lineTo(5f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 9f)
                verticalLineToRelative(2f)
                lineTo(8f, 11f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 11f)
                horizontalLineToRelative(8f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(11f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1f, 1.0f)
                lineToRelative(0.01f, 3.0f)
                horizontalLineToRelative(-2.01f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _BigDrop = it}
