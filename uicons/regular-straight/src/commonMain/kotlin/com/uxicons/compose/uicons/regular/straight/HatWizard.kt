package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWizard: ImageVector? = null

val Icons.Rs.HatWizard: ImageVector
    get() = _HatWizard ?: UXIcon(name = "HatWizard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 17.5f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                close()
                moveTo(11.5f, 14f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(0.83f, 1.67f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.15f)
                lineTo(8.15f, 4.59f)
                curveToRelative(0.65f, -1.61f, 2.06f, -2.76f, 3.77f, -3.06f)
                lineTo(20.6f, 0.0f)
                lineToRelative(-3.83f, 7.66f)
                lineToRelative(6.08f, 14.34f)
                horizontalLineToRelative(1.15f)
                close()
                moveTo(3.31f, 22f)
                horizontalLineToRelative(17.37f)
                lineToRelative(-6.11f, -14.41f)
                lineToRelative(2.46f, -4.93f)
                lineToRelative(-4.77f, 0.84f)
                curveToRelative(-1.03f, 0.18f, -1.87f, 0.87f, -2.26f, 1.83f)
                lineTo(3.31f, 22f)
                close()
            }
        }.also { _HatWizard = it}
