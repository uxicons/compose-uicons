package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWizard: ImageVector? = null

val Icons.Ss.HatWizard: ImageVector
    get() = _HatWizard ?: UXIcon(name = "HatWizard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22f)
                lineToRelative(-6.08f, -14.34f)
                lineTo(20.6f, 0.0f)
                lineToRelative(-8.68f, 1.53f)
                curveToRelative(-1.71f, 0.3f, -3.12f, 1.45f, -3.77f, 3.06f)
                lineTo(1.15f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.15f)
                close()
                moveTo(10.5f, 14f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                close()
                moveTo(15.5f, 18.5f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                close()
            }
        }.also { _HatWizard = it}
