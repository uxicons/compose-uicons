package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Br.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 9.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 5f)
            close()
            moveTo(9.5f, 11f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11f)
            close()
            moveTo(19.35f, 5.11f)
            arcToRelative(1.66f, 1.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -0.61f)
            arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.64f, 0.01f)
            arcTo(10.22f, 10.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.38f)
            verticalLineToRelative(0.67f)
            arcTo(12.97f, 12.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.95f, 24f)
            arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -6.27f)
            arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.61f, -1.03f)
            arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.22f, -11.6f)
            close()
            moveTo(19.65f, 14.4f)
            arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.62f, 2.67f)
            arcTo(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.95f, 21f)
            arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.04f)
            lineTo(3f, 10.38f)
            arcTo(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.77f, 3.01f)
            curveTo(9.88f, 3f, 9.98f, 3f, 10.09f, 3f)
            arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.89f, 3.16f)
            arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 1.8f)
            horizontalLineToRelative(0f)
            arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.65f, 14.4f)
            close()
            moveTo(19f, 11.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 10f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11.5f)
            close()
            moveTo(16f, 16.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 15f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16.5f)
            close()
        }
    }.also { _EggFried = it }
