package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PcChair: ImageVector? = null

val Icons.Tr.PcChair: ImageVector
    get() = _PcChair ?: UXIcon(name = "PcChair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7f)
                verticalLineToRelative(7.15f)
                curveToRelative(-0.6f, 0.21f, -2.03f, 0.69f, -4f, 1.1f)
                verticalLineToRelative(-12.75f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.75f)
                curveToRelative(-1.97f, -0.41f, -3.4f, -0.89f, -4f, -1.1f)
                verticalLineToRelative(-7.15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7.84f)
                curveToRelative(0.63f, 0.22f, 4.86f, 2.01f, 11.5f, 2.15f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.01f)
                curveToRelative(6.65f, -0.14f, 10.86f, -1.93f, 11.5f, -2.15f)
                verticalLineToRelative(-7.84f)
                close()
                moveTo(7.5f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.45f)
                curveToRelative(-3.92f, -1.24f, -8.08f, -1.24f, -12f, 0f)
                verticalLineToRelative(-10.45f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6f, 13.99f)
                curveToRelative(3.91f, -1.3f, 8.09f, -1.3f, 12f, 0f)
                verticalLineToRelative(1.45f)
                curveToRelative(-1.73f, 0.31f, -3.78f, 0.56f, -6f, 0.56f)
                reflectiveCurveToRelative(-4.27f, -0.24f, -6f, -0.56f)
                close()
            }
        }.also { _PcChair = it}
