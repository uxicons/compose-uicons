package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cowbell: ImageVector? = null

val Icons.Bs.Cowbell: ImageVector
    get() = _Cowbell ?: UXIcon(name = "Cowbell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.82f, 21f)
                lineToRelative(-2.38f, -12.35f)
                curveToRelative(-0.41f, -2.12f, -2.26f, -3.65f, -4.42f, -3.65f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.65f, 0.13f, -1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.35f, 0.04f, 0.68f, 0.13f, 1f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(-2.15f, 0f, -4.01f, 1.54f, -4.42f, 3.65f)
                lineTo(0.18f, 21f)
                horizontalLineToRelative(7.94f)
                curveToRelative(0.45f, 1.72f, 2.01f, 3f, 3.87f, 3f)
                reflectiveCurveToRelative(3.43f, -1.28f, 3.87f, -3f)
                horizontalLineToRelative(7.94f)
                close()
                moveTo(10f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(5.51f, 9.22f)
                curveToRelative(0.14f, -0.71f, 0.75f, -1.22f, 1.47f, -1.22f)
                horizontalLineToRelative(10.04f)
                curveToRelative(0.72f, 0f, 1.34f, 0.51f, 1.47f, 1.22f)
                lineToRelative(1.69f, 8.78f)
                lineTo(3.82f, 18f)
                lineToRelative(1.69f, -8.78f)
                close()
            }
        }.also { _Cowbell = it}
