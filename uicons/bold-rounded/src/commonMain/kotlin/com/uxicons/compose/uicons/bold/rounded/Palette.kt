package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Br.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 8f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.04f, 10.93f)
            arcTo(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0.01f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.08f, 24f)
            curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, -1.51f)
            lineToRelative(-0.03f, -3.42f)
            arcToRelative(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.88f, -2.05f)
            lineToRelative(0.1f, 0.1f)
            arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, 0.64f)
            arcTo(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.3f, 16.25f)
            arcTo(11.91f, 11.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.04f, 10.93f)
            close()
            moveTo(20.79f, 14.29f)
            arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.36f, 4.75f)
            lineToRelative(0.02f, 1.93f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.08f, 3f)
            curveToRelative(0.1f, 0f, 0.21f, 0f, 0.32f, 0.01f)
            arcToRelative(9.11f, 9.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.65f, 8.19f)
            arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.79f, 14.29f)
            close()
        }
    }.also { _Palette = it }
