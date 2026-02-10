package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeySticks: ImageVector? = null

val Icons.Bs.HockeySticks: ImageVector
    get() = _HockeySticks ?: UXIcon(name = "HockeySticks") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.14f, 12.79f)
                lineTo(24.02f, 0f)
                lineTo(22f, 0f)
                arcToRelative(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.26f, 2.42f)
                lineTo(16.5f, 9.77f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 12f)
                lineTo(10.18f, 12f)
                curveToRelative(-0.67f, -0.17f, -2.21f, -0.69f, -2.59f, -1.91f)
                lineTo(5.26f, 2.42f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(-0.03f, 0f)
                lineTo(3.78f, 12.43f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 24f)
                lineTo(9.25f, 24f)
                arcToRelative(10.22f, 10.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.69f, -0.36f)
                arcTo(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.61f, 24f)
                horizontalLineToRelative(3.6f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -11.21f)
                close()
                moveTo(6f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                horizontalLineToRelative(7.5f)
                arcToRelative(6.15f, 6.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.08f, -0.82f)
                lineToRelative(-0.54f, 1.79f)
                arcTo(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.25f, 21f)
                close()
                moveTo(20.27f, 20.08f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.2f, 21f)
                lineTo(16.45f, 21f)
                arcToRelative(10.11f, 10.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.46f, -4.16f)
                lineToRelative(0.35f, -1.17f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 2.25f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.27f, 20.08f)
                close()
            }
        }.also { _HockeySticks = it}
