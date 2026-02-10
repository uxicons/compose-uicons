package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microwave: ImageVector? = null

val Icons.Rs.Microwave: ImageVector
    get() = _Microwave ?: UXIcon(name = "Microwave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 5f)
                close()
                moveTo(22f, 19f)
                lineTo(2f, 19f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(14f)
                close()
                moveTo(4f, 17f)
                horizontalLineToRelative(12f)
                lineTo(16f, 6f)
                lineTo(4f, 6f)
                verticalLineToRelative(11f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                lineTo(6f, 15f)
                verticalLineToRelative(-7f)
                close()
                moveTo(18f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 6f)
                close()
            }
        }.also { _Microwave = it}
