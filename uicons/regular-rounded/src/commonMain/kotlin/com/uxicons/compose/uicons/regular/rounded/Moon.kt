package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Rr.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.91f, -3.97f)
                arcToRelative(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.02f, -9.31f)
                arcTo(12.12f, 12.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.09f, 0.15f)
                arcToRelative(13.06f, 13.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.03f, 0.2f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 4.23f)
                curveToRelative(-4.56f, 4.17f, -4.16f, 10.64f, 0.81f, 14.41f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 4.32f)
                arcTo(13.89f, 13.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 24f)
                close()
                moveTo(15.08f, 2f)
                arcToRelative(10.79f, 10.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, 0.13f)
                arcToRelative(10.09f, 10.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.34f, 8.8f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.57f, 18.7f)
                arcTo(10.48f, 10.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.66f, 21.43f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, -0.86f)
                curveToRelative(-5.93f, -4.48f, -6.4f, -12.49f, -0.95f, -17.45f)
                arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, -0.47f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, -0.36f)
                arcTo(10.66f, 10.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.08f, 2f)
                close()
            }
        }.also { _Moon = it}
