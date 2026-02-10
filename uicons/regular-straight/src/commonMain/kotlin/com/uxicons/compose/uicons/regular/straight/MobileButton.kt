package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileButton: ImageVector? = null

val Icons.Rs.MobileButton: ImageVector
    get() = _MobileButton ?: UXIcon(name = "MobileButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                lineTo(4f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(6f, 2f)
                horizontalLineToRelative(12f)
                lineTo(18f, 21f)
                close()
                moveTo(14f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _MobileButton = it}
