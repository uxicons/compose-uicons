package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWizard: ImageVector? = null

val Icons.Bs.HatWizard: ImageVector
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
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.29f)
                lineTo(7.78f, 4.99f)
                curveToRelative(0.72f, -1.77f, 2.26f, -3.02f, 4.14f, -3.35f)
                lineTo(21.18f, 0.01f)
                lineToRelative(-4.02f, 8.04f)
                lineToRelative(5.55f, 12.95f)
                horizontalLineToRelative(1.3f)
                close()
                moveTo(4.52f, 21f)
                horizontalLineToRelative(14.91f)
                lineToRelative(-5.59f, -13.05f)
                lineToRelative(1.98f, -3.96f)
                lineToRelative(-3.38f, 0.6f)
                curveToRelative(-0.85f, 0.15f, -1.56f, 0.72f, -1.88f, 1.52f)
                lineToRelative(-6.04f, 14.88f)
                close()
            }
        }.also { _HatWizard = it}
