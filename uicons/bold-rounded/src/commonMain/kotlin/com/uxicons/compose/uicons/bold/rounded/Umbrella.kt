package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Br.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.7f, 9.89f)
            arcToRelative(12.63f, 12.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.2f, -7.79f)
            verticalLineToRelative(-0.6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(0.61f)
            arcToRelative(12.83f, 12.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.2f, 7.78f)
            arcToRelative(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.51f, 4.21f)
            arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, 1.9f)
            horizontalLineToRelative(6.12f)
            verticalLineToRelative(4.25f)
            arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0.09f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.98f, 0.33f)
            arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.48f, -0.41f)
            verticalLineToRelative(-4.25f)
            horizontalLineToRelative(6.12f)
            arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -1.9f)
            arcToRelative(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.51f, -4.21f)
            close()
            moveTo(20.72f, 12.4f)
            arcToRelative(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, 0.6f)
            horizontalLineToRelative(-15.24f)
            arcToRelative(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, -0.6f)
            arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.18f, -1.45f)
            arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.91f, -5.95f)
            arcToRelative(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.89f, 5.95f)
            arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.18f, 1.45f)
            close()
        }
    }.also { _Umbrella = it }
