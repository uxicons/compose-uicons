package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinHearts: ImageVector? = null

val Icons.Ss.GrinHearts: ImageVector
    get() = _GrinHearts ?: UXIcon(name = "GrinHearts") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.5f)
                curveToRelative(0.45f, -3.38f, 6.46f, -0.62f, 0f, 3.75f)
                curveToRelative(0f, 0f, -3f, -2f, -3f, -3.75f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 7f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.34f, 0f, -5.39f, -2.72f, -6.01f, -5f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveTo(17.39f, 16.28f, 15.34f, 19f, 12f, 19f)
                close()
                moveTo(16f, 12.25f)
                curveToRelative(-6.45f, -4.36f, -0.46f, -7.14f, 0f, -3.75f)
                curveTo(16.45f, 5.12f, 22.46f, 7.88f, 16f, 12.25f)
                close()
            }
        }.also { _GrinHearts = it}
