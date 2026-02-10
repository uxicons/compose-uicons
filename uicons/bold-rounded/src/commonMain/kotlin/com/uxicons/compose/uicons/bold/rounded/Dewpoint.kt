package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Br.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 24f)
            arcToRelative(9.89f, 9.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.08f, -2.96f)
            curveTo(-4.04f, 14.06f, 3.4f, 4.95f, 6.54f, 1.57f)
            arcTo(4.57f, 4.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.01f, 0f)
            arcToRelative(4.62f, 4.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.51f, 1.62f)
            curveTo(16.65f, 5f, 24.02f, 14.09f, 17.08f, 21.04f)
            arcTo(9.89f, 9.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 24f)
            close()
            moveTo(10.01f, 3f)
            arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, 0.57f)
            curveTo(5.67f, 7.06f, 0.01f, 13.98f, 5.06f, 18.93f)
            arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.89f, 0f)
            curveToRelative(5.04f, -4.92f, -0.61f, -11.88f, -3.66f, -15.3f)
            arcTo(1.64f, 1.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.01f, 3f)
            close()
            moveTo(21.5f, 5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 5f)
            close()
        }
    }.also { _Dewpoint = it }
