package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballAlt: ImageVector? = null

val Icons.Ss.BaseballAlt: ImageVector
    get() = _BaseballAlt ?: UXIcon(name = "BaseballAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.19f, 9.66f)
                arcToRelative(31.18f, 31.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.36f, 4.3f)
                curveToRelative(-0.36f, 0.23f, -0.78f, 0.48f, -1.2f, 0.74f)
                curveToRelative(-0.45f, 0.27f, -0.93f, 0.57f, -1.38f, 0.86f)
                lineTo(8.48f, 11.78f)
                curveToRelative(0.34f, -0.53f, 0.71f, -1.13f, 1.04f, -1.67f)
                lineToRelative(0.46f, -0.74f)
                arcToRelative(31.37f, 31.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -5.68f)
                lineTo(16.95f, 1.21f)
                arcTo(4.13f, 4.13f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22.79f, 7.05f)
                close()
                moveTo(7.23f, 13.36f)
                lineTo(2.5f, 18.09f)
                lineTo(1.46f, 17.04f)
                lineTo(0.04f, 18.46f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.91f, 21.5f)
                lineToRelative(4.73f, -4.73f)
                close()
                moveTo(20.5f, 16.98f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 16.98f)
                close()
            }
        }.also { _BaseballAlt = it}
