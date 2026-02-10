package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughBeam: ImageVector? = null

val Icons.Br.LaughBeam: ImageVector
    get() = _LaughBeam ?: UXIcon(name = "LaughBeam") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.47f, -1.19f)
            curveToRelative(-0.01f, -0.05f, -0.02f, -0.09f, -0.03f, -0.13f)
            curveToRelative(-0.01f, 0.04f, -0.02f, 0.09f, -0.03f, 0.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.94f, -0.61f)
            curveToRelative(0.89f, -4.22f, 5.05f, -4.21f, 5.94f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 12f)
            close()
            moveTo(17.81f, 11.97f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -1.77f)
            curveToRelative(-0.89f, -4.22f, -5.05f, -4.21f, -5.94f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.94f, 0.61f)
            curveToRelative(0.01f, -0.05f, 0.02f, -0.09f, 0.03f, -0.13f)
            curveToRelative(0.01f, 0.04f, 0.02f, 0.09f, 0.03f, 0.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 1.16f)
            close()
            moveTo(24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            curveTo(-3.9f, 0.6f, -3.89f, 23.4f, 12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
            curveTo(0.08f, 20.55f, 0.08f, 3.45f, 12f, 3f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
            close()
            moveTo(15.5f, 14f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.27f, 2.2f)
            arcTo(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            arcToRelative(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.77f, -2.8f)
            arcTo(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
            close()
        }
    }.also { _LaughBeam = it }
