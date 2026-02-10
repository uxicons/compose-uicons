package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManHead: ImageVector? = null

val Icons.Rs.ManHead: ImageVector
    get() = _ManHead ?: UXIcon(name = "ManHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 13f)
                close()
                moveTo(21.85f, 8.27f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.23f, 7.9f)
                lineTo(1.5f, 12f)
                lineTo(3f, 12f)
                arcToRelative(12.12f, 12.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.18f, -1.2f)
                arcTo(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.63f, -1.49f)
                arcToRelative(16.77f, 16.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.29f, -5.25f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.03f, 4.1f)
                curveTo(11.49f, 6.38f, 8.22f, 9.56f, 3.89f, 9.96f)
                lineTo(4.19f, 8.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.77f, 0.86f)
                lineToRelative(0.08f, 0.74f)
                lineToRelative(0.74f, 0.13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                curveToRelative(-0.09f, 0f, -1.09f, -0.17f, -1.09f, -0.17f)
                lineToRelative(-0.28f, 0.8f)
                curveTo(18.21f, 16.22f, 15.13f, 19f, 12f, 19f)
                horizontalLineToRelative(0f)
                curveToRelative(-3.03f, 0f, -6.02f, -2.62f, -7.04f, -5.15f)
                arcTo(13.54f, 13.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                lineTo(2.88f, 14f)
                curveToRelative(0.06f, 0.18f, 0.11f, 0.3f, 0.12f, 0.34f)
                arcToRelative(10.89f, 10.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.6f)
                lineTo(8f, 24f)
                horizontalLineToRelative(2f)
                lineTo(10f, 20.73f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                horizontalLineToRelative(0f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -0.26f)
                lineTo(14f, 24f)
                horizontalLineToRelative(2f)
                lineTo(16f, 19.95f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.73f, -4.96f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.12f, -6.72f)
                close()
            }
        }.also { _ManHead = it}
