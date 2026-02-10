package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManHead: ImageVector? = null

val Icons.Ss.ManHead: ImageVector
    get() = _ManHead ?: UXIcon(name = "ManHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.99f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.99f, 11.5f)
                close()
                moveTo(23.99f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.15f, -3.23f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.22f, 7.9f)
                lineTo(1.5f, 12f)
                reflectiveCurveToRelative(1.61f, 0f, 1.78f, -0.01f)
                arcToRelative(12.19f, 12.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, -1.19f)
                arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, 0.7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.62f, 10.01f)
                curveToRelative(0.03f, -0.02f, 0.05f, -0.03f, 0.08f, -0.04f)
                arcTo(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.11f, 3.14f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.83f, 6.01f)
                lineToRelative(0.08f, 0.75f)
                lineToRelative(0.74f, 0.13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 1.47f)
                lineTo(22f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.03f)
                lineToRelative(-0.83f, -0.15f)
                lineToRelative(-0.28f, 0.8f)
                curveTo(18.21f, 16.22f, 15.13f, 19f, 12f, 19f)
                horizontalLineToRelative(0f)
                curveToRelative(-3.03f, 0f, -6.02f, -2.62f, -7.04f, -5.15f)
                arcTo(13.54f, 13.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                lineTo(2.88f, 14f)
                curveToRelative(0.06f, 0.18f, 0.11f, 0.3f, 0.12f, 0.34f)
                arcToRelative(10.89f, 10.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.6f)
                lineTo(8f, 24f)
                horizontalLineToRelative(8f)
                lineTo(16f, 19.95f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.73f, -4.96f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
                close()
            }
        }.also { _ManHead = it}
