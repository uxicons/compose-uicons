package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Sr.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                curveToRelative(1.75f, 0f, 4.62f, 0.69f, 4.96f, 5.1f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.02f, 0.7f)
                curveToRelative(0.18f, 4.22f, -6.12f, 4.23f, -5.96f, 0.01f)
                arcTo(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.95f, 5.1f)
                curveTo(16.68f, 2.35f, 15.17f, 2f, 14f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 1f)
                close()
                moveTo(22.78f, 7.38f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.55f, 0.05f)
                arcTo(6.15f, 6.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.05f)
                curveTo(11.98f, 13.34f, 10.52f, 15f, 8.52f, 15f)
                curveToRelative(-0.59f, 0f, -3.61f, -0.06f, -4.51f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                curveToRelative(-0.19f, 7.49f, 5.13f, 12.99f, 12.22f, 13f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.63f)
                arcTo(6.33f, 6.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.78f, 7.38f)
                close()
                moveTo(12.22f, 24f)
                curveToRelative(-0.08f, 0f, 0.07f, 0f, 0f, 0f)
                close()
            }
        }.also { _Pepper = it}
