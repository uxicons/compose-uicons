package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropdown: ImageVector? = null

val Icons.Tr.Dropdown: ImageVector
    get() = _Dropdown ?: UXIcon(name = "Dropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 4f)
                lineTo(4.5f, 4f)
                curveTo(2.02f, 4f, 0f, 6.02f, 0f, 8.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 15.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 19f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7f)
                close()
                moveTo(19.06f, 9.97f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-0.55f, 0f, -1.03f, 0.33f, -1.24f, 0.83f)
                curveToRelative(-0.21f, 0.51f, -0.09f, 1.08f, 0.3f, 1.46f)
                lineToRelative(2.21f, 2.18f)
                curveToRelative(0.35f, 0.35f, 0.82f, 0.53f, 1.29f, 0.53f)
                reflectiveCurveToRelative(0.93f, -0.18f, 1.28f, -0.53f)
                lineToRelative(2.22f, -2.18f)
                curveToRelative(0.39f, -0.38f, 0.51f, -0.95f, 0.3f, -1.46f)
                curveToRelative(-0.21f, -0.5f, -0.69f, -0.83f, -1.24f, -0.83f)
                close()
                moveTo(19.3f, 11.55f)
                lineToRelative(-2.22f, 2.18f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.32f, 0.32f, -0.84f, 0.32f, -1.16f, -0.0f)
                lineToRelative(-2.22f, -2.18f)
                curveToRelative(-0.15f, -0.14f, -0.1f, -0.3f, -0.08f, -0.37f)
                curveToRelative(0.03f, -0.06f, 0.11f, -0.21f, 0.31f, -0.21f)
                horizontalLineToRelative(5.12f)
                curveToRelative(0.2f, 0f, 0.29f, 0.15f, 0.31f, 0.21f)
                curveToRelative(0.03f, 0.06f, 0.07f, 0.23f, -0.08f, 0.37f)
                close()
            }
        }.also { _Dropdown = it}
