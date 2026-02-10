package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Br.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
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
            moveTo(17.56f, 16.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.11f, -2.13f)
            arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.89f, 0.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.11f, 2.13f)
            arcTo(8.81f, 8.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            arcTo(8.81f, 8.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.56f, 16.56f)
            close()
            moveTo(9.81f, 11.96f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -1.78f)
            curveToRelative(-0.89f, -4.22f, -5.05f, -4.21f, -5.94f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.94f, 0.62f)
            curveToRelative(0.01f, -0.05f, 0.02f, -0.09f, 0.03f, -0.13f)
            curveToRelative(0.01f, 0.04f, 0.02f, 0.09f, 0.03f, 0.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.78f, 1.16f)
            close()
            moveTo(17.81f, 11.96f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -1.78f)
            curveToRelative(-0.89f, -4.22f, -5.05f, -4.21f, -5.94f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.94f, 0.62f)
            curveToRelative(0.01f, -0.05f, 0.02f, -0.09f, 0.03f, -0.13f)
            curveToRelative(0.01f, 0.04f, 0.02f, 0.09f, 0.03f, 0.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.78f, 1.16f)
            close()
        }
    }.also { _SmileBeam = it }
