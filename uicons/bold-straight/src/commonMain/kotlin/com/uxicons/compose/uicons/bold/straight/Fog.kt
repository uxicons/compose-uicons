package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fog: ImageVector? = null

val Icons.Bs.Fog: ImageVector
    get() = _Fog ?: UXIcon(name = "Fog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(5f, 24f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(4f)
                lineTo(19f, 21f)
                lineTo(15f, 21f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(8f)
                lineTo(19f, 16f)
                lineTo(11f, 16f)
                close()
                moveTo(5f, 16f)
                verticalLineToRelative(3f)
                lineTo(9f, 19f)
                lineTo(9f, 16f)
                close()
                moveTo(24f, 12.48f)
                arcTo(7.41f, 7.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.58f, 5.1f)
                arcTo(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.09f, 0f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 1.89f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.39f)
                lineTo(0.01f, 14.39f)
                curveToRelative(0f, 0.04f, 0f, 0.07f, 0f, 0.11f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.16f)
                lineTo(3.0f, 14.5f)
                curveToRelative(0f, -0.04f, 0f, -0.08f, 0f, -0.11f)
                lineTo(3f, 14.39f)
                arcTo(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.53f, 11.9f)
                lineToRelative(1.2f, -0.61f)
                lineToRelative(-0.48f, -1.26f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, -5f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.97f, 3.93f)
                lineToRelative(0.31f, 1.04f)
                lineTo(16.45f, 8f)
                arcTo(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.48f)
                horizontalLineToRelative(0f)
                lineTo(21f, 18.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -6.2f)
                verticalLineToRelative(-0.02f)
                close()
            }
        }.also { _Fog = it}
