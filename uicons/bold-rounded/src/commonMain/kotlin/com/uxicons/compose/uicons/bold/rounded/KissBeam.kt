package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KissBeam: ImageVector? = null

val Icons.Br.KissBeam: ImageVector
    get() = _KissBeam ?: UXIcon(name = "KissBeam") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
            curveTo(0.6f, -3.9f, 23.4f, -3.89f, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
            curveToRelative(0.45f, 11.92f, 17.55f, 11.92f, 18f, 0f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
            close()
            moveTo(9.81f, 10.97f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -1.78f)
            curveToRelative(-0.89f, -4.22f, -5.05f, -4.21f, -5.94f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.94f, 0.61f)
            curveToRelative(0.01f, -0.05f, 0.02f, -0.09f, 0.03f, -0.13f)
            curveToRelative(0.01f, 0.04f, 0.02f, 0.09f, 0.03f, 0.13f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 11f)
            arcTo(1.56f, 1.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.81f, 10.97f)
            close()
            moveTo(17.81f, 10.97f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -1.78f)
            curveToRelative(-0.89f, -4.22f, -5.05f, -4.21f, -5.94f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.94f, 0.61f)
            curveToRelative(0.01f, -0.05f, 0.02f, -0.09f, 0.03f, -0.13f)
            curveToRelative(0.01f, 0.04f, 0.02f, 0.09f, 0.03f, 0.13f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 11f)
            arcTo(1.56f, 1.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.81f, 10.97f)
            close()
            moveTo(15f, 14.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 12f)
            lineTo(10.77f, 12f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
            lineTo(12.5f, 14f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
            lineTo(12f, 15f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
            horizontalLineToRelative(0.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
            lineTo(10.77f, 18f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
            lineTo(12.5f, 20f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, -4f)
            arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.5f)
            close()
        }
    }.also { _KissBeam = it }
